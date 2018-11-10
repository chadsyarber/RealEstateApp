package model.buildings;

import java.util.HashMap;

public abstract class Buildings
{
	private int floors;
	private HashMap<Integer, Integer> windows = new HashMap<Integer, Integer>();
	private int width;
	private int length;
	private int height;
	private double cost;
	private double value;

	/**
	 * @param floors
	 * @param windows
	 * @param width
	 * @param length
	 * @param height
	 */
	public Buildings(int floors, HashMap<Integer, Integer> windows, int width,
			int length, int height, double cost, double value)
	{
		super();
		this.floors = floors;
		this.windows = windows;
		this.width = width;
		this.length = length;
		this.height = height;
		this.cost = cost;
		this.value = value;
				
	}

	/**
	 * @return the cost
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	 * @return the value
	 */
	public double getValue()
	{
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value)
	{
		this.value = value;
	}

	/**
	 * @return the width
	 */
	public int getWidth()
	{
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(int width)
	{
		if(width < 1)
		{
			this.width = 1;
		}
		else
		{
			this.width = width;
		}
	}

	/**
	 * @return the length
	 */
	public int getLength()
	{
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length)
	{
		if(length < 1)
		{
			this.length = 1;
		}
		else
		{
			this.length = length;
		}
	}

	/**
	 * @return the height
	 */
	public int getHeight()
	{
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height)
	{
		if(height < 1)
		{
			this.height = 1;
		}
		else
		{
			this.height = height;
		}
	}

	/**
	 * Get the number of floors
	 * 
	 * @return
	 */
	public int getFloors()
	{
		return floors;
	}

	/**
	 * Set the number of floors
	 * 
	 * @param floors
	 */
	public void setFloors(int floors)
	{
		if(floors < 1)
		{
			this.floors = 1;
		}
		else
		{
			this.floors = floors;
		}
	}

	/**
	 * Get the windows mapping
	 * 
	 * @return
	 */
	public HashMap<Integer, Integer> getWindows()
	{
		return windows;
	}

	/**
	 * Set the window mapping
	 * 
	 * @param windows
	 *            First value is the key: floors Second value is how many
	 *            windows on that floor
	 */
	public void setWindows(HashMap<Integer, Integer> windows)
	{
		this.windows = windows;
	}

	@Override
	public String toString()
	{
		String rtn = "";
		rtn = "Building:[floors=" + floors;
		for(int i = 0; i < windows.size(); i++)
		{
			rtn += "";
		}
		return rtn;
	}

	public abstract double calcFloorSpace();// sqft

	public abstract double calcAppraiserValue();// sell value

	public abstract double calcNeighborhoodValue();// property value
}
