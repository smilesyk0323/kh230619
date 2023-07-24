package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.BookDto;

public class BookMapper implements RowMapper<BookDto>{

	@Override
	public BookDto mapRow(ResultSet rs, int idx) throws SQLException {
		BookDto dto = new BookDto();
		dto.setBook_id(rs.getInt("book_id"));
		dto.setBook_title(rs.getString("book_title"));
		dto.setBook_publication_date(rs.getString("book_publication_date"));
		dto.setBook_price(rs.getInt("book_price"));
		dto.setBook_publisher(rs.getString("book_publisher"));
		dto.setBook_page_count(rs.getInt("book_page_count"));
		dto.setBook_genre(rs.getString("book_genre"));
		return dto;
	}

}
