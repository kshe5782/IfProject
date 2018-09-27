package Model;

//Import section

//data member section
//Default values:
// All numbers => 0 
//boolean => false
//objects => null!!!! 
public class Model
{
	private String name;
	private boolean hasStrap;
	private double strapsNumber;
	private int location;
	{
	}

	/**
	 * Default constructor for after customization AKA I don't know info yet
	 * Initializing data members with "bad" values to be changed
	 */
	public Model()
	{
	}

	{

		this.name = "50 Cent";
		this.hasStrap = true;
		this.strapsNumber = -100;
		this.location = -801;
	}

	/**
	 * Better constructor (I know the info)
	 * 
	 * @param
	 */

	public void setName(String name)
	{
		this.name = name;
	}

	public void sethasStrap(boolean hasStrap)
	{
		this.hasStrap = hasStrap;
	}

	public void setstrapsNumber(double strapsNumber)
	{
		this.strapsNumber = strapsNumber;
	}

	public void setlocation(int location)
	{
		this.location = location;
	}
}