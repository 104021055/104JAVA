import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class MainFrame2 extends JFrame{
//	private MainFrame2 frm=new MainFrame2();
	private JButton jbtnStart=new JButton("Start");
	private Container cp;
	private JTextField jtf=new JTextField("0");
	private JPanel jpnl1=new JPanel();
	private JButton jbtns[]=new JButton[9];
	private int data[] = new int[9];
	private int count = 1;
//	private Dialog dlg=new Dialog(frm);
//	private Button btnOK=new Button("繼續遊戲");
//	private Button btnEXIT=new Button("結束遊戲");
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
						jbtn.setEnabled(false);
					}else{
//						Button btn=(Button)ae.getSource();
						if(count != Integer.parseInt(jtf.getText())){
							popFrame("遊戲失敗");
//							dlg.setLocation(120,80);
//							dlg.setVisible(true);
						}
						
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
	private void popFrame(String message){
		JOptionPane.showMessageDialog(null,message);
		int n = JOptionPane.showConfirmDialog(null,
				"您是否繼續?","問題", JOptionPane.YES_NO_OPTION);
		if(n == JOptionPane.YES_OPTION){
			for(int i=0;i<9;i++){
				jbtns[i].setBackground(Color.black);
			}//初始化遊戲並繼續進行
		}else{
			System.exit(0);	//結束遊戲
		}//失敗時顯示小視窗繼續或結束
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
