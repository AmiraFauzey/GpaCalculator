import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;


public class MarkahPelajar extends JFrame {

	private JPanel contentPane;
	private JTable table;
    private JComboBox comboBoxName;
    private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarkahPelajar frame = new MarkahPelajar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
     Connection connection = null;
     private JTextField txtNpelajar;
     private JTextField txtMPelajar;
     private JTextField txtKodMP;
     private JTextField txtMP;
     private JTextField txtJumlahPeratusan;
     private JTextField txtMarkah;
     private JTextField txtrowid;
     private JTextField textField;
     
     public void refreshTable(){
    	 
    	 try{
		        String query="select rowid,StudentID,StudentName,SubjectID,SubjectName,PeratusanMarkah,Markah from MarkahInfo";
		        PreparedStatement pst = connection.prepareStatement(query);
		        ResultSet rs=pst.executeQuery();
		        table.setModel(DbUtils.resultSetToTableModel(rs));
		        pst.close();
		        rs.close();
		        
			}catch(Exception e){
				e.printStackTrace();
			}
    	 
     }
     
     public void fillComboBox()
     {
    	 try{
		       String query="select * from MarkahInfo";
		       PreparedStatement pst = connection.prepareStatement(query);
		       ResultSet rs=pst.executeQuery();
		       
		       while (rs.next())
		       {
		    	   comboBoxName.addItem(rs.getString("StudentName"));
		       }
		        
			}catch(Exception e){
				e.printStackTrace();
			}
     }
	/**
	 * Create the frame.
	 */
	public MarkahPelajar() {
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(343, 113, 452, 283);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		JButton btnLoadStudentMark = new JButton("Load student Mark");
		btnLoadStudentMark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*try{
				
			        String query="select * from MarkahInfo";
			        PreparedStatement pst = connection.prepareStatement(query);
			        ResultSet rs=pst.executeQuery();
			        table.setModel(DbUtils.resultSetToTableModel(rs));
			        
				}catch(Exception e){
					e.printStackTrace();
				}*/
				refreshTable();
			}
		});
		btnLoadStudentMark.setBounds(343, 71, 129, 23);
		contentPane.add(btnLoadStudentMark);
		
		JLabel lblNamaPelajar = new JLabel("Nama pelajar :");
		lblNamaPelajar.setBounds(20, 114, 80, 14);
		contentPane.add(lblNamaPelajar);
		
		txtNpelajar = new JTextField();
		txtNpelajar.setBounds(149, 111, 150, 20);
		contentPane.add(txtNpelajar);
		txtNpelajar.setColumns(10);
		
		JLabel lblNoMatrikPelajar = new JLabel("No Matrik Pelajar :");
		lblNoMatrikPelajar.setBounds(20, 145, 95, 14);
		contentPane.add(lblNoMatrikPelajar);
		
		txtMPelajar = new JTextField();
		txtMPelajar.setBounds(149, 142, 150, 20);
		contentPane.add(txtMPelajar);
		txtMPelajar.setColumns(10);
		
		JLabel lblKodMp = new JLabel(" Kod MP :");
		lblKodMp.setBounds(20, 181, 46, 14);
		contentPane.add(lblKodMp);
		
		txtKodMP = new JTextField();
		txtKodMP.setBounds(149, 175, 101, 20);
		contentPane.add(txtKodMP);
		txtKodMP.setColumns(10);
		
		JLabel lblMp = new JLabel("MP :");
		lblMp.setBounds(20, 206, 46, 14);
		contentPane.add(lblMp);
		
		txtMP = new JTextField();
		txtMP.setBounds(149, 206, 185, 20);
		contentPane.add(txtMP);
		txtMP.setColumns(10);
		
		JLabel lblJumlahPeratusan = new JLabel("Jumlah Peratusan :");
		lblJumlahPeratusan.setBounds(20, 242, 101, 14);
		contentPane.add(lblJumlahPeratusan);
		
		txtJumlahPeratusan = new JTextField();
		txtJumlahPeratusan.setBounds(149, 237, 62, 20);
		contentPane.add(txtJumlahPeratusan);
		txtJumlahPeratusan.setColumns(10);
		
		JLabel lblMarkah = new JLabel("Markah :");
		lblMarkah.setBounds(31, 282, 46, 14);
		contentPane.add(lblMarkah);
		
		txtMarkah = new JTextField();
		txtMarkah.setBounds(149, 279, 57, 20);
		contentPane.add(txtMarkah);
		txtMarkah.setColumns(10);
		
		JButton btnSaveData = new JButton("save data");
		btnSaveData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
			        String query="insert into MarkahInfo(rowid,StudentID,StudentName,SubjectID,SubjectName,PeratusanMarkah,Markah) values (?,?,?,?,?,?,?)";
			        PreparedStatement pst = connection.prepareStatement(query);
			        pst.setString(1, txtrowid.getText());
			        pst.setString(2, txtMPelajar.getText());
			        pst.setString(3, txtNpelajar.getText());
			        pst.setString(4, txtKodMP.getText());
			        pst.setString(5, txtMP.getText());
			        pst.setString(6, txtJumlahPeratusan.getText());
			        pst.setString(7, txtMarkah.getText());
			        pst.execute();
			        JOptionPane.showMessageDialog(null,"Succesfull save" );
			        
			        pst.close();
			        
			        txtrowid.setText("");
			        txtMPelajar.setText("");
			        txtNpelajar.setText("");
			        txtKodMP.setText("");
			        txtMP.setText("");
			        txtJumlahPeratusan.setText("");
			        txtMarkah.setText("");

			        
			        
			        
				}catch(Exception e){
					e.printStackTrace();
				}
				refreshTable();
			}
		});
		btnSaveData.setBounds(241, 278, 89, 23);
		contentPane.add(btnSaveData);
		
		JLabel lblRowid = new JLabel("rowid :");
		lblRowid.setBounds(20, 75, 46, 14);
		contentPane.add(lblRowid);
		
		txtrowid = new JTextField();
		txtrowid.setBounds(149, 72, 46, 20);
		contentPane.add(txtrowid);
		txtrowid.setColumns(10);
		
		JButton btnDeleteData = new JButton("Delete data");
		btnDeleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int action= JOptionPane.showConfirmDialog(null,"Are you sure you want to delete it","Delete",JOptionPane.YES_NO_OPTION);
				if(action==0){
				try{
					int rowIndex = table.getSelectedRow();
					
					Object rowId = (Object)table.getValueAt(rowIndex, 0);
			        String query="delete from MarkahInfo where rowid=' "+rowId+" ' ";
			        PreparedStatement pst = connection.prepareStatement(query);
			        
			        pst.execute();
			        JOptionPane.showMessageDialog(null,"Succesfull Deleted" );
			        
			        pst.close();
			        
			        
				}catch(Exception ex){
					ex.printStackTrace();
				}
				refreshTable();
			}
			}
		});
		btnDeleteData.setBounds(241, 312, 89, 23);
		contentPane.add(btnDeleteData);
		
		JButton btnUpdateData = new JButton("Update data");
		btnUpdateData.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try{
		       String query="Update MarkahInfo set rowid=' "+txtrowid.getText()+"' ,StudentName='"+txtNpelajar.getText()+"' ,StudentID='"+txtMPelajar.getText()+"' ,SubjectID='"+txtKodMP.getText()+"',SubjectName='"+txtMP.getText()+"' ,PeratusanMarkah='"+txtJumlahPeratusan.getText()+"' ,Markah='"+txtMarkah.getText()+"'where rowid=' "+txtrowid.getText()+"'  ";
		        PreparedStatement pst = connection.prepareStatement(query);
		        
		        pst.execute();
		        JOptionPane.showMessageDialog(null,"Succesfull Updated" );
		        
		        pst.close();
		        
		        
			}catch(Exception e){
				e.printStackTrace();
			}
			refreshTable();
		}
		
			
		});
		btnUpdateData.setBounds(212, 348, 118, 23);
		contentPane.add(btnUpdateData);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
				       String query="select * from MarkahInfo where StudentName=?  ";
				        PreparedStatement pst = connection.prepareStatement(query);
				        pst.setString(1, textField.getText());
				        ResultSet rs=pst.executeQuery();
				        
				       table.setModel(DbUtils.resultSetToTableModel(rs));
				        pst.close();
					}catch(Exception e){
						e.printStackTrace();
					}
			}
		});
		textField.setBounds(343, 30, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		 comboBoxName = new JComboBox();
		 comboBoxName.setFont(new Font("Tahoma", Font.BOLD, 18));
		 comboBoxName.setBounds(20, 30, 147, 34);
		contentPane.add( comboBoxName);
		
		JButton btnKiraCgpaDan = new JButton("Kira CGPA dan GPA");
		btnKiraCgpaDan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame frame = new JFrame("Curve Editor");
                frame.setContentPane(new StudentInfo().getContentPane());
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setSize(640,480);
                frame.setVisible(true);
			}
		});
		btnKiraCgpaDan.setBounds(20, 403, 147, 23);
		contentPane.add(btnKiraCgpaDan);
		
		JLabel lblRemark = new JLabel("Remark :");
		lblRemark.setBounds(20, 316, 46, 14);
		contentPane.add(lblRemark);
		
		refreshTable();
		fillComboBox();
	}
}

