package Graphics;
import utils.TransformImage;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

public class MyPanel extends JPanel{
	
	Image image;
	
	MyPanel(){
		
		this.setPreferredSize(new Dimension(500, 500));
		ImageIcon icon = new ImageIcon("/home/laurent/projets/JAVA/GUI_Swing/Images/arbre.jpg");
		icon = TransformImage.scaleImage(icon, 500, 500);
		image = icon.getImage();
	}
	
	public void paint(Graphics g) {
		
		// cast g into Graphics2D
		Graphics2D g2D = (Graphics2D) g;
		
		//	IMAGE
		
		g2D.drawImage(image, 0, 0, null);
		
		//	LINE		
		//g2D.setColor(Color.blue);
		//g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		
		
		//	RECTANGLE VIDE (draw) ET PLEIN (fill)		
		//g2D.setPaint(Color.red);
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.fillRect(0, 0, 100, 200);
		
		//	CERCLE VIDE ET PLEIN		
		//g2D.setPaint(Color.green);
		//g2D.drawOval(0, 0, 100, 100);
		//g2D.fillOval(200, 200, 100, 100);

		//	BALLE POKEMON
		g2D.setPaint(Color.red);
		g2D.drawArc(0, 0, 100, 100, 180, 180);
		g2D.fillArc(0, 0, 100, 100, 0, 180);
		g2D.setPaint(Color.white);
		g2D.fillArc(0, 0, 100, 100, 180, 180);
		
		//	POLYGONE
		
		int[] xPoints = { 150,250,350 };
		int[] yPoints = { 300,150,300 };
		g2D.setPaint(Color.orange);
		//g2D.drawPolygon(xPoints, yPoints, 3);
		g2D.fillPolygon(xPoints, yPoints, 3);
		
		//	STRING
		
		//g2D.setPaint(Color.MAGENTA);
		//g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		//g2D.drawString("U R A WINNER! :D", 50, 50);
	}
}
