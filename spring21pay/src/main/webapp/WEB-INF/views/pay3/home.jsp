<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
    <link rel="stylesheet" type="text/css"href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/yeti/bootstrap.min.css" rel="stylesheet">

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-10 offset-md-1">
            
						<div class="row">
                        <div class="col-4 offset-4 mt-5 text-center btn btn-success disabled ">
                            <h1 class="pt-2"> 상품 목록 </h1>
                        </div></div>

                        <div class="row">
                        <div class="col-8 offset-2 mt-4 mb-3" >
                            <fieldset class="form-group product-list ">
                   
                                <c:forEach var="productDto" items="${list}">
                                	<div class="row mb-2 product-item">
                                	<div class="col-10">
	                                    <div class="form-check">
	                                    		<div class="row">
	                                    			<div class="col-1">
				                                    <input name="productNo" class="form-check-input" type="checkbox" value="${productDto.productNo}" id="flexCheckDefault">
						                                    <label class="form-check-label" for="flexCheckDefault">			                                    			                                    		
						                                    </label>	                                    		
	                                    			</div>
	                                    			<div class="col-11">
	                                    			<div class="row">
				                                        <div class="col-8 text-start">${productDto.productName} </div>
				                                        <div class="col-4 text-end">${productDto.productPrice}원</div>
	                                    			</div>
	                                    			</div>
	                                    		</div>
	                                    </div>
                                	</div>
                                	
                                   	<div class="col-2 text-end ">
                                    	<input type="number" name="qty" value="1"min="1" class="w-100 form-control" >
                                   	</div>
                                   	</div>
                                </c:forEach>
 
                            </fieldset>
                        </div></div>

                        <div class="col-6 offset-3 text-center mb-5">
                            <button type="button" class="purchase-btn btn  btn-outline-success">구매하기</button>
                        </div>


            </div>
        </div>
        
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
$(function(){
	//버튼 누르면 폼을 만들어서 체크된 항목의 "상품번호"와 "구매수량"을 입력창으로 만들어 추가
	$(".purchase-btn").click(function(){
		var form = $("<form>").attr("action","test3/purchase").attr("method","get");
		
		var count = 0;
		
		$(".product-item").each(function(index, tag){
			//현재 위치의 체크박스가 체크되어 있다면 상품번호와 상품수량을 
			var checked = $(this).find("[name=productNo]").prop("checked");
			if(checked == false) return;
			
			var productNo =  $(this).find("[name=productNo]").val();
			var qty =  $(this).find("[name=qty]").val();
			
			$("<input>").attr("name","product["+count+"].productNo")
								.attr("type", "hidden")
								.val(productNo)
								.appendTo(form);
			$("<input>").attr("name","product["+count+"].qty")
								.attr("type", "hidden")
								.val(qty)
								.appendTo(form);
			count++;
		});
		
		$("body").append(form);
		form.submit();//form 전송해라!
	});
});
</script>












