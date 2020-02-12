import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.sql.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaQues extends JFrame {
	
	String query1;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaQues frame = new JavaQues();
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
	public JavaQues() {
		connection=Sqlconnectionans.dbconnector1();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Java Programming Exam");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblNewLabel.setBounds(133, 0, 659, 63);
		contentPane.add(lblNewLabel);
		
		JLabel q1 = new JLabel("1. Java source code compiled into  . . . . . . . ?");
		q1.setFont(new Font("Tahoma", Font.BOLD, 12));
		q1.setBounds(51, 135, 348, 41);
		contentPane.add(q1);
		
		JRadioButton ans1wr1 = new JRadioButton(".EXE");
		ans1wr1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			}
		});
		ans1wr1.setBounds(51, 181, 109, 23);
		contentPane.add(ans1wr1);
		
		JRadioButton ans1wr2 = new JRadioButton("Source Code");
		ans1wr2.setBounds(165, 183, 109, 23);
		contentPane.add(ans1wr2);
		
		JRadioButton ans1 = new JRadioButton("Byte code");
		ans1.setBounds(51, 213, 109, 23);
		contentPane.add(ans1);
		
		JRadioButton ans1wr3 = new JRadioButton(".Obj");
		ans1wr3.setBounds(165, 213, 109, 23);
		contentPane.add(ans1wr3);
		
		JLabel lblNewLabel_1 = new JLabel("2. Which of the tool is used to compile javacode ?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(51, 243, 348, 41);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton ans2wr1 = new JRadioButton("java");
		ans2wr1.setBounds(51, 283, 109, 23);
		contentPane.add(ans2wr1);
		
		JRadioButton ans2 = new JRadioButton("javac");
		ans2.setBounds(165, 283, 109, 23);
		contentPane.add(ans2);
		
		JRadioButton ans2wr2 = new JRadioButton("jar");
		ans2wr2.setBounds(51, 316, 109, 23);
		contentPane.add(ans2wr2);
		
		JRadioButton ans2wr3 = new JRadioButton("javadoc");
		ans2wr3.setBounds(165, 316, 109, 23);
		contentPane.add(ans2wr3);
		
		JLabel lblNewLabel_2 = new JLabel("3. HTML based java Documentary help can be accessed using . . . . . . ?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(51, 346, 432, 41);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton ans3 = new JRadioButton("javadoc");
		ans3.setBounds(51, 386, 109, 23);
		contentPane.add(ans3);
		
		JRadioButton ans3wr1 = new JRadioButton("javamanual");
		ans3wr1.setBounds(165, 386, 109, 23);
		contentPane.add(ans3wr1);
		
		JRadioButton ans3wr3 = new JRadioButton("javahelp");
		ans3wr3.setBounds(51, 426, 109, 23);
		contentPane.add(ans3wr3);
		
		JRadioButton ans3wr2 = new JRadioButton("None of this");
		ans3wr2.setBounds(165, 426, 109, 23);
		contentPane.add(ans3wr2);
		
		JLabel lblNewLabel_3 = new JLabel("4. Java stands for . . . . . . . . . ?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(51, 458, 399, 41);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton ans4wr1 = new JRadioButton("Java application runner");
		ans4wr1.setBounds(51, 498, 137, 23);
		contentPane.add(ans4wr1);
		
		JRadioButton ans4wr2 = new JRadioButton("None of this");
		ans4wr2.setBounds(190, 498, 109, 23);
		contentPane.add(ans4wr2);
		
		JRadioButton ans4 = new JRadioButton("Java Archive");
		ans4.setBounds(51, 532, 109, 23);
		contentPane.add(ans4);
		
		JRadioButton ans4wr3 = new JRadioButton("Java Archive Runner");
		ans4wr3.setBounds(190, 532, 125, 23);
		contentPane.add(ans4wr3);
		
		JLabel lblNewLabel_4 = new JLabel("5. Which of the following is not a keyword ?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(51, 562, 348, 41);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton ans5wr1 = new JRadioButton("strictfp");
		ans5wr1.setBounds(51, 610, 109, 23);
		contentPane.add(ans5wr1);
		
		JRadioButton ans5wr2 = new JRadioButton("instanceof");
		ans5wr2.setBounds(165, 610, 109, 23);
		contentPane.add(ans5wr2);
		
		JRadioButton ans5wr3 = new JRadioButton("transient");
		ans5wr3.setBounds(51, 644, 109, 23);
		contentPane.add(ans5wr3);
		
		JRadioButton ans5 = new JRadioButton("emun");
		ans5.setBounds(165, 644, 109, 23);
		contentPane.add(ans5);
		
		JLabel lblNewLabel_5 = new JLabel("6. Which Class can not be a subclass in java ?");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(495, 131, 424, 41);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton ans6wr1 = new JRadioButton("Abstract class");
		ans6wr1.setBounds(505, 181, 109, 23);
		contentPane.add(ans6wr1);
		
		JRadioButton ans6wr2 = new JRadioButton("Parent class");
		ans6wr2.setBounds(646, 181, 109, 23);
		contentPane.add(ans6wr2);
		
		JRadioButton ans6 = new JRadioButton("Final class");
		ans6.setBounds(505, 213, 109, 23);
		contentPane.add(ans6);
		
		JRadioButton ans6wr3 = new JRadioButton("None of above");
		ans6wr3.setBounds(646, 213, 109, 23);
		contentPane.add(ans6wr3);
		
		JLabel lblNewLabel_6 = new JLabel("7. Can we declare abstract static method ?");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(491, 252, 311, 23);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton ans7wr1 = new JRadioButton("Yes");
		ans7wr1.setBounds(505, 283, 109, 23);
		contentPane.add(ans7wr1);
		
		JRadioButton ans7 = new JRadioButton("No");
		ans7.setBounds(505, 316, 109, 23);
		contentPane.add(ans7);
		
		JLabel lblNewLabel_7 = new JLabel("8. Can we access private class outside the package ?");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(493, 360, 348, 23);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton ans8wr1 = new JRadioButton("Yes");
		ans8wr1.setBounds(489, 386, 109, 23);
		contentPane.add(ans8wr1);
		
		JRadioButton ans8 = new JRadioButton("No");
		ans8.setBounds(489, 426, 109, 23);
		contentPane.add(ans8);
		
		JLabel lblNewLabel_8 = new JLabel("9. Runnable is . . . . . . . . . ?");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(495, 458, 348, 41);
		contentPane.add(lblNewLabel_8);
		
		JRadioButton ans9wr1 = new JRadioButton("Class");
		ans9wr1.setBounds(489, 498, 109, 23);
		contentPane.add(ans9wr1);
		
		JRadioButton ans9wr2 = new JRadioButton("Variable");
		ans9wr2.setBounds(646, 498, 109, 23);
		contentPane.add(ans9wr2);
		
		JRadioButton ans9wr3 = new JRadioButton("Method");
		ans9wr3.setBounds(491, 532, 109, 23);
		contentPane.add(ans9wr3);
		
		JRadioButton ans9 = new JRadioButton("Interface");
		ans9.setBounds(646, 532, 109, 23);
		contentPane.add(ans9);
		
		JLabel lblNewLabel_9 = new JLabel("10. Java beans have no types ?");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(495, 576, 348, 23);
		contentPane.add(lblNewLabel_9);
		
		JRadioButton ans10 = new JRadioButton("Yes");
		ans10.setBounds(491, 610, 109, 23);
		contentPane.add(ans10);
		
		JRadioButton ans10wr1 = new JRadioButton("No");
		ans10wr1.setBounds(491, 644, 109, 23);
		contentPane.add(ans10wr1);
		
		JLabel lblNewLabel_10 = new JLabel("Time : 10 min    Marks: 10");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(771, 71, 148, 49);
		contentPane.add(lblNewLabel_10);
		
		JButton save = new JButton("Save");
		save.setFont(new Font("Tahoma", Font.BOLD, 15));
		save.setBounds(347, 679, 148, 23);
		contentPane.add(save);
		
		JLabel label = new JLabel("\u00A9 copyright by Informals");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(781, 698, 148, 25);
		contentPane.add(label);
	}

	public static void DISPOSE_ON_CLOSE() {
		// TODO Auto-generated method stub
		
	}
}
