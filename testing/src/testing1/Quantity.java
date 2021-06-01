package testing1;

import javax.swing.JOptionPane;

public class Quantity {
	order order=new order();
	public int book_quantity;
	
	
	
	synchronized void userEntersQuantity(int num) {
		book_quantity=num;
	}
	synchronized void checkQuantity() {
		int total_quantity = 0;
		book_quantity=total_quantity-book_quantity;
		if(book_quantity<0)
			JOptionPane.showMessageDialog(null, "Books are out of stock");
	}
}
