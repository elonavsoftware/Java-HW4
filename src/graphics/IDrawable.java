package graphics;

import java.awt.Graphics;

/**
 * IDrawable interface, that draw in the panel and zoo
 * @author Elon Avisror
 *
 */

public interface IDrawable
{
	 public final static String PICTURE_PATH = "pictures\\";
	 public void loadImages(String nm);
	 public void drawObject(Graphics g);
	 public String getColor();	 
} //interface IDrawable
