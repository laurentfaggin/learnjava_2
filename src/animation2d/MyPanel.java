package animation2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.TransformImage;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	Image backGroundImage;
	Timer timer;
	int xVelocity = 2;
	int yVelocity = 1;
	int xPos = 0;
	int yPos = 0;
	
	MyPanel(){
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		
		ImageIcon icon = new ImageIcon("../GUI_Swing/Images/UFO.png");
		icon = TransformImage.scaleImage(icon, 50, 50);
		enemy = icon.getImage();
		
		ImageIcon bg = new ImageIcon("../GUI_Swing/Images/terre.jpeg");
		bg = TransformImage.scaleImage(bg, PANEL_WIDTH, PANEL_HEIGHT);
		backGroundImage = bg.getImage();
		
		timer = new Timer(10, this);
		timer.start();		
	}
	
	public void paint (Graphics g) {
		
		super.paint(g);   // paint background with the color define in MyPanel
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(backGroundImage, 0, 0,  null);
		g2D.drawImage(enemy, xPos, yPos, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (xPos >= PANEL_WIDTH - enemy.getWidth(null) || xPos < 0) {
			xVelocity *= -1;
		}
		xPos += xVelocity;
		
		if (yPos >= PANEL_HEIGHT - enemy.getHeight(null) || yPos < 0) {
			yVelocity *= -1;
		}
		yPos += yVelocity;
		repaint();
	}
	

}
