package model.buildings.upgrades;

/**
 * The Upgrades Super class
 * Upgrades can be in Rooms or Buildings
 * They can be:
 * 	Crown Molding
 * 	Hardwood floors
 * etc
 * @author Owner
 *
 */
public abstract class Upgrades
{
	private double costMaterials;
	private double costInstallation;
	/**
	 * @param costMaterials
	 * @param costInstallation
	 */
	public Upgrades(double costMaterials, double costInstallation)
	{
		super();
		this.costMaterials = costMaterials;
		this.costInstallation = costInstallation;
	}
	/**
	 * @return the costMaterials
	 */
	public double getCostMaterials()
	{
		return costMaterials;
	}
	/**
	 * @param costMaterials the costMaterials to set
	 */
	public void setCostMaterials(double costMaterials)
	{
		this.costMaterials = costMaterials;
	}
	/**
	 * @return the costInstallation
	 */
	public double getCostInstallation()
	{
		return costInstallation;
	}
	/**
	 * @param costInstallation the costInstallation to set
	 */
	public void setCostInstallation(double costInstallation)
	{
		this.costInstallation = costInstallation;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Upgrades [costMaterials=" + costMaterials
				+ ", costInstallation=" + costInstallation + "]";
	}
	
	public abstract double calcUpgradeValue();

}
