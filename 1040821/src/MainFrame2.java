import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.Timer.*;

public class MainFrame2 extends JFrame {
	private JButton jbtnStart = new JButton("Start");
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Color");
	private JMenuItem item1 = new JMenuItem("blue");
	private JMenuItem item2 = new JMenuItem("pink");
	private JMenuItem item3 = new JMenuItem("yellow");
	private JMenuItem item4 = new JMenuItem("orange");
	private JMenuItem item5 = new JMenuItem("green");
	private Container cp;
	private JTextField jtf = new JTextField("Time");
	private JTextArea jtf2 = new JTextArea();
	private JPanel jpnl1 = new JPanel();
	private MyButton jbtns[] = new MyButton[9];
	private int data[] = new int[9];
	private int n = 0;
	private boolean isStart = false;
	private Color color1;

	Timer timer = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jtf.setText("Time:" + (++n));
		}
	});
	private int count = 1;

	public MainFrame2() {
		initComp();
	}

	private void initComp() {
		cp = this.getContentPane();
		setJMenuBar(menuBar);
		setVisible(true);
		menuBar.setSize(400, 200);
		menuBar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		menu.add(item5);
		this.setBounds(150, 100, 600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout(5, 5));
		jtf.setBackground(Color.black);
		jtf.setHorizontalAlignment(JTextField.CENTER);
		jtf.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jtf.setEnabled(false);
		cp.add(jtf, BorderLayout.NORTH);
		jtf2.setBackground(Color.black);
//		jtf2.setHorizontalAlignment(JTextArea.CENTER);
		jtf2.setText("~~~數字記憶大考驗~~~\n遊戲玩法:\n\n請先記下右側數順序\n再由1~9依序翻出\n\n\n加油喔!!!");
		jtf2.setEnabled(false);
		cp.add(jtf2, BorderLayout.WEST);

		for (int i = 0; i < 9; i++) {
			jbtns[i] = new MyButton("" + data[i]);
			jbtns[i].setOpaque(true);
			jbtns[i].setHorizontalAlignment(JButton.CENTER);
			jbtns[i].setFont(new Font("Times New Roman", Font.BOLD, 25));
			jbtns[i].setForeground(Color.black);
			item1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setBtnColor(1);
				}

			});
			item2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setBtnColor(2);
				}

			});
			item3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setBtnColor(3);
				}

			});
			item4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setBtnColor(4);
				}

			});
			item5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setBtnColor(5);
				}

			});
		}

		jpnl1.setLayout(new GridLayout(3, 3, 3, 3));
		cp.add(jpnl1, BorderLayout.CENTER);
		data = rndNum();
		for (int i = 0; i < 9; i++) {
			jbtns[i] = new MyButton("" + data[i]);
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(Color.gray);
			jbtns[i].setHorizontalAlignment(JButton.CENTER);
			jbtns[i].setFont(new Font("Times New Roman", Font.BOLD, 25));
			jbtns[i].setForeground(Color.black);
			jbtns[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					if (isStart) {
						JButton jbtn = (JButton) ae.getSource();
						if (count == Integer.parseInt(jbtn.getText())) {
							count++;
							jbtn.setBackground(color1);
							jbtn.setEnabled(false);
						} else {
							
							if (count != Integer.parseInt(jbtn.getText())) {
								jbtn.setBackground(color1);
								popFrame("遊戲失敗");
							}
						}

						if (count > 9) {
							timer.stop();
							popFrame(n + "秒");
						}
					}
				}
			});
			jpnl1.add(jbtns[i]);
		}
		jbtnStart.setBounds(50, 100, 0, 0);
		cp.add(jbtnStart, BorderLayout.SOUTH);
		jbtnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				isStart = true;
				timer.start();
				for (int i = 0; i < 9; i++) {
					jbtns[i].setBackground(Color.black);
				}
			}
		});

	}

	private void setBtnColor(int x) {
		color1 = Color.gray;
		switch (x) {
		case 1:
			color1 = Color.cyan;
			break;
		case 2:
			color1 = Color.PINK;
			break;
		case 3:
			color1 = Color.yellow;
			break;
		case 4:
			color1 = Color.orange;
			break;
		case 5:
			color1 = Color.green;
			break;
		}
		for (int i = 0; i < 9; i++) {
			jbtns[i].setBackground(color1);
			repaint();
		}
	}

	private void reset() { // 重製
		isStart = false;
		count = 1;
		data = rndNum();
		for (int i = 0; i < 9; i++) {
			jbtns[i].setText("" + data[i]);
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(color1);
			jbtns[i].setForeground(Color.black);
			jbtns[i].setEnabled(true);
		}
		jtf.setText("Time");
		n = 0;
		repaint();
	}

	private void popFrame(String message) {
		timer.stop();
		JOptionPane.showMessageDialog(null, message);
		int n = JOptionPane.showConfirmDialog(null, "您是否繼續?", "問題", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION,
				null);

		if (n == JOptionPane.YES_OPTION) {
			for (int i = 0; i < 9; i++) {
				reset();
			} // 初始化遊戲並繼續進行
		} else {
			System.exit(0); // 結束遊戲
		} // 失敗時顯示小視窗繼續或結束
	}

	private int[] rndNum() {
		int i = 0;
		Random rnd = new Random();
		boolean flag = false;
		int[] rnds = new int[9];
		while (i < 9) {
			rnds[i] = rnd.nextInt(9) + 1;
			flag = false;
			for (int j = 0; j < i; j++) {
				if (rnds[i] == rnds[j]) {
					flag = true;
				}
			}
			if (flag == false) {
				i++;
			}
		}
		return rnds;
	}

}
