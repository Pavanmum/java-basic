package swingex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Label extends JFrame {

	private JPanel txtMsg;
	private JTextField textField;
	private JLabel lblMsg;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Label frame = new Label();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Label() {
		setTitle("#first");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 287);
		txtMsg = new JPanel();
		txtMsg.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(txtMsg);
		txtMsg.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Something");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel.setBounds(39, 42, 101, 25);
		txtMsg.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(151, 46, 96, 19);
		txtMsg.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText(txtMsg.getText());
			}
		});
		btnNewButton.setBounds(39, 97, 85, 21);
		txtMsg.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMsg.setText("");
				lblMsg.setText("");
			}
		});
		btnNewButton_1.setBounds(162, 97, 85, 21);
		txtMsg.add(btnNewButton_1);
		
		lblMsg = new JLabel(" ");
		lblMsg.setBounds(158, 170, 46, 14);
		txtMsg.add(lblMsg);
	}
}
