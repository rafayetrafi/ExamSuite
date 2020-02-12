import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JTextField password;
	private JTextField birth;
	private JTextField instituation;
	private JTextField mobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	/**
	 * Create the frame.
	 */
	public Signup() {
		connection=sqliteconnection.dbconnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setForeground(new Color(51, 102, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblNewLabel.setBounds(165, 0, 336, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(34, 143, 159, 40);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(236, 140, 336, 46);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(34, 214, 159, 40);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(236, 211, 336, 46);
		contentPane.add(email);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(236, 278, 336, 46);
		contentPane.add(password);
		
		birth = new JTextField();
		birth.setColumns(10);
		birth.setBounds(236, 349, 336, 46);
		contentPane.add(birth);
		
		instituation = new JTextField();
		instituation.setColumns(10);
		instituation.setBounds(236, 419, 336, 46);
		contentPane.add(instituation);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(34, 281, 159, 40);
		contentPane.add(lblPassword);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDateOfBirth.setBounds(34, 355, 159, 40);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblInstituation = new JLabel("Instituation");
		lblInstituation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInstituation.setBounds(34, 425, 159, 40);
		contentPane.add(lblInstituation);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(236, 483, 336, 46);
		contentPane.add(mobile);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMobile.setBounds(34, 489, 159, 40);
		contentPane.add(lblMobile);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="insert into Rafi(name,Birth,phone,instituation,email,password) values(?,?,?,?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, name.getText());
					pst.setString(2, birth.getText());
					pst.setString(3, mobile.getText());
					pst.setString(4, instituation.getText());
					pst.setString(5, email.getText());
					pst.setString(6, password.getText());
					
					
					
					
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Saved");
					pst.close();
					
					
				}catch(Exception f)
				{
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(251, 554, 153, 50);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\u00A9 copyright by Informals");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(504, 590, 148, 25);
		contentPane.add(label);
	}
}
