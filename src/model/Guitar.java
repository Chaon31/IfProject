package model;

public class Guitar
{
	//Declaration Section
	//Data member section
	//Also called instance variables
	//These are special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null
	
	private double scale;
	private String name;
	private int stringCount;
	private int fretCount;
	
	/**
	 * Default constructor for a Run.
	 * Initializes all variables to valid but "bad" values
	 * Used for later customization.
	 */
	public Guitar()
	{
		//Default constructor
	}
	
	public Guitar(double distance)
	{
		this.scale = distance;
	}
	
	public Guitar(double scale, String name, int stringCount, int fretCount)
	{
		this.scale = scale;
		this.name = name;
		this.stringCount = stringCount;
		this.fretCount = fretCount;
	}
	
	
	/**
	 * Initializes a Run instance with a value for the distance.
	 * @return distance The distance of the run.
	 */
	public double getScale()
	{
		return scale;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getStringcount()
	{
		return stringCount;
	}
	
	public int getFretCount()
	{
		return fretCount;
	}
	
	public void setScale(double Scale)
	{
		this.scale = Scale;
	}
	
	public void setStringName(String name)
	{
		this.name = name;
	}
	
	public void setStringCount(int timeMinutes)
	{
		this.stringCount = timeMinutes;
	}
	
	public void setFretCount(int timeHours)

	{
		this.fretCount = timeHours;
	}		

			
	
}

