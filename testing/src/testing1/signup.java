package testing1;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class signup {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtPassword;
	private JPasswordField passwordField;
	private JTextField txtWelcomeToHrt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("Username");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField.setColumns(10);
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(27, 48, 117, 28);
		frame.getContentPane().add(textField);
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone#");
		txtPhone.setForeground(Color.WHITE);
		txtPhone.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPhone.setColumns(10);
		txtPhone.setBackground(new Color(0, 0, 128));
		txtPhone.setBounds(27, 86, 117, 28);
		frame.getContentPane().add(txtPhone);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtEmail.setColumns(10);
		txtEmail.setBackground(new Color(0, 0, 128));
		txtEmail.setBounds(27, 124, 117, 28);
		frame.getContentPane().add(txtEmail);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPassword.setColumns(10);
		txtPassword.setBackground(new Color(0, 0, 128));
		txtPassword.setBounds(27, 162, 117, 28);
		frame.getContentPane().add(txtPassword);
		
		JFormattedTextField userNameField = new JFormattedTextField();
		userNameField.setForeground(Color.WHITE);
		userNameField.setBackground(new Color(0, 0, 128));
		userNameField.setBounds(189, 48, 185, 30);
		frame.getContentPane().add(userNameField);
		
		JFormattedTextField phoneNumberField = new JFormattedTextField();
		phoneNumberField.setForeground(Color.WHITE);
		phoneNumberField.setBackground(new Color(0, 0, 128));
		phoneNumberField.setBounds(189, 87, 185, 30);
		frame.getContentPane().add(phoneNumberField);
		
		JFormattedTextField emailField = new JFormattedTextField();
		emailField.setForeground(Color.WHITE);
		emailField.setBackground(new Color(0, 0, 128));
		emailField.setBounds(189, 125, 185, 30);
		frame.getContentPane().add(emailField);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(new Color(0, 0, 128));
		passwordField.setBounds(189, 164, 185, 28);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Next");

			
		Conn conString = new Conn();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Conn c = new Conn();
					String query = "insert into id values('"+userNameField.getText()+"','"+phoneNumberField.getText()+"','"+passwordField.getText()+"','"+emailField.getText()+"')";
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Submitted Successfully!");
					frame.dispose();
					testing1.list.main(null);
				}catch(Exception ex) {}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(153, 202, 95, 33);
		frame.getContentPane().add(btnNewButton);
		
		txtWelcomeToHrt = new JTextField();
		txtWelcomeToHrt.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToHrt.setFont(new Font("Vivian", Font.BOLD, 21));
		txtWelcomeToHrt.setText("Welcome to HRT Library");
		txtWelcomeToHrt.setForeground(new Color(255, 255, 255));
		txtWelcomeToHrt.setBackground(new Color(0, 0, 128));
		txtWelcomeToHrt.setBounds(0, 0, 436, 38);
		frame.getContentPane().add(txtWelcomeToHrt);
		txtWelcomeToHrt.setColumns(10);
	}
}
