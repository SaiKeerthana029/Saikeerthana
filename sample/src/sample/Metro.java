package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metro {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metro window = new Metro();
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
	public Metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 906, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(268, 10, 335, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(68, 132, 96, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(68, 201, 96, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(68, 250, 154, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NO.OF TICKETS :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(68, 307, 165, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		T1 = new JTextField();
		T1.setBounds(307, 132, 198, 41);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"HITECH CITY", "PARADISE", "JUBI HILLS", "SECURABAD"}));
		CB1.setBounds(307, 190, 198, 41);
		frame.getContentPane().add(CB1);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"MIYAPUR", "UPPAL", "LB NAGAR", "STADIUM"}));
		CB2.setBounds(307, 248, 198, 41);
		frame.getContentPane().add(CB2);
		
		JComboBox CB3 = new JComboBox();
		CB3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		CB3.setBounds(307, 307, 198, 41);
		frame.getContentPane().add(CB3);
		
		JButton B1 = new JButton("SUBMIT");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=T1.getText();
				String Source=(String) CB1.getSelectedItem();
				String Destination=(String) CB2.getSelectedItem();
				String Tickets =(String) CB3.getSelectedItem();
				int nt=Integer.ParseInt(Tickets);
				int bill=0;
				if(Source.e)
				
			}
		});
		B1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		B1.setBounds(307, 391, 198, 48);
		frame.getContentPane().add(B1);
	}

}
