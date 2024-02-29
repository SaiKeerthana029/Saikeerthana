package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MovieBooking {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieBooking window = new MovieBooking();
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
	public MovieBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 871, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE BOOKINGS");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(327, 10, 218, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" NAME :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(61, 93, 78, 46);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MOVIE NAME :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(61, 164, 143, 36);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NO.OF TICKETS :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(61, 221, 167, 36);
		frame.getContentPane().add(lblNewLabel_4);
		
		T1 = new JTextField();
		T1.setBounds(303, 102, 195, 36);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SALAAR", "HAPPY DAYS", "GUNTUR KARAM", "HANUMAN"}));
		CB1.setBounds(303, 164, 195, 36);
		frame.getContentPane().add(CB1);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		CB2.setBounds(303, 221, 195, 36);
		frame.getContentPane().add(CB2);
		
		JButton B1 = new JButton("BUY NOW");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=T1.getText();
				String Movie= (String) CB1.getSelectedItem();
				String Tickets = (String) CB2.getSelectedItem();
				int nt Integer.parseInt(Tickets);
				int bill=0;
				if(Movie.equals("RRR"))
				{
					bill=nt*150;
				}
				if(Movie.equals("KGF=1"))
				{
					bill=nt*200
				}
				if(Movie.equals("SALAAR"))
				{
					bill=nt*250
				}
				int res=0;
				Component btnNewButton = null;
				res=JOptionPane.ShowConfirmDialog(btnNewbutton, "name"+user+"\nMovie name"+Movie+"\n No.of Tickets :"+ Tickets+"\nbill : "+bill);
				if(res==JOption.Yes_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton"Booking Confirmed");
					T1.setText("");
					CB1.setSelectedItem("");
				}
				if(res==JOptionPane.No_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton"Booking Not Confirmed");
				}
			}
		});
		B1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		B1.setBounds(303, 326, 167, 41);
		frame.getContentPane().add(B1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\saike\\OneDrive\\Desktop\\Online-Movie-Ticket-Booking-Banner-1-1280x720.jpg"));
		lblNewLabel.setBounds(0, 0, 857, 485);
		frame.getContentPane().add(lblNewLabel);
	}
}
