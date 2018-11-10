package model.buildings;

import java.util.HashMap;

public class Casino extends Buildings
{
	private double income;
	private double lowerValue;

	

	public Casino(int floors, HashMap<Integer, Integer> windows, int width,
			int length, int height, double cost, double value)
	{
		super(floors, windows, width, length, height, cost, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcFloorSpace()
	{
		// TODO Auto-generated method stub
		return 0;
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
