/*(Assignment: 4 || Campus: Beer Sheva || Author:  Mahdi Asali, Elon Avisror || ID: 206331795, 305370801)*/

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
	static private volatile Cabbage instance = null;
	
	/**
	 * Cabbage constructor
	 * @param mypan
	 */
	private Cabbage(ZooPanel mypan)
	{	
		super(mypan);
		this.loadImages("cabbage.png");
	}
	
	public void restore() { this.loadImages("cabbage.png"); }
	
	/**
	 * 
	 * @param z
	 * @return
	 */
    public static Cabbage getInstance(ZooPanel z)
    {
    	if(instance == null)
    		synchronized(ZooPanel.class)
    		{
    			if(instance == null)
    				instance = new Cabbage(z);
    		}
    	return instance;
    }	
} //class Cabbage extends Plant