package corelesson7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("我的窗体");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MousePanel panel = new MousePanel();
		frame.add(panel);
		frame.setVisible(true);
	}
}
class MousePanel extends JPanel{
	private ArrayList<Rectangle2D> rects = new ArrayList<Rectangle2D>();
	public MousePanel(){
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Rectangle2D rect = find(e.getPoint());
				if(rect!=null){
					rect.setFrame(e.getX()-15,e.getY()-15,30,30);
					repaint();
				}
			}
		});
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Rectangle2D r = new Rectangle2D.Double(e.getX()-15, e.getY()-15, 30, 30);
				Rectangle2D rect = find(e.getPoint());
				if(rect==null)
				rects.add(r);
				repaint();
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Rectangle2D rect = find(e.getPoint());
				if(e.getClickCount()>=2 && rect!=null){
					rects.remove(rect);
					repaint();
				}
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D)g;
		for(Rectangle2D rect : rects){
			g2.draw(rect);
		}
	}
	/*
	 * 按下的点是否被一个矩形包含 写成函数，并返回矩形
	 */
	private Rectangle2D find(Point2D p){
		for(Rectangle2D rect : rects){
			if(rect.contains(p))
				return rect;
		}
		return null;
	}
}
