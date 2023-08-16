package com.kh.springhome.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDto {
       private int boardNo;//DB의 대부분은 long으로 함.. 
       private String boardWriter;
       private String boardTitle;
       private String boardContent;
       private int boardReadcount;
       private int boardLikecount;
       private int boardReplycount;
       private Date boardCtime;
       private Date boardUtime;
}
