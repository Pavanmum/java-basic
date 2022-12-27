
import java.awt.*;
import javax.swing.*;


public class pavand{
public static void main (String []args) {
	Abc c=new Abc();
	}
}
class Abc extends JFrame
{
	public Abc() {
		setLayout(new FlowLayout());
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1= new JLabel("Pavan");
		add(l1);
		}
}