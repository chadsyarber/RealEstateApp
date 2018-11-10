package model.buildings;

import java.util.ArrayList;
import java.util.HashMap;

import model.buildings.appliances.Appliance;
import model.buildings.upgrades.Upgrades;

public class Garage extends Buildings
{
	private DoorType garageDoor;
	private ArrayList<Upgrades> upgrades;
	private ArrayList<Appliance> appliances;

	/**
	 * Basic Garage constructor
	 * 
	 * @param floors
	 * @param windows
	 * @param width
	 * @param length
	 * @param height
	 * @param garageDoor
	 * @param cost
	 * @param value
	 */
	public Garage(int floors, HashMap<Integer, Integer> windows, int width,
			int length, int height, double cost, double value, DoorType garageDoor)
	{
		super(floors, windows, width, length, height, cost, value);
		this.garageDoor = garageDoor;
	}

	/**
	 * @return the appliances
	 */
	public ArrayList<Appliance> getAppliances()
	{
		return appliances;
	}

	/**
	 * @param appliances
	 *            the appliances to set
	 */
	public void setAppliances(ArrayList<Appliance> appliances)
	{
		this.appliances = appliances;
	}

	/**
	 * @return the garageDoor
	 */
	public DoorType getGarageDoor()
	{
		return garageDoor;
	}

	/**
	 * @param garageDoor
	 *            the garageDoor to set
	 */
	public void setGarageDoor(DoorType garageDoor)
	{
		this.garageDoor = garageDoor;
	}

	/**
	 * @return the upgrades
	 */
	public ArrayList<Upgrades> getUpgrades()
	{
		return upgrades;
	}

	/**
	 * @param upgrades
	 *            the upgrades to set
	 */
	public void setUpgrades(ArrayList<Upgrades> upgrades)
	{
		this.upgrades = upgrades;
	}

	@Override
	public double calcFloorSpace()
	{
		int w = 0, l = 0, f = 0;
		w = this.getWidth();
		l = this.getLength();
		f = this.getFloors();
		double area = w * l * f;
		return area;
	}

	@Override
	public double calcAppraiserValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcNeighborhoodValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
