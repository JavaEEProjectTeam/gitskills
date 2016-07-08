package corelesson7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.management.openmbean.KeyAlreadyExistsException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Demo5 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ÎÒµÄ´°Ìå");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel2 panel = new MyPanel2();
		frame.add(panel);
		frame.setVisible(true);
	}
}
class MyPanel2 extends JPanel{
	JTextField jt1 = new JTextField("hello",10);
	JTextField jt2 = new JTextField("world",10);
	public MyPanel2(){
		add(jt1);
		add(jt2);
		this.setFocusable(true);
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			    System.out.println("bye-bye");
			}
		});
		jt1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("hello");
			}
		});
		jt2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("world");
			}
		});
	}

}
