package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.mapper.BoardListMapper;
import com.kh.springhome.mapper.BoardMapper;

@Repository
public class BoardDaoImpl implements BoardDao{
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private BoardMapper detailMapper;
		
		@Autowired
		private BoardListMapper listMapper;
		
		//등록 [1]번호 생성 
		@Override
		public int sequence(){
			String sql = "select board_seq.nextval from dual";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
		
		//등록
		@Override
		public void insert(BoardDto dto) {
			String sql = "insert into board("
					+ "board_no, board_title, board_content, "
					+ "board_writer) values(?,?,?,?)";
			Object[] data = {
					dto.getBoardNo(), dto.getBoardTitle(),
					dto.getBoardContent(), dto.getBoardWriter()
			};
			jdbcTemplate.update(sql,data);
		}
		
		@Override
		public List<BoardDto> selectList(){
			String sql = "select "
					+ "board_no, board_write, board_title, "
					+ "board_readcount, board_likecount, "
					+ "board_Replycount, board_ctime, "
					+ "board_utime "
					+ "from board order by board_no desc";
			return jdbcTemplate.query(sql, listMapper);
		}
		

}
