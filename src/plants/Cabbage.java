package plants;

import graphics.ZooPanel;

/**
 * Cabbage class, extends Plant
 * @author Elon Avisror
 *
 */

public class Cabbage extends Plant
{
	ZooPanel mypanel;
	
	/**
	 * Cabbage constructor
	 * @param mypan
	 */
	public Cabbage(ZooPanel mypan)
	{	
		super(mypan);
		this.loadImages("cabbage.png");
	}
} //class Cabbage extends Plant