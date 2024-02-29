package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField TB1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 639, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(137, 23, 145, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(46, 93, 89, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(46, 142, 89, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(46, 252, 89, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		TB1 = new JTextField();
		TB1.setBounds(212, 93, 145, 24);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		P1 = new JPasswordField();
		P1.setBounds(212, 142, 145, 24);
		frame.getContentPane().add(P1);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "AIML", "DS", "CS"}));
		CB1.setBounds(212, 203, 145, 24);
		frame.getContentPane().add(CB1);
		
		JRadioButton R1 = new JRadioButton("FEMALE");
		R1.setBounds(211, 254, 71, 32);
		frame.getContentPane().add(R1);
		
		JRadioButton R2 = new JRadioButton("MALE");
		R2.setBounds(294, 252, 63, 34);
		frame.getContentPane().add(R2);

		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"HYD", "THOR", "WARANGAL"}));
		CB2.setBounds(212, 315, 145, 28);
		frame.getContentPane().add(CB2);
		
		
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Branch");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(46, 203, 89, 24);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CITY");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(46, 315, 89, 24);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		
		
		
		
		
		
		
		JButton B1 = new JButton("SUMBIT");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user= TB1.getText();
				String Branch=(String)CB1.getSelectedItem();
				String City= (String)CB2.getSelectedItem();
				ButtonGroup rgb =new ButtonGroup();
				rgb.add(R1);
				rgb.add(R2);
				String Gender="";
				if (R1.isSelected()) {
					Gender="Female";
				}
				if(R2.isSelected())
				{
					Gender="Male";
				}
				Component btnNewButton=null;
				JOptionPane.showMessageDialog(btnNewButton, "name"+user+"\n Branch"+Branch+"\nGender"+Gender+"\nCity"+City);
			}
		});
		B1.setBounds(210, 361, 167, 47);
		frame.getContentPane().add(B1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\saike\\OneDrive\\Desktop\\5cccc1e3f19364129c9d4631720ab26a.jpg"));
		lblNewLabel.setBounds(0, 0, 615, 443);
		frame.getContentPane().add(lblNewLabel);
	}
}
