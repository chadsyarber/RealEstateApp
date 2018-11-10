package model.buildings.appliances;

/**
 * The Appliance abstract Super class
 * Applicances can be in:
 * 	Rooms
 * 	Buildings
 * 	Parks
 * They can range from:
 * 	Ceiling fans
 * 	Refrigerators
 * Each Appliance has a cost and a value with it
 * @author Owner
 *
 */
public abstract class Appliance
{
	private double cost;
	private double value;
	
	/**
	 * Constrcutor for the Appliance class
	 * 
	 * @param cost
	 * @param value
	 */
	public Appliance(double cost, double value)
	{
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

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Appliance [cost=" + cost + ", value=" + value + "]";
	}
	
	

}
