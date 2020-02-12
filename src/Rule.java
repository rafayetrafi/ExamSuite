import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;




public class Rule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rule frame = new Rule();
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
	public Rule() {
		setTitle("Exam Suite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rules:");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 45));
		lblNewLabel.setBounds(101, 52, 167, 57);
		contentPane.add(lblNewLabel);
		
		JLabel label_Rule = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/aero.png")).getImage();
		label_Rule.setIcon(new ImageIcon(img));
		
		label_Rule.setBounds(23, 52, 83, 57);
		contentPane.add(label_Rule);
		
		JLabel lblNewLabel_1 = new JLabel("1) Select any subject on the Sections page to continue the test.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(111, 120, 442, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2) Each test consist of 10 questions.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(110, 161, 442, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3) 1 marks for each correct answer.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(111, 197, 442, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("4 )You have 10 minute to complete the Test.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(110, 238, 443, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Note : Please Click on the Next Button to go to next page.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(44, 326, 508, 66);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setForeground(new Color(51, 102, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Question ques=new Question();
				ques.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(464, 349, 167, 43);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\u00A9 copyright by Informals");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(586, 429, 148, 25);
		contentPane.add(label);
	}

}
