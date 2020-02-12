import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;


public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Exam Suite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStartExam = new JButton("Start Exam");
		btnStartExam.setForeground(new Color(204, 0, 255));
		btnStartExam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rule ques=new Rule();
				ques.setVisible(true);
			}
		});
		btnStartExam.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStartExam.setBounds(210, 74, 200, 52);
		contentPane.add(btnStartExam);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setForeground(new Color(204, 0, 255));
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnProfile.setBounds(210, 137, 200, 52);
		contentPane.add(btnProfile);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.setForeground(new Color(204, 102, 204));
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnChangePassword.setBounds(210, 200, 200, 52);
		contentPane.add(btnChangePassword);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(new Color(204, 102, 204));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogOut.setBounds(210, 264, 200, 52);
		contentPane.add(btnLogOut);
		
		JLabel label = new JLabel("\u00A9 copyright by Informals");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(472, 430, 148, 25);
		contentPane.add(label);
	}
}
