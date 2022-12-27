import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class login extends JFrame implements ActionListener
{
	JtextFeild jtf1;
	JPasswordFiled jpf1;
	JLabel lb1,lb2;
	JButton b1;
	public login(String title)
	{
		super(title);
		Container con= getContentPane();
		lb1 = new JLable("User Name");
		jtf1 = new JTextFeild(10);
		lb2 = new JLabel("Password");
		jpf1 = new JPasswordField(10);
		b1 = new JButton("OK");
		b1.addActionListener(this);
	
		JPanel p= new JPanel();
		p.add(lb1);
		p.add(jtf1);	
		p.add(lb2);
		p.add(jpf1);
		p.add(b1);
		con.add(p);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton bb= (JButton)ae.getSource();
		if(bb.equals(b1))
		{
			String name = jtf1.getText();
			String pass = String.valueOf(jpf1.getPassword());
			if(name.equals("mumbai")&& pass.equals("love"))
			JOptinPane.showMessageDialog(this,"Sucessful login");
			else
			JOptionPane.showMesageDialog(this,"Invalid user detail");
			jtf1.setText("");
			jpf1.setText("");
		}
	}
public static void main(String args[])
	{
		login ob = new login("");
		ob.setSize(500,200);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}