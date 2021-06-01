package testing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class frame {

	private JFrame frame;
	private JTextField txtLibraryManagementSystem;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JPasswordField passwordField;
	private JButton btnCreate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame window = new frame();
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
	public frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLibraryManagementSystem = new JTextField();
		txtLibraryManagementSystem.setBounds(0, 0, 436, 38);
		txtLibraryManagementSystem.setForeground(Color.WHITE);
		txtLibraryManagementSystem.setBackground(new Color(0, 0, 128));
		txtLibraryManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		txtLibraryManagementSystem.setFont(new Font("Vivian", Font.BOLD, 21));
		txtLibraryManagementSystem.setText("LIBRARY MANAGEMENT SYSTEM");
		frame.getContentPane().add(txtLibraryManagementSystem);
		txtLibraryManagementSystem.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setEditable(false);
		txtUsername.setBounds(70, 76, 117, 28);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setBackground(new Color(0, 0, 128));
		txtUsername.setText("Username");
		txtUsername.setFont(new Font("Times New Roman", Font.BOLD, 17));
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setEditable(false);
		txtPassword.setBounds(70, 129, 117, 28);
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setBackground(new Color(0, 0, 128));
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtPassword.setText("Password");
		txtPassword.setColumns(10);
		frame.getContentPane().add(txtPassword);
		
		JFormattedTextField usernameField = new JFormattedTextField();
		usernameField.setBounds(197, 76, 185, 30);
		usernameField.setForeground(Color.WHITE);
		usernameField.setBackground(new Color(0, 0, 128));
		frame.getContentPane().add(usernameField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 131, 185, 28);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(new Color(0, 0, 128));
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(84, 184, 94, 39);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 128));
		
		Conn conString = new Conn();
		String query = "select * from id;";
		String userName[] = new String[10];
		String password[] = new String[10];
		try {
			int i=0;
			ResultSet rs = conString.s.executeQuery(query);
			while(rs.next()) {
				userName[i]=rs.getString("userName");
				password[i]=rs.getString("password");
				i++; 
				
			}
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int temp=0;
				for(int i=0;i<userName.length;i++)
				{
					if(usernameField.getText().equalsIgnoreCase(userName[i])&&passwordField.getText().equalsIgnoreCase(password[i])) {
						frame.dispose();
						testing1.list.main(null);
						break;
					}else {
						temp++;
					}
				}
				if(temp>0) {
				JOptionPane.showMessageDialog(null, "Incorrect password or username");
				}
	         }
	         }

			
		
		);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		frame.getContentPane().add(btnNewButton);
		btnCreate = new JButton("SignUp");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				testing1.signup.main(null);

			}
		});
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnCreate.setBackground(new Color(0, 0, 128));
		btnCreate.setBounds(240, 184, 94, 39);
		frame.getContentPane().add(btnCreate);
	}
}
