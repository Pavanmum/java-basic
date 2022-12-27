import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P4 extends JFrame {
double n1,n1;
String msg;

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P4 frame = new P4();
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
	public P4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number 1");
		lblNewLabel.setBounds(53, 36, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 2");
		lblNewLabel_1.setBounds(53, 87, 55, 13);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(148, 33, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(148, 84, 96, 19);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JRadioButton btn1 = new JRadioButton("+");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				msg="Addition of"+n1+"and"+n2" is"+(n1+n2);
			}
		});
		buttonGroup.add(btn1);
		btn1.setBounds(43, 125, 103, 21);
		contentPane.add(btn1);
		
		JRadioButton btn3 = new JRadioButton("*");
		buttonGroup.add(btn3);
		btn3.setBounds(43, 179, 103, 21);
		contentPane.add(btn3);
		
		JRadioButton btn2 = new JRadioButton("-");
		buttonGroup.add(btn2);
		btn2.setBounds(185, 125, 103, 21);
		contentPane.add(btn2);
		
		JRadioButton btn4 = new JRadioButton("/");
		buttonGroup.add(btn4);
		btn4.setBounds(185, 179, 103, 21);
		contentPane.add(btn4);
	}
	void input() {
		n1=Double.parseDouble(txt1.getText());
		n2=Double.parseDouble(txt2.getText());
	}
}
