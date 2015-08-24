import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class MainFrame2 extends JFrame{
	private Container cp;
	private JTextField jtf=new JTextField("0");
	private JPanel jpnl1=new JPanel();
	private JButton jbtns[]=new JButton[9];
	private int data[] = new int[9];
	public MainFrame2(){
		initComp();
	}
	private void initComp(){
		cp=this.getContentPane();
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout(5,5));
		jtf.setBackground(Color.gray);
		jtf.setHorizontalAlignment(JTextField.CENTER);
		cp.add(jtf,BorderLayout.NORTH);
		
		jpnl1.setLayout(new GridLayout(3,3,3,3));
		cp.add(jpnl1,BorderLayout.CENTER);
		data = rndNum();
		for(int i=0;i<9;i++){
			jbtns[i]=new JButton("data");
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(Color.pink);
			jbtns[i].setHorizontalAlignment(JButton.CENTER);
			
			jbtns[i].add(jbtns[i]);
		}

	
	}
	private int[] rndNum(){
		int i=0;
		Random rnd=new Random();
		boolean flag=false;
		int[] rnds = new int[9];
		while(i<9){
			rnds[i]=rnd.nextInt((10)+1);
			flag=false;
			for(int j=0;j<9;j++){
				if(rnds[i]==rnds[j]){
					flag=true;
				}
			}
			if(flag==false){
				i++;
			}
		}
		return rnds;
	}

}
