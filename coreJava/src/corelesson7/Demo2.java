package corelesson7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo2 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}
}
class MyFrame extends JFrame{
	private JLabel name = new JLabel("姓名:");
	private JCheckBox box = new JCheckBox("xx");
	private JTextField nameFiled = new JTextField(10);
	private JTextArea jta = new JTextArea(10,25);
	private JButton btn1 = new JButton("确定");
	private JButton btn2 = new JButton("取消");
	/*窗体默认布局是整个覆盖，面板默认布局是FlowLayout*/
	private JPanel nPanel = new JPanel();
	private JPanel sPanel = new JPanel();
	private JPanel cPanel = new JPanel();
	public MyFrame(){
		setSize(300,300);
		setTitle("我的窗体");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("helloworld");
			}
		});
		nPanel.add(name);
		nPanel.add(nameFiled);
		sPanel.add(btn1);
		sPanel.add(btn2);
		sPanel.add(box);
		cPanel.add(jta);
		this.setLayout(new BorderLayout());
		this.add(nPanel,BorderLayout.NORTH);
		this.add(sPanel,BorderLayout.SOUTH);
		this.add(cPanel,BorderLayout.CENTER);
	}
	
}

