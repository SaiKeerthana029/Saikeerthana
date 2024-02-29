package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ECOMMERCE {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOMMERCE window = new ECOMMERCE();
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
	public ECOMMERCE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERC  APP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(316, 10, 225, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+1;
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\saike\\OneDrive\\Desktop\\817BsplxI9L.jpg"));
		btnNewButton.setBounds(88, 91, 210, 258);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\saike\\OneDrive\\Desktop\\81Lfw-skUsL._AC_UF1000,1000_QL80_.jpg"));
		btnNewButton_1.setBounds(355, 91, 186, 258);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\saike\\OneDrive\\Desktop\\canva-brown-rusty-mystery-novel-book-cover-hG1QhA7BiBU.jpg"));
		lblNewLabel_1.setBounds(593, 91, 186, 258);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("22$");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_2.setBounds(141, 392, 113, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("39$");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 31));
		lblNewLabel_3.setBounds(424, 391, 72, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("59$");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_4.setBounds(650, 390, 80, 37);
		frame.getContentPane().add(lblNewLabel_4);
		frame.setBounds(100, 100, 860, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
