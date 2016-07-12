package prob3;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo,String title,String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getStateCode() {
		return stateCode;
	}
	
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	// 대여기능을 수행하는 메소드
	public void rent(){
		stateCode = 0;
		System.out.println(getTitle() + "이(가) 대여됐습니다.");
	}
	
	// 책의 정보 출력
	public void print(){
		System.out.print("책 제목:" + getTitle() + ", 작가:" + getAuthor() + ", 대여 유무:");
		if(stateCode == 1){
			System.out.print("재고 있음\n");
		} else{
			System.out.print("대여중\n");
		}
	}

}
