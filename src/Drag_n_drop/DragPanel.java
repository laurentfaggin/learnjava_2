package Drag_n_drop;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import utils.TransformImage;

public class DragPanel extends JPanel{
	
	ImageIcon image = TransformImage.scaleImage(new ImageIcon("/home/laurent/projets/JAVA/GUI_Swing/Images/cool.png"), 120, 120);
	final int WIDTH =  image.getIconWidth();
	final int HEIGHT =  image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	DragPanel(){
		
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
		}
	} 
	
	private class DragListener extends MouseMotionAdapter{
		
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			
			imageCorner.translate(
				(int)(currentPt.getX() - prevPt.getX()),
				(int)(currentPt.getY() - prevPt.getY())
			);
			prevPt = currentPt;
			repaint();
		}
		
	}
}
