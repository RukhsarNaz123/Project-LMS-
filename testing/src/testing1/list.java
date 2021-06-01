package testing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class list {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list window = new list();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public list() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 535, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Available Books");
		lblNewLabel.setFont(new Font("Vivian", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setBounds(0, 0, 521, 63);
		frame.getContentPane().add(lblNewLabel);
		
		
		String x[] = {"Book Name","Author Name","Qauntity","Price"};
		String y[][]= new String[20][4];
		int i=0,j=0;
		
		try {
			Conn c= new Conn();
			String qy = "select * from Books;";
			ResultSet rs = c.s.executeQuery(qy);
			while(rs.next()) {
				y[i][j++]=rs.getString("BookName");
				y[i][j++]=rs.getString("AuthorName");
				y[i][j++]=rs.getString("Quantity");
				y[i][j++]=rs.getString("Price");
				i++;
				j=0;
			}
			
		}catch(Exception e) {JOptionPane.showMessageDialog(null, e);}
		JTable table1 = new JTable(y,x);
		table1.setRowSelectionAllowed(false);
		JScrollPane sp = new JScrollPane(table1);
		sp.setBounds(22,68,446,330);
		frame.getContentPane().add(sp);
		
		JButton btnNewButton = new JButton("OrderNow");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				testing1.order.main(null);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(348, 426, 120, 39);
		frame.getContentPane().add(btnNewButton);
		
	}
}
