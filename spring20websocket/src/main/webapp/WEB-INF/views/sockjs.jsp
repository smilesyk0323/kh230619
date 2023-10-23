<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <link rel="stylesheet" type="text/css"
   href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
   rel="stylesheet">
<link
   href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/sandstone/bootstrap.min.css"
   rel="stylesheet">
<!-- <link href="test.css" rel="stylesheet"> -->

<link rel="stylesheet" type="text/css"
   href="https://cdn.jsdelivr.net/npm/toastify-js/src/toastify.min.css">
<script type="text/javascript"
   src="https://cdn.jsdelivr.net/npm/toastify-js"></script>
<style>
	.btn-userlist{
		display: none;
	}
	.message-list{
		height: 65vh;
		overflow-y:scroll;
		scrollbar-width: thin;
   		scrollbar-color: #888 #f0f0f0;
	}
	  /* Webkit 브라우저(Chrome, Safari)의 스크롤바 스타일링 */
	  .message-list::-webkit-scrollbar {
	    width: 8px;
	  }
	  .message-list::-webkit-scrollbar-track {
	    background:  #f0f0f0;
	  }
	  .message-list::-webkit-scrollbar-thumb {
	    background-color:  #888;
	  }
	@media screen and (max-width:768px){
		.client-list{
			position : fixed;
			top:0;
			left:-250px;
			bottom:0;
			width:250px;
			z-index: 999999;
			padding-top: 90px; 
			transition: left 0.2s ease-out;
			background-color: white;
		}
		.client-list.active{
			left:0;
		}
		.btn-userlist{
		display: block;
		position:fixed;
		top: 1em; 
		right:1em;
		
		}
	}
</style>


<body>
	<div class="container-fulid">
	

		<div class="row mt-4">
			<div class="col">
				<h1>
					전체 채팅
					<button class="btn btn-primary btn-userlist"><i class="fa-solid fa-ellipsis-vertical"></i></button>
				</h1>
			</div>
		</div>
		
		<div class="row mt-4">
			<div class="col-md-4 client-list mt-2"></div>
			<div class="col-md-8 mt-2">
				
				<div class="row"><div class="col">
					<div class="input-group">
						<input type="text"class="form-control message-input"placeholder="메세지 내용 작성">
						<button type="button" class="btn btn-primary send-btn">보내기</button>
					</div>
						<!-- 메세지 수신 공간 -->
						<div class="message-list "></div>
				</div></div>
			</div>
		</div>
		
		
	</div>
</body>
    
    
    
    <!-- 웹소켓 서버가 SockJS일 경우 페이지에서도 SockJS를 사용해야 한다 -->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.1/sockjs.min.js"></script>
    <script>
    	var myId = "${sessionScope.name}";
    	//window.socket = new WebSocket(주소);
    	window.socket = new SockJS("${pageContext.request.contextPath}/ws/sockjs");
    	//연결 후 해야할 일들을 콜백함수로 지정(onopen, onclose, onerror, onmessage)
    	window.socket.onmessage = function(e){
    		//console.log(e);
    		var data = JSON.parse(e.data);
    		//console.log(data);
    		   		
    		//사용자가 접속하거나 종료했을 때 서버에서 오는 데이터로 목록을 갱신
    		//사용자가 메세지를 보냈을 때 서버에서 이를 전체에게 전달한다
    		//data.clients에 회원 목록이 있다
    		
    		if(data.clients){//목록처리
	    		$(".client-list").empty();
    		
    			var ul=$("<ul>").addClass("list-group");
	    		for(var i=0; i < data.clients.length; i++){
	    		      
	    			if(myId == data.clients[i].memberId){
	    				$("<li>").addClass("list-group-item d-flex justify-content-between align-items-center").text(data.clients[i].memberId)
						.append($("<span>").addClass("badge bg-danger rounded-pill").text(data.clients[i].memberLevel))	
						.appendTo(ul);
	    			}
	    			else{
		    			$("<li>").addClass("list-group-item d-flex justify-content-between align-items-center").text(data.clients[i].memberId)
		    						.append($("<span>").addClass("badge bg-primary rounded-pill").text(data.clients[i].memberLevel))	
		    						.appendTo(ul);  				
	    			}	    			
	    			
	    		}
	    		ul.appendTo(".client-list")
    		}
    		else if(data.content){//메세지 처리
    			  var memberId
	    			  if(data.dm == true){//DM이라면
	    				  if(myId == data.memberId){
	    					  memberId = $("<span>").text(data.target + "님에게 DM");
	    				  }
	    				  else{
	    				 	 memberId = $("<span>").text(data.memberId + " 님으로부터의 DM");	    					  
	    				  }
	    			  }
	    			  else{
	    				  memberId = $("<span>").text(data.memberId);
	    			  }
    		      var memberLevel = $("<span>").text(data.memberLevel).addClass("badge bg-secondary ms-1");
    		      var content = $("<div>").text(data.content).addClass("p-2 mt-1 border border-secondary rounded");
    		      
    			 if(myId==data.memberId){
    		         $("<div>").addClass("mt-4").addClass("text-end").append(memberId)
    		         .append(memberLevel)
    		         .append(content)
    		         .appendTo(".message-list");
    		         
    		         memberId.addClass("badge bg-danger");
    		         // 메세지를 보낸 후 스크롤바를 맨 아래로 이동
    		         var messageList = $(".message-list");
    	                messageList.scrollTop(messageList[0].scrollHeight);
    		         
    		      }
    		      else{
    		         $("<div>").addClass("mt-4")
    		                  .append(memberId)
    		                  .append(memberLevel)
    		                  .append(content)
    		                  .appendTo(".message-list");
    		         memberId.addClass("badge bg-primary");
    		      // 메세지를 보낸 후 스크롤바를 맨 아래로 이동
    		         var messageList = $(".message-list");
    	                messageList.scrollTop(messageList[0].scrollHeight);
    		      }
    		}
    	};
    	
    	
    	$(".btn-userlist").click(function() {
    	    $(".client-list").toggleClass("active");
    	});

    	$(".send-btn").click(function() {
    	    sendMessage();
    	});

    	$(".message-input").keypress(function(e) {
    	    if (e.which === 13) { // 13은 엔터 키의 키 코드
    	        sendMessage();
    	    }
    	});

    	//메세지를 전송하는 코드 
    	//- 메세지가 @로 시작하면 DM으로 처리(+아이디 유무 검사)
    	//- @아이디 메세지
    	function sendMessage() {
    	    var text = $(".message-input").val();
    	    if (text.length === 0) {
    	        return;
    	    }

    	    //window.socket.send(text);//일반 텍스트 형식으로 보낼때
    	    
    	    if(text.startsWith("@")){//@로 시작하면(DM)
    	    	var space = text.indexOf(" ");
    	    	if(space == -1) return;// 없으면 하지마
    	    	
    	    	var obj = {
    	    			target: text.substring(1,space),
    	    			content: text.substring(space+1)
    	    	};
	    	    var str=JSON.stringify(obj);//JSON을 문자열로 변환
	    	    window.socket.send(str);//JSON문자열
	    	    $(".message-input").val("");
	    	       
    	    }
    	    else{
	    	    var obj={
	    	            content:text
	    	    };	
	    	    var str=JSON.stringify(obj);//JSON을 문자열로 변환
	    	    window.socket.send(str);//JSON문자열
	    	    $(".message-input").val(""); 	    	
    	    }
    	    
    	}
		
    </script>
    
    
    
    
    
    