package Model;

import IfPackage.Run;

public class Model
{
	//Declaration Section
	//Data member section
	//Also called instance variables
	//These are special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null
	
	private double distance;
	private String name;
	private int timeMinutes;
	private int timeHours;
	
	/**
	 * Default constructor for a Run.
	 * Initializes all variables to valid but "bad" values
	 * Used for later customization.
	 */
	public Model()
	{
		//Default constructor
	}
	
	public Model(double distance)
	{
		this.distance = distance;
	}
	
	public Model(double distance, String name, timeMinutes, timeHours)
	{
		this.distance = distance;
		this.name = name;
		this.timeMinutes = timeMinutes;
		this.timeHours = timeHours;
	}
	
	
	/**
	 * Initializes a Run instance with a value for the distance.
	 * @return distance The distance of the run.
	 */
	public double getDistance()
	{
		return distance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	
	public int getTimeHours()
	{
		return timeHours;
	}
	
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	public void setStringName(String name)
	{
		this.name = name;
	}
	
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	
	public void setTimeHours(int timeHours)

	{
		this.timeHours = timeHours;
	}
	{
		
		public void start()
		{
			loopy();	
		}
		
		public void start()
		
		private void questions()
		
		public boolean validInt(String sample)
		
		public boolean validDouble(String example)
		
		private void loopy()
		{
			//define a variable before the loop
			boolean isFinished = false;
			while (!isFinished)
			{
				Run cedricRuns = new Run(;)
				//do code
				JOptionPane.showMessageDialog(null, "annoy everyone!!!!");
				
				someCount++;
				someCount += 1;
				
				//Update the test variable
				if (someCount > 20)
				{
					isFinished = true;
				}
			}
			
			String response = JOptionPane.showInputDialog(null, "Question");
			while(!validDouble(response))
			{
				JOptionPane.showMessageDialog(null, "Get the right answer");
			}
			cedricRuns.setDistance(Double.parseDouble(response)); 
			
	
}

