/*(Assignment: 4 || Campus: Beer Sheva || Author:  Mahdi Asali, Elon Avisror || ID: 206331795, 305370801)*/

package mobility;

/**
 * ILocatable interface
 * @author Elon Avisror
 *
 */

public interface ILocatable
{
	
	/**
	 * @return the current location
	 */
	public Point getLocation();

	/**
	 * 
	 * @param location
	 *            the new location
	 * @return true if location is valid, false if not
	 */
	public boolean setLocation(Point location);
} //interface ILocatable