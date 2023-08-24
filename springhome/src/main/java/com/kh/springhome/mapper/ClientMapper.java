package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kh.springhome.dto.ClientDto;

public class ClientMapper implements RowMapper<ClientDto>{
	@Override//회원
	public ClientDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClientDto clientDto = new ClientDto();
		clientDto.setClientId(rs.getString("client_id"));
		clientDto.setClientPassword(rs.getString("client_password"));
		clientDto.setClientNickname(rs.getString("client_nickname"));
		clientDto.setClientGrade(rs.getString("client_grade"));
		clientDto.setClientJoin(rs.getDate("client_join"));
		clientDto.setClientPoint(rs.getInt("client_point"));	
		return clientDto;
	}
}
