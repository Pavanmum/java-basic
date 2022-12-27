import javax.swing;
import java.awt.*;
public class FrameDemo extends JFrame
{
	public FrameDemo()
	{
		
		Container cp=getContentPane();
		//JLabel l=new JLabel("GOOD MORNING");
		cp.add(l);
		setTitle("Frame Demo");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(string args[])
	{
		new FrameDemo();	
	}	
}