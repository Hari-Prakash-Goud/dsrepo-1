package sample;

import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class MOVIE {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOVIE window = new MOVIE();
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
	public MOVIE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE BOOKING APP");
		lblNewLabel.setForeground(new Color(255, 0, 6));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(107, 11, 270, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(193, 72, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIES");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setForeground(new Color(0, 64, 64));
		lblNewLabel_2.setBounds(193, 132, 78, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TICKETS");
		lblNewLabel_3.setForeground(new Color(0, 64, 64));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setBounds(193, 190, 78, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(299, 227, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(293, 66, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 128, 255));
		comboBox.setBackground(new Color(255, 255, 0));
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KALKI", "SPIRIT", "RAJA SAAB"}));
		comboBox.setBounds(293, 124, 136, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_1.setForeground(new Color(0, 128, 255));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		comboBox_1.setBounds(293, 182, 136, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\images (1).jfif"));
		lblNewLabel_4.setBounds(0, 0, 434, 272);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
