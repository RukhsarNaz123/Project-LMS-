package testing1;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class order {
	

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtQuantuty;
	private JTextField txtPhone;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField quantityField;
	private JTextField textField_10;
	private JTextField txtOrderBook;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order window = new order();
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
	public order() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 618, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(31, 74, 130, 32);
		textField.setText("Book Name");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(0, 0, 128));
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Author Name");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setBounds(31, 116, 130, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Username");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(0, 0, 128));
		textField_2.setBounds(31, 157, 130, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Gmail");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(0, 0, 128));
		textField_3.setBounds(31, 199, 130, 32);
		frame.getContentPane().add(textField_3);
		
		txtQuantuty = new JTextField();
		txtQuantuty.setText("Quantity");
		txtQuantuty.setForeground(Color.WHITE);
		txtQuantuty.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtQuantuty.setColumns(10);
		txtQuantuty.setBackground(new Color(0, 0, 128));
		txtQuantuty.setBounds(31, 241, 130, 32);
		frame.getContentPane().add(txtQuantuty);
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone no");
		txtPhone.setForeground(Color.WHITE);
		txtPhone.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtPhone.setColumns(10);
		txtPhone.setBackground(new Color(0, 0, 128));
		txtPhone.setBounds(31, 283, 130, 32);
		frame.getContentPane().add(txtPhone);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.WHITE);
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(0, 0, 128));
		textField_6.setBounds(192, 116, 349, 32);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.WHITE);
		textField_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(0, 0, 128));
		textField_7.setBounds(192, 157, 349, 32);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setForeground(Color.WHITE);
		textField_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(0, 0, 128));
		textField_8.setBounds(192, 199, 349, 32);
		frame.getContentPane().add(textField_8);
		
		quantityField = new JTextField();
		quantityField.setForeground(Color.WHITE);
		quantityField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		quantityField.setColumns(10);
		quantityField.setBackground(new Color(0, 0, 128));
		quantityField.setBounds(192, 241, 349, 32);
		frame.getContentPane().add(quantityField);
		
		textField_10 = new JTextField();
		textField_10.setForeground(Color.WHITE);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(0, 0, 128));
		textField_10.setBounds(192, 283, 349, 32);
		frame.getContentPane().add(textField_10);
		
		JButton btnNewButton = new JButton("Confirm Order\r\n");
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThreadSynchronization obj = new ThreadSynchronization(Integer.parseInt(quantityField.getText()));

	            if(JOptionPane.showConfirmDialog (null, "Confirm your order?","WARNING", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
	            	JOptionPane.showMessageDialog(null, "Order placed succesfully");
	            	frame.dispose();
	            	testing1.frame.main(null);
	            }
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(192, 341, 171, 43);
		frame.getContentPane().add(btnNewButton);
		
		txtOrderBook = new JTextField();
		txtOrderBook.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrderBook.setText("Order Book");
		txtOrderBook.setForeground(Color.WHITE);
		txtOrderBook.setFont(new Font("Vivian", Font.BOLD, 21));
		txtOrderBook.setColumns(10);
		txtOrderBook.setBackground(new Color(0, 0, 128));
		txtOrderBook.setBounds(0, 0, 604, 57);
		frame.getContentPane().add(txtOrderBook);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(0, 0, 128));
		textField_4.setBounds(192, 74, 349, 32);
		frame.getContentPane().add(textField_4);
	}
}
