package jdbc.dto;

public class BoardDto {
		public int board_no;
		public String board_title;
		public String board_content;
		public String board_writer;
		public int board_readcount;
		public BoardDto() {
			super();
		}
		public int getBoard_no() {
			return board_no;
		}
		public void setBoard_no(int board_no) {
			this.board_no = board_no;
		}
		public String getBoard_title() {
			return board_title;
		}
		public void setBoard_title(String board_title) {
			this.board_title = board_title;
		}
		public String getBoard_content() {
			return board_content;
		}
		public void setBoard_content(String board_content) {
			this.board_content = board_content;
		}
		public String getBoard_writer() {
			return board_writer;
		}
		public void setBoard_writer(String board_writer) {
			this.board_writer = board_writer;
		}
		public int getBoard_readcount() {
			return board_readcount;
		}
		public void setBoard_readcount(int board_readcount) {
			this.board_readcount = board_readcount;
		}
		@Override
		public String toString() {
			return "BoardDto [board_no=" + board_no + ", board_title=" + board_title + ", board_content="
					+ board_content + ", board_writer=" + board_writer + ", board_readcount=" + board_readcount + "]";
		}
		
}
