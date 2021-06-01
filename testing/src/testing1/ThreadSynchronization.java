package testing1;

public class ThreadSynchronization {
	int qua;
	public ThreadSynchronization(int qua) {
		this.qua=qua;
	}
	public void twoThreads() {
		Thread t1=new EnterQ(qua);
		Thread t2=new CheckQuantity();
		t1.start();
		t2.start();
		
	}
}
