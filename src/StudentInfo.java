import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StudentInfo extends JFrame {
	private float sumOfCredits_1=-1;
	private float sumOfCredits_2=-1;
	private float sumOfPoints_1=-1;
	private float sumOfPoints_2=-1;

	private JPanel contentPane;
	private JTextField tfStudentName;
	private JTextField tfMatricNumber;
	private JTextField tfGR0_1;
	private JTextField tfGR1_1;
	private JTextField tfGR2_1;
	private JTextField tfGR3_1;
	private JTextField tfGR4_1;
	private JTextField tfGR5_1;
	private JTextField tfCredit0_1;
	private JTextField tfCredit1_1;
	private JTextField tfCredit2_1;
	private JTextField tfCredit3_1;
	private JTextField tfCredit4_1;
	private JTextField tfCredit5_1;
	private JTextField tfMN0_1;
	private JTextField tfMN1_1;
	private JTextField tfMN2_1;
	private JTextField tfMN3_1;
	private JTextField tfMN4_1;
	private JTextField tfMN5_1;
	private JTextField tfGR0_2;
	private JTextField tfGR1_2;
	private JTextField tfGR3_2;
	private JTextField tfGR4_2;
	private JTextField tfGR5_2;
	private JTextField tfGR6_2;
	private JTextField tfCredit0_2;
	private JTextField tfCredit1_2;
	private JTextField tfCredit2_2;
	private JTextField tfCredit3_2;
	private JTextField tfCredit4_2;
	private JTextField tfCredit5_2;
	private JTextField tfMN0_2;
	private JTextField tfMN1_2;
	private JTextField tfMN2_2;
	private JTextField tfMN3_2;
	private JTextField tfMN4_2;
	private JTextField tfMN5_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInfo frame = new StudentInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 816);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name :");
		lblNewLabel.setBounds(68, 61, 92, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matric Number:");
		lblNewLabel_1.setBounds(310, 61, 82, 26);
		contentPane.add(lblNewLabel_1);
		
		tfStudentName = new JTextField();
		tfStudentName.setBounds(150, 64, 131, 20);
		contentPane.add(tfStudentName);
		tfStudentName.setColumns(10);
		
		tfMatricNumber = new JTextField();
		tfMatricNumber.setBounds(399, 64, 131, 20);
		contentPane.add(tfMatricNumber);
		tfMatricNumber.setColumns(10);
		
		JLabel lblKodMatepelajaran = new JLabel("Kod Matepelajaran :");
		lblKodMatepelajaran.setBounds(68, 98, 102, 26);
		contentPane.add(lblKodMatepelajaran);
		
		JLabel lblMatepelajaran = new JLabel("Matepelajaran :");
		lblMatepelajaran.setBounds(193, 101, 82, 20);
		contentPane.add(lblMatepelajaran);
		
		JLabel lblNewLabel_2 = new JLabel("GR :");
		lblNewLabel_2.setBounds(449, 104, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Credit :");
		lblNewLabel_3.setBounds(564, 103, 64, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BITI2213");
		lblNewLabel_4.setBounds(94, 123, 46, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblBiti = new JLabel("BITI2223");
		lblBiti.setBounds(94, 151, 46, 14);
		contentPane.add(lblBiti);
		
		JLabel lblNewLabel_5 = new JLabel("BITM2313\t");
		lblNewLabel_5.setBounds(94, 176, 57, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblBitp = new JLabel("BITP2213");
		lblBitp.setBounds(94, 201, 46, 14);
		contentPane.add(lblBitp);
		
		JLabel lblBits = new JLabel("BITS2513");
		lblBits.setBounds(94, 226, 46, 14);
		contentPane.add(lblBits);
		
		JLabel lblBlhc = new JLabel("BLHC4032");
		lblBlhc.setBounds(94, 251, 57, 14);
		contentPane.add(lblBlhc);
		
		JLabel lblNewLabel_6 = new JLabel("SISTEM BERASASKAN PENGETAHUAN");
		lblNewLabel_6.setBounds(193, 126, 205, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblPembelajaranMesin = new JLabel("PEMBELAJARAN MESIN");
		lblPembelajaranMesin.setBounds(193, 151, 161, 14);
		contentPane.add(lblPembelajaranMesin);
		
		JLabel lblInteraksiKomputer = new JLabel("INTERAKSI KOMPUTER - MANUSIA");
		lblInteraksiKomputer.setBounds(193, 176, 179, 14);
		contentPane.add(lblInteraksiKomputer);
		
		JLabel lblKejuruteraanPerisian = new JLabel("KEJURUTERAAN PERISIAN");
		lblKejuruteraanPerisian.setBounds(193, 201, 161, 14);
		contentPane.add(lblKejuruteraanPerisian);
		
		JLabel lblTeknologiInternet = new JLabel("TEKNOLOGI INTERNET");
		lblTeknologiInternet.setBounds(193, 226, 142, 14);
		contentPane.add(lblTeknologiInternet);
		
		JLabel lblPemikiranKritis = new JLabel("PEMIKIRAN KRITIS & KREATIF");
		lblPemikiranKritis.setBounds(193, 251, 179, 14);
		contentPane.add(lblPemikiranKritis);
		
		tfGR0_1 = new JTextField();
		tfGR0_1.setBounds(431, 123, 64, 20);
		contentPane.add(tfGR0_1);
		tfGR0_1.setColumns(10);
		
		JLabel lblMn = new JLabel("MN");
		lblMn.setBounds(668, 104, 46, 14);
		contentPane.add(lblMn);
		
		tfGR1_1 = new JTextField();
		tfGR1_1.setBounds(431, 148, 64, 20);
		contentPane.add(tfGR1_1);
		tfGR1_1.setColumns(10);
		
		tfGR2_1 = new JTextField();
		tfGR2_1.setBounds(431, 176, 64, 20);
		contentPane.add(tfGR2_1);
		tfGR2_1.setColumns(10);
		
		tfGR3_1 = new JTextField();
		tfGR3_1.setBounds(431, 201, 64, 20);
		contentPane.add(tfGR3_1);
		tfGR3_1.setColumns(10);
		
		tfGR4_1 = new JTextField();
		tfGR4_1.setBounds(431, 223, 64, 20);
		contentPane.add(tfGR4_1);
		tfGR4_1.setColumns(10);
		
		tfGR5_1 = new JTextField();
		tfGR5_1.setBounds(431, 248, 64, 20);
		contentPane.add(tfGR5_1);
		tfGR5_1.setColumns(10);
		
		tfCredit0_1 = new JTextField();
		tfCredit0_1.setBounds(545, 123, 72, 20);
		contentPane.add(tfCredit0_1);
		tfCredit0_1.setColumns(10);
		
		tfCredit1_1 = new JTextField();
		tfCredit1_1.setBounds(545, 148, 72, 20);
		contentPane.add(tfCredit1_1);
		tfCredit1_1.setColumns(10);
		
		tfCredit2_1 = new JTextField();
		tfCredit2_1.setBounds(545, 173, 72, 20);
		contentPane.add(tfCredit2_1);
		tfCredit2_1.setColumns(10);
		
		tfCredit3_1 = new JTextField();
		tfCredit3_1.setBounds(545, 198, 72, 20);
		contentPane.add(tfCredit3_1);
		tfCredit3_1.setColumns(10);
		
		tfCredit4_1 = new JTextField();
		tfCredit4_1.setBounds(545, 223, 72, 20);
		contentPane.add(tfCredit4_1);
		tfCredit4_1.setColumns(10);
		
		tfCredit5_1 = new JTextField();
		tfCredit5_1.setBounds(545, 248, 72, 20);
		contentPane.add(tfCredit5_1);
		tfCredit5_1.setColumns(10);
		
		tfMN0_1 = new JTextField();
		tfMN0_1.setBounds(654, 123, 46, 20);
		contentPane.add(tfMN0_1);
		tfMN0_1.setColumns(10);
		
		tfMN1_1 = new JTextField();
		tfMN1_1.setBounds(654, 148, 46, 20);
		contentPane.add(tfMN1_1);
		tfMN1_1.setColumns(10);
		
		tfMN2_1 = new JTextField();
		tfMN2_1.setBounds(654, 173, 46, 20);
		contentPane.add(tfMN2_1);
		tfMN2_1.setColumns(10);
		
		tfMN3_1 = new JTextField();
		tfMN3_1.setBounds(654, 198, 46, 20);
		contentPane.add(tfMN3_1);
		tfMN3_1.setColumns(10);
		
		tfMN4_1 = new JTextField();
		tfMN4_1.setBounds(654, 223, 46, 20);
		contentPane.add(tfMN4_1);
		tfMN4_1.setColumns(10);
		
		tfMN5_1 = new JTextField();
		tfMN5_1.setBounds(654, 248, 46, 20);
		contentPane.add(tfMN5_1);
		tfMN5_1.setColumns(10);
		
		JLabel lblGpa = new JLabel(" GPA :");
		lblGpa.setBounds(286, 288, 46, 14);
		contentPane.add(lblGpa);
		
		JButton btnKiraGPA_1 = new JButton("Kira GPA");
		
		btnKiraGPA_1.setBounds(477, 284, 83, 23);
		contentPane.add(btnKiraGPA_1);
		
		JLabel lblGPAValue_1 = new JLabel("");
		lblGPAValue_1.setBounds(342, 288, 46, 14);
		contentPane.add(lblGPAValue_1);
		
		JLabel lblNewLabel_7 = new JLabel("SEMESTER 1");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_7.setBounds(286, 11, 149, 47);
		contentPane.add(lblNewLabel_7);
		
		JLabel label = new JLabel("SEMESTER 2");
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(266, 313, 190, 47);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Kod Matepelajaran ");
		label_1.setBounds(68, 369, 110, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("BACS2223");
		label_2.setBounds(80, 394, 60, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("BITI1113");
		label_3.setBounds(80, 419, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("BITI1213");
		label_4.setBounds(80, 444, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("BITI1223");
		label_5.setBounds(80, 469, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("BITI3113");
		label_6.setBounds(80, 494, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("BITI3123");
		label_7.setBounds(80, 519, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Matepelajaran");
		label_8.setBounds(223, 371, 82, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("STATISTICS AND PROBABILITY ");
		label_9.setBounds(211, 394, 165, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel(" ARTIFICIAL INTELLIGENCE");
		label_10.setBounds(205, 419, 149, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("LINEAR ALGEBRA AND DISCRETE MATHEMATICS");
		label_11.setBounds(206, 444, 250, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel(" CALCULUS AND NUMERICAL METHODS ");
		label_12.setBounds(203, 469, 210, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("INTELLIGENT AGENTS");
		label_13.setBounds(207, 494, 165, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel(" FUZZY LOGIC");
		label_14.setBounds(205, 519, 110, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("GR");
		label_15.setBounds(514, 369, 46, 14);
		contentPane.add(label_15);
		
		tfGR0_2 = new JTextField();
		tfGR0_2.setColumns(10);
		tfGR0_2.setBounds(502, 391, 46, 20);
		contentPane.add(tfGR0_2);
		
		tfGR1_2 = new JTextField();
		tfGR1_2.setColumns(10);
		tfGR1_2.setBounds(502, 416, 46, 20);
		contentPane.add(tfGR1_2);
		
		tfGR3_2 = new JTextField();
		tfGR3_2.setColumns(10);
		tfGR3_2.setBounds(502, 441, 46, 20);
		contentPane.add(tfGR3_2);
		
		tfGR4_2 = new JTextField();
		tfGR4_2.setColumns(10);
		tfGR4_2.setBounds(502, 466, 46, 20);
		contentPane.add(tfGR4_2);
		
		tfGR5_2 = new JTextField();
		tfGR5_2.setColumns(10);
		tfGR5_2.setBounds(502, 491, 46, 20);
		contentPane.add(tfGR5_2);
		
		tfGR6_2 = new JTextField();
		tfGR6_2.setColumns(10);
		tfGR6_2.setBounds(502, 516, 46, 20);
		contentPane.add(tfGR6_2);
		
		JLabel label_16 = new JLabel("Credit");
		label_16.setBounds(607, 369, 46, 14);
		contentPane.add(label_16);
		
		tfCredit0_2 = new JTextField();
		tfCredit0_2.setColumns(10);
		tfCredit0_2.setBounds(600, 391, 53, 20);
		contentPane.add(tfCredit0_2);
		
		tfCredit1_2 = new JTextField();
		tfCredit1_2.setColumns(10);
		tfCredit1_2.setBounds(600, 416, 53, 20);
		contentPane.add(tfCredit1_2);
		
		tfCredit2_2 = new JTextField();
		tfCredit2_2.setColumns(10);
		tfCredit2_2.setBounds(600, 441, 53, 20);
		contentPane.add(tfCredit2_2);
		
		tfCredit3_2 = new JTextField();
		tfCredit3_2.setColumns(10);
		tfCredit3_2.setBounds(600, 466, 53, 20);
		contentPane.add(tfCredit3_2);
		
		tfCredit4_2 = new JTextField();
		tfCredit4_2.setColumns(10);
		tfCredit4_2.setBounds(600, 491, 53, 20);
		contentPane.add(tfCredit4_2);
		
		tfCredit5_2 = new JTextField();
		tfCredit5_2.setColumns(10);
		tfCredit5_2.setBounds(600, 516, 54, 20);
		contentPane.add(tfCredit5_2);
		
		JLabel label_17 = new JLabel("MN");
		label_17.setBounds(703, 369, 46, 14);
		contentPane.add(label_17);
		
		tfMN0_2 = new JTextField();
		tfMN0_2.setColumns(10);
		tfMN0_2.setBounds(691, 391, 57, 20);
		contentPane.add(tfMN0_2);
		
		tfMN1_2 = new JTextField();
		tfMN1_2.setColumns(10);
		tfMN1_2.setBounds(691, 416, 57, 20);
		contentPane.add(tfMN1_2);
		
		tfMN2_2 = new JTextField();
		tfMN2_2.setColumns(10);
		tfMN2_2.setBounds(691, 441, 57, 20);
		contentPane.add(tfMN2_2);
		
		tfMN3_2 = new JTextField();
		tfMN3_2.setColumns(10);
		tfMN3_2.setBounds(691, 466, 57, 20);
		contentPane.add(tfMN3_2);
		
		tfMN4_2 = new JTextField();
		tfMN4_2.setColumns(10);
		tfMN4_2.setBounds(691, 491, 57, 20);
		contentPane.add(tfMN4_2);
		
		tfMN5_2 = new JTextField();
		tfMN5_2.setColumns(10);
		tfMN5_2.setBounds(691, 516, 57, 20);
		contentPane.add(tfMN5_2);
		
		JLabel labelGPA = new JLabel("GPA :");
		labelGPA.setBounds(289, 573, 46, 14);
		contentPane.add(labelGPA);
		
		JLabel lblGPAValue_2 = new JLabel("");
		lblGPAValue_2.setBounds(329, 573, 46, 14);
		contentPane.add(lblGPAValue_2);
		
		JButton btnKiraGPA_2 = new JButton("Kira GPA");
		
		btnKiraGPA_2.setBounds(459, 569, 89, 23);
		contentPane.add(btnKiraGPA_2);
		
		JLabel lblTotalCgpaIs = new JLabel("Total CGPA is :");
		lblTotalCgpaIs.setBounds(449, 655, 99, 26);
		contentPane.add(lblTotalCgpaIs);
		
		JLabel lblCGPAValue = new JLabel("");
		lblCGPAValue.setBounds(595, 655, 46, 14);
		contentPane.add(lblCGPAValue);
		
		btnKiraGPA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JTextField tfGrades[] = new JTextField[]{tfGR0_1,tfGR1_1,tfGR2_1,tfGR3_1,tfGR4_1,tfGR5_1}; 
				JTextField tfCredits[] = new JTextField[]{tfCredit0_1,tfCredit1_1,tfCredit2_1,tfCredit3_1,tfCredit4_1,tfCredit5_1};
				JTextField tfMNs[] = new JTextField[]{tfMN0_1,tfMN1_1,tfMN2_1,tfMN3_1,tfMN4_1,tfMN5_1};
				
				sumOfCredits_1 = 0;
				sumOfPoints_1 = 0;
				for(int i=0;i<=5;i++){
					String grade = tfGrades[i].getText();
					float MN = 0;
					if(grade.equals("A")) MN = 4;
					else if(grade.equals("A-")) MN = 3.67f;
					else if(grade.equals("B+")) MN = 3.33f;
					else if(grade.equals("B")) MN = 3;
					else if(grade.equals("B-")) MN = 2.67f;
					else if(grade.equals("C+")) MN = 2.33f;
					else if(grade.equals("C")) MN = 2;
					else if(grade.equals("C-")) MN = 1.67f;
					else if(grade.equals("D+")) MN = 1.33f;
					else if(grade.equals("D")) MN = 1;
					else if(grade.equals("D-")) MN = 0.7f;
					else if(grade.equals("F")) MN = 0;
					
					tfMNs[i].setText(MN+"");
					
					int credit = Integer.parseInt(tfCredits[i].getText());
					
					sumOfCredits_1 = sumOfCredits_1 + credit;
					sumOfPoints_1 = sumOfPoints_1 + credit*MN;
				}
				
				float GPA = sumOfPoints_1 / sumOfCredits_1;
				lblGPAValue_1.setText(String.format("%.2f", GPA));
				
				if(sumOfCredits_2>-1 && sumOfPoints_2>-1){
					float sumOfCredits = sumOfCredits_1+sumOfCredits_2;
					float sumOfPoints = sumOfPoints_1+sumOfPoints_2;
					float CGPA = sumOfPoints / sumOfCredits;
					lblCGPAValue.setText(String.format("%.2f", CGPA));
				}
			}
		});
		btnKiraGPA_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField txtGrade[] = new JTextField[]{tfGR0_2,tfGR1_2,tfGR3_2,tfGR4_2,tfGR5_2,tfGR6_2}; 
				JTextField txtCredit[] = new JTextField[]{tfCredit0_2,tfCredit1_2,tfCredit2_2,tfCredit3_2,tfCredit4_2,tfCredit5_2};
				JTextField txtMN[] = new JTextField[]{tfMN0_2,tfMN1_2,tfMN2_2,tfMN3_2,tfMN4_2,tfMN5_2};

				sumOfCredits_2 = 0;
				sumOfPoints_2 = 0;
				for(int i=0;i<=5;i++){
					String grade = txtGrade[i].getText();
					float MN = 0;
					if(grade.equals("A")) MN = 4;
					else if(grade.equals("A-")) MN = 3.67f;
					else if(grade.equals("B+")) MN = 3.33f;
					else if(grade.equals("B")) MN = 3;
					else if(grade.equals("B-")) MN = 2.67f;
					else if(grade.equals("C+")) MN = 2.33f;
					else if(grade.equals("C")) MN = 2;
					else if(grade.equals("C-")) MN = 1.67f;
					else if(grade.equals("D+")) MN = 1.33f;
					else if(grade.equals("D")) MN = 1;
					else if(grade.equals("D-")) MN = 0.7f;
					else if(grade.equals("F")) MN = 0;
					
					txtMN[i].setText(MN+"");
					
					int credit = Integer.parseInt(txtCredit[i].getText());
					
					sumOfCredits_2 = sumOfCredits_2 + credit;
					sumOfPoints_2 = sumOfPoints_2 + credit*MN;
				}
				
				float GPA = sumOfPoints_2 / sumOfCredits_2;
				lblGPAValue_2.setText(String.format("%.2f", GPA));
				
				if(sumOfCredits_1>-1 && sumOfPoints_1>-1){
					float sumOfCredits = sumOfCredits_1+sumOfCredits_2;
					float sumOfPoints = sumOfPoints_1+sumOfPoints_2;
					float CGPA = sumOfPoints / sumOfCredits;
					lblCGPAValue.setText(String.format("%.2f", CGPA));
				}
			}
		});
	}
}
