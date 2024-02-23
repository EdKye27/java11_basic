package sec2;
//게시판 만들기
public class Board {
	
	//항목 만들어보기
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String author;
	private int visited;


	// 생성자함수 만들기
	public void Board() {}
	
	public void Board(int bno) {
		this.bno = bno;
	}
		
	public void Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	
	public void Board(int bno, String title, String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	
	public void Board(int bno, String title, String uname, String content) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
	}
	
	public void Board(int bno, String title, String uname, String content, String author) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
	}
	
	public void Board(int bno, String title, String uname, String content, String author, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
		this.visited = visited;
	}
	
	
	
	// getter and setter
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}

	
	// toString
	@Override
	public String toString() {
		return "board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", author="
				+ author + ", visited=" + visited + "]";
	}
	
	
}
