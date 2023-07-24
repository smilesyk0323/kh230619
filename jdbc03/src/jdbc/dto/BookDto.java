package jdbc.dto;

public class BookDto {
		private int bookId;
		private String bookTitle;
		private String bookAuthor;
		private String bookPublication_date;
		private float bookPrice;
		private String bookPublisher;
		private int bookPageCount;
		private String bookGenre;
		public BookDto() {
			super();
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookTitle() {
			return bookTitle;
		}
		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}
		public String getBookAuthor() {
			return bookAuthor;
		}
		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}
		public String getBookPublication_date() {
			return bookPublication_date;
		}
		public void setBookPublication_date(String bookPublication_date) {
			this.bookPublication_date = bookPublication_date;
		}
		public float getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(float bookPrice) {
			this.bookPrice = bookPrice;
		}
		public String getBookPublisher() {
			return bookPublisher;
		}
		public void setBookPublisher(String bookPublisher) {
			this.bookPublisher = bookPublisher;
		}
		public int getBookPageCount() {
			return bookPageCount;
		}
		public void setBookPageCount(int bookPageCount) {
			this.bookPageCount = bookPageCount;
		}
		public String getBookGenre() {
			return bookGenre;
		}
		public void setBookGenre(String bookGenre) {
			this.bookGenre = bookGenre;
		}
		@Override
		public String toString() {
			return "BookDto [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
					+ ", bookPublication_date=" + bookPublication_date + ", bookPrice=" + bookPrice + ", bookPublisher="
					+ bookPublisher + ", bookPageCount=" + bookPageCount + ", bookGenre=" + bookGenre + "]";
		}
		
		

		
		
}
