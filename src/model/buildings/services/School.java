package model.buildings.services;

import java.util.HashMap;

import model.buildings.Buildings;

public class School extends Buildings
{

	public School(int floors, HashMap<Integer, Integer> windows)
	{
		super(floors, windows);
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
