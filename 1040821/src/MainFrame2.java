import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame2 extends JFrame{
	private JLabel jlb1=new JLabel();
	private Container cp;
	public MainFrame2(){
		initComp();
	}
	private void initComp(){
		cp=this.getContentPane();
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
	}

}
