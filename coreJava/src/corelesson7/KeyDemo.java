package corelesson7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.management.openmbean.KeyAlreadyExistsException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ÎÒµÄ´°Ìå");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		KeyPanel panel = new KeyPanel();
		frame.add(panel);
		frame.setVisible(true);
	}
}
class KeyPanel extends JPanel{
	private ArrayList<Line2D> lines = new ArrayList<Line2D>();
	private Point2D last = new Point2D.Double(10,10);
	private Point2D end;
	public KeyPanel(){
		this.setFocusable(true);
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyCode());
			     int keyCode = e.getKeyCode();
			     switch (keyCode) {
				case KeyEvent.VK_UP:
					addLine(0,-5);
					break;
				case KeyEvent.VK_DOWN:
					addLine(0,5);
					break;
				case KeyEvent.VK_LEFT:
					addLine(-5,0);
					break;
				case KeyEvent.VK_RIGHT:
					addLine(5,0);
					break;
				}
			}

			private void addLine(int dx,int dy) {
				end = new Point2D.Double(last.getX()+dx,last.getY()+dy);
				Line2D line = new Line2D.Double(last,end);
				lines.add(line);
				repaint();
				last = end;
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D)g;
	    for(Line2D line : lines){
	    	g2.draw(line);
	    }
	}
}
