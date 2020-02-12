import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Question extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question frame = new Question();
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
	public Question() {
		setTitle("Exam Suite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\tSelect Question");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 33));
		lblNewLabel.setBounds(164, 24, 312, 72);
		contentPane.add(lblNewLabel);
		
		JLabel javaimg = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/java.png")).getImage();
		javaimg.setIcon(new ImageIcon(img));
		javaimg.setBounds(86, 161, 146, 170);
		contentPane.add(javaimg);
		
		JLabel cprog = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/cprogram.png")).getImage();
		cprog.setIcon(new ImageIcon(img1));
		cprog.setBounds(323, 161, 197, 170);
		contentPane.add(cprog);
		
		JButton btnJava = new JButton("JAVA");
		btnJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaQues ques=new JavaQues();
				ques.setVisible(true);
			}
		});
		btnJava.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnJava.setBounds(109, 343, 89, 23);
		contentPane.add(btnJava);
		
		JButton btnCProgramming = new JButton("C Programming");
		btnCProgramming.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCProgramming.setBounds(323, 342, 125, 23);
		contentPane.add(btnCProgramming);
		
		JLabel label = new JLabel("\u00A9 copyright by Informals");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(467, 416, 148, 25);
		contentPane.add(label);
	}
}
