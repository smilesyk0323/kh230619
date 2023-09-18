package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.CertDto;
import com.kh.springhome.mapper.CertMapper;

@Repository
public class CertDaoImpl implements CertDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CertMapper certMapper;

	@Override
	public void insert(CertDto certDto) {//이메일+인증번호
		String sql = "insert into cert(cert_email, cert_number) values(?,?)";
		Object[] data = {certDto.getCertEmail(),certDto.getCertNumber()};
		jdbcTemplate.update(sql,data);
	}

	@Override
	public boolean delete(String certEmail) {
		String sql = "delete cert where cert_email = ?";
		Object[] data = {certEmail};
		return jdbcTemplate.update(sql,data)>0;
	}

	@Override
	public CertDto selectOne(String certEmail) {
		String sql = "select * from cert where cert_email = ?";
		Object[] data = {certEmail};
		List<CertDto> list = jdbcTemplate.query(sql,certMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

}










