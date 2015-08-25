import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
	private JButton jbtnStart=new JButton("Start");
	private JLabel jlb1=new JLabel();
	private Container cp;
	private String str1="攝氏溫度:";
	private String str2="華氏溫度為:";
	private JTextField jtf = new JTextField();
	private float c= 1.5f;
	
	public MainFrame(){
		initComp();
	}
	private void initComp(){
		cp=this.getContentPane();
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
		
		jtf.setBounds(50, 40, 80, 25);
		cp.add(jtf);
		
		
		jlb1.setBounds(50,70,250,25);
		cp.add(jlb1);
			
		
		jbtnStart.setBounds(50,100,80,25);
		cp.add(jbtnStart);
		jbtnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				c = Float.parseFloat(jtf.getText());
				double F = c*9/5+32;
				jlb1.setText(str1+c+str2+F);
			}
		});
		
	}
}
