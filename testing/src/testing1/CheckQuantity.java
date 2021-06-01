package testing1;

public class CheckQuantity extends Thread{
	
	Quantity ob=new Quantity();
	public void run() {
		ob.checkQuantity();
	}
}
