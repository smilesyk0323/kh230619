package com.kh.springhome.dto;

import lombok.Data;

@Data
public class BoardDto {
       private int boardNo;
       private String boardWriter;
       private String boardTitle;
       private String boardContent;
       private int boardReadcount;
       private int boardLikecount;
       private int boardReplycount;
       private String boardCtime;
       private String boardUtime;
}
