package testing1;

public class FinalOrder {
	final String bookname,username,address,email;
	final String number;
	order b=new order();
	FinalOrder(String bookname, String username,String email,String address,String number){
		this.bookname = bookname;
		this.username=username;
		this.address=address;
		this.email=email;
		this.number=number;
		
	}
	public String getBookName() {
		return bookname;
	}
	public String getUserName() {
		return username;}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getNumber() {
		return number;
	}

}
