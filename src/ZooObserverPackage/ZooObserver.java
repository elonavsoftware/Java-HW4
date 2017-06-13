/*(Assignment: 4 || Campus: Beer Sheva || Author:  Mahdi Asali, Elon Avisror || ID: 206331795, 305370801)*/

package ZooObserverPackage;

import java.util.Observable;
import java.util.Observer;

import graphics.ZooPanel;

/**
 * ZooObserver class, extends Thread and implements Observer
 * @author Elon Avisror
 *
 */

public class ZooObserver extends Thread implements Observer
{
	ZooPanel panel;
	public ZooObserver(ZooPanel p)
	{
		this.panel = p;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			synchronized(this)
			{
				try
				{
					wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			panel.eatAn();
			panel.repaint();
		}
	}
	
	@Override
	public synchronized void update(Observable o, Object arg) { notify(); }
} //class ZooObserver extends Thread implements Observer