package corelesson7;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo6 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("我的窗体");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel3 panel = new MyPanel3();
		frame.add(panel);
		frame.setVisible(true);
	}
}
class MyPanel3 extends JPanel{
	private int x,y;
	public MyPanel3(){
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				  //以鼠标移动的点位左上角坐标画矩形
				x = e.getX();
				 y = e.getY();
				System.out.println(x+","+y);
				repaint();
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
		/*g.drawLine(10, 10, 100, 100);//直线由起点终点决定
		g.drawRect(10, 10, 100, 100);//矩形由左上角坐标宽度高度决定
	    g.drawString("helloworld", 100, 100);*/
		/*//也可以直接画图形对象
		Line2D line = new Line2D.Double(10,10,100,100);
		Rectangle2D rect = new Rectangle2D.Double(10,10,100,100);
		//转换画笔
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(line);
		g2.draw(rect);
	    */
		/*g.draw3DRect(10, 10, 100, 100, true);*/
		super.paintComponent(g);//清空面板
		g.drawRect(x, y, 100, 100);
		
		
	}
}
