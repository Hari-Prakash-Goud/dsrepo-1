package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class sql {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sql window = new sql();
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
	public sql() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(72, 209, 204));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTATION FORM");
		lblNewLabel.setBounds(160, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(90, 40, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(160, 40, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(90, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb2 = new JTextField();
		tb2.setBounds(160, 70, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(90, 100, 50, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "cse", "ds", "cs", "it", "mech", "civil"}));
		cb1.setBounds(160, 100, 86, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll = tb1.getText();
				int id = Integer.parseInt(roll);
				String name = tb2.getText();
				String branch = (String) cb1.getSelectedItem();
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q = "insert into student values('" + id + "','" + name + "','" + branch + "')";
					String q1 = "insert into students values('" + id + "','" + name + "','" + branch + "')";
					Statement stn = con.createStatement();
					stn.executeUpdate(q);
					stn.executeUpdate(q1);
					JOptionPane.showMessageDialog(btnNewButton, "Record Inserted");
					con.close();
				}
				catch(SQLException e1) {
					e1.printStackTrace(); 	
				}
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(177, 180, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
