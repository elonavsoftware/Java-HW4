package plants;

import graphics.ZooPanel;

/**
 * Lettuce class, extends Plant
 * @author Elon Avisror
 *
 */

public class Lettuce extends Plant
{
	ZooPanel mypanel;
	static private volatile Lettuce instance = null; 

	/**
	 * Lettuce constructor
	 * @param mypan
	 */
	private Lettuce(ZooPanel mypan)
	{	
		super(mypan);
		this.loadImages("lettuce.png");
	}
    public static Lettuce getInstance(ZooPanel z){
    	
    	if(instance ==null)
    		synchronized(ZooPanel.class)
    		{
    			if(instance==null)
    				instance=new Lettuce(z);
    		}
    	return instance;
    }	
} //class Lettuce extends Plant