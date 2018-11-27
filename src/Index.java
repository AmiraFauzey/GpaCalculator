import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index {

	private JFrame frame;
	private JTextField textFieldUN;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 Connection connection = null;
	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
		connection = sqliteConnection.dbConnector();
	}
    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SISTEM KEMASUKAN MARKAH PELAJAR");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(176, 38, 370, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama Login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(213, 152, 73, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(313, 156, 123, 20);
		frame.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JLabel lblKataLaluan = new JLabel("Kata Laluan");
		lblKataLaluan.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKataLaluan.setBounds(213, 207, 92, 14);
		frame.getContentPane().add(lblKataLaluan);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(313, 205, 123, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select  * from StaffInfo where username=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textFieldUN.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs=pst.executeQuery();
					int count = 0;
					while(rs.next()){
						count = count+1;
						
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "Username and password is correct") ;
						frame.dispose();
						MarkahPelajar Mrkh = new MarkahPelajar();
						Mrkh .setVisible(true);
					}
					else if (count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and password ") ;	
					}
					else {
						JOptionPane.showMessageDialog(null, "Username and password is not correct") ;
					}
					 rs.close();
					 pst.close();
					}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e) ;
					
				}
				
				
			}
		});
		btnLogin.setBounds(313, 259, 73, 23);
		frame.getContentPane().add(btnLogin);
	}
}
