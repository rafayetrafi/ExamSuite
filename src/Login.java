import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.*;

import javax.swing.*;

import sun.awt.AWTAccessor.ToolkitAccessor;
import sun.awt.datatransfer.ToolkitThreadBlockedHandler;

import com.sun.media.sound.Toolkit;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class Login {

	private static final String WindowEvent = null;
	private JFrame frmExamSuite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmExamSuite.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	private JTextField Email;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection=sqliteconnection.dbconnector();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExamSuite = new JFrame();
		frmExamSuite.getContentPane().setForeground(new Color(255, 255, 255));
		frmExamSuite.setTitle("Exam Suite");
		frmExamSuite.setResizable(false);
		frmExamSuite.setBounds(100, 100, 821, 485);
		frmExamSuite.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExamSuite.getContentPane().setLayout(null);
		
		Email = new JTextField();
		Email.setBounds(44, 180, 289, 47);
		frmExamSuite.getContentPane().add(Email);
		Email.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(0, 0, 255));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(44, 137, 73, 17);
		frmExamSuite.getContentPane().add(lblEmail);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(44, 305, 289, 47);
		frmExamSuite.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(42, 252, 96, 17);
		frmExamSuite.getContentPane().add(lblPassword);
		
		JButton btnSignin = new JButton("Sign in");
		btnSignin.setForeground(new Color(0, 0, 0));
		btnSignin.setFont(new Font("Tahoma", Font.BOLD, 14));
		Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		btnSignin.setIcon(new ImageIcon(img));
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try{
					String query="select * from Rafi where email=? and password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, Email.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()){
						count=count+1;
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "Accepted");
						frmExamSuite.dispose();
						Main menu=new Main();
						menu.setVisible(true);
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate E-mail & Password");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Incorrect E-mail or Password");
					}
					rs.close();
					pst.close();
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
					
				}
			
			}
		});
		btnSignin.setBounds(447, 227, 181, 67);
		frmExamSuite.getContentPane().add(btnSignin);
		
		JLabel lbl4head = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/uit.jpg")).getImage();
		lbl4head.setIcon(new ImageIcon(img1));
		lbl4head.setBounds(0, 0, 815, 96);
		frmExamSuite.getContentPane().add(lbl4head);
		
		JLabel lblNewLabel = new JLabel("\u00A9 copyright by Informals");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(667, 432, 148, 25);
		frmExamSuite.getContentPane().add(lblNewLabel);
		
		JButton btnsignup = new JButton("Sign up");
		btnsignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Signup r=new Signup();
				r.setVisible(true);
			}
		});
		btnsignup.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnsignup.setBounds(637, 142, 168, 38);
		frmExamSuite.getContentPane().add(btnsignup);
		
		JLabel lblNewLabel_1 = new JLabel("New User . . . . !!");
		lblNewLabel_1.setForeground(new Color(51, 153, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(654, 107, 137, 38);
		frmExamSuite.getContentPane().add(lblNewLabel_1);
		Image img2=new ImageIcon(this.getClass().getResource("/image.png")).getImage();
	}
}
