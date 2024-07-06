package utils;

import java.awt.Image;

import javax.swing.ImageIcon;

public class TransformImage {	
	
	public static ImageIcon scaleImage(ImageIcon p_image, int p_width, int p_heigth) {
		
		return new ImageIcon(p_image.getImage().getScaledInstance(p_width, p_heigth, Image.SCALE_SMOOTH));	
	}

}
