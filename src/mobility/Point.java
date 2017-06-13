package mobility;

/**
 * a Point Class, creating a point which contain x, y 
 * each of x, y is a 2d position
 * @author Mahdi Asali 
 *
 */

public class Point
{

	private int x; //the x value
	private int y; //the y value
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getX() { return x; }
	
	/**
	 * 
	 * @return
	 */
	public int getY() { return y; }
	
	/**
	 * 
	 * @param x
	 * @return
	 */
	public boolean setX(int x)
	{
		this.x = x;
		return true;
	}
	
	/**
	 * 
	 * @param y
	 * @return
	 */
	public boolean setY(int y)
	{
		this.y = y;
		return true;
	}
} //class Point