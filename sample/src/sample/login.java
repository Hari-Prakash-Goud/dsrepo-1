package sample;
//fguiufgufdugdf
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tf1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(53, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(53, 115, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(145, 55, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(145, 112, 86, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tf1.getText();
				String password=p1.getText();
				if(name.equals("hari") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "valid login");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid login");
				}
			}
		});
		btnNewButton.setBounds(142, 176, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN PAGE");
		lblNewLabel_2.setBounds(148, 25, 72, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
