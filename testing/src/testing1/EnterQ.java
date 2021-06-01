package testing1;

public class EnterQ extends Thread{
	int num;
	EnterQ(int num){
		this.num=num;
	}
	Quantity ob=new Quantity();
	
	public void run() {
		ob.userEntersQuantity(num);
	}
}
