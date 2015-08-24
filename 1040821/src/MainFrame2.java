import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class MainFrame2 extends JFrame{
	private JButton jbtnStart=new JButton("Start");
	private Container cp;
	private JTextField jtf=new JTextField("0");
	private JPanel jpnl1=new JPanel();
	private JButton jbtns[]=new JButton[9];
	private int data[] = new int[9];
	private int count = 1;
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
		jtf.setFont(new Font("Times New Roman",Font.BOLD,20));
		jtf.setEnabled(false);
		cp.add(jtf,BorderLayout.NORTH);
		
		jpnl1.setLayout(new GridLayout(3,3,3,3));
		cp.add(jpnl1,BorderLayout.CENTER);
		data = rndNum();
		for(int i=0;i<9;i++){
			jbtns[i]=new JButton(""+data[i]);
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(Color.pink);
			jbtns[i].setHorizontalAlignment(JButton.CENTER);
			jbtns[i].setFont(new Font("Times New Roman",Font.BOLD,25));
			jbtns[i].setForeground(Color.black);
			jbtns[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					JButton jbtn=(JButton)ae.getSource();
					jtf.setText(jbtn.getText());
					if(count == Integer.parseInt(jtf.getText())){
						count++;
						jbtn.setBackground(Color.pink);
					}else{
						System.out.println("X");
					}
				}
			});
			jpnl1.add(jbtns[i]);
		}
		jbtnStart.setBounds(50,100,0,0);
		cp.add(jbtnStart,BorderLayout.SOUTH);
		jbtnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				for(int i=0;i<9;i++){
					jbtns[i].setBackground(Color.black);
				}
			}
		});
		
	}
	private int[] rndNum(){
		int i=0;
		Random rnd=new Random();
		boolean flag=false;
		int[] rnds = new int[9];
		while(i<9){
			rnds[i]=rnd.nextInt(9)+1;
			flag=false;
			for(int j=0;j<i;j++){
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
