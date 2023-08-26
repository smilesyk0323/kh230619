package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kh.springhome.dto.ItemDto;

public class ItemMapper implements RowMapper<ItemDto>{
	@Override//상품
	public ItemDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ItemDto itemDto = new ItemDto();
		itemDto.setItemNo(rs.getInt("item_no"));
		itemDto.setItemName(rs.getString("item_name"));
		itemDto.setItemPrice(rs.getInt("item_price"));
		itemDto.setItemRegist(rs.getDate("item_regist"));
		return itemDto;
	}
}
