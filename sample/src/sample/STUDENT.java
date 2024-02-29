package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class STUDENT {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENT window = new STUDENT();
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
	public STUDENT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(57, 109, 100, 69);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(57, 164, 100, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADDRESS :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(57, 226, 136, 52);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MARKS :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(57, 288, 100, 45);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("STUDENT DETAILS");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_4.setBounds(289, 32, 260, 45);
		frame.getContentPane().add(lblNewLabel_4);
		
		T1 = new JTextField();
		T1.setBounds(241, 109, 202, 45);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(241, 170, 202, 45);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(241, 226, 202, 52);
		frame.getContentPane().add(T3);
		T3.setColumns(10);
		
		T4 = new JTextField();
		T4.setColumns(10);
		T4.setBounds(241, 303, 202, 45);
		frame.getContentPane().add(T4);
		
		JButton B1 = new JButton("SUBMIT");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		B1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		B1.setBounds(262, 372, 162, 45);
		frame.getContentPane().add(B1);
		frame.setBounds(100, 100, 876, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
