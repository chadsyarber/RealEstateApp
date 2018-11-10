package model.buildings.rooms;

/**
 * The rooms abstract.
 *  Types of rooms will draw from this class:
 *   Bedrooms
 * 	 Bathrooms 
 * 	 etc
 *  Each can have appliances or upgrades Rooms will be added to
 * anything that is a Buildings class All Buildings have rooms but will not be
 * apart of the Super class Buildings
 * 
 * @author Owner
 *
 */
public abstract class Rooms
{
	private double width;
	private double height;
	private double length;

	public Rooms(double width, double height, double length)
	{
		this.width = width;
		this.height = height;
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth()
	{
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(double width)
	{
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight()
	{
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public double getLength()
	{
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(double length)
	{
		this.length = length;
	}

	public abstract double calcArea();

}
