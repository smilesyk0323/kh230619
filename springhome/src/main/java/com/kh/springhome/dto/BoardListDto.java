package com.kh.springhome.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

//오로지 게시판 목록을 위한 DTO
@Data
public class BoardListDto {
		private String memberNickname;
	       private int boardNo;//DB의 대부분은 long으로 함.. 
	       private String boardWriter;
	       private String boardTitle;
	       private int boardReadcount;
	       private int boardLikecount;
	       private int boardReplycount;
	       private Date boardCtime;
	       private Date boardUtime;
	       
	       //작성자 출력용 메소드 
	       public String getBoardWriterString() {
	    	   if(boardWriter == null) 
	    		   return "(탈퇴한사용자)";
	    	   return memberNickname;
	       }
	       
	       //날짜에 따라 다른 값을 반환하는 메소드 
	       public String getBoardCtimeString() {
	    	   LocalDate current = LocalDate.now();//현재날짜
	    	   LocalDate ctime = boardCtime.toLocalDate();//작성일  			   
			    	   if(ctime.equals(current)) {//작성일 ==오늘 
			    		   Timestamp stamp = new Timestamp(boardCtime.getTime());
			    		   LocalDateTime time = stamp.toLocalDateTime();
			    		   LocalTime result  = time.toLocalTime();
			    		   return result.format(DateTimeFormatter.ofPattern("HH:mm"));//시간을 반환  		   
			    	   }
			    	   else {
			    		   return ctime.toString();//날짜를 반환
			    	   }
	       }
}
