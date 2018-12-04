package IfPackage;

import model.Guitar;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class IfController
{
	
	public void Start()
	{
		loopy();	
	}
	
	public void start()
	{
		
	}
	
	private void questions()

	{
		
	}
	
	/**this public boolean shows a message until someone gets a right number.
	 * 	  
	 * @param maybeInt
	 * @return
	 */
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You have to get the right number");
		}
		
		return isValid;
	}
		/*shows another message to the user
		 * 
		 * @param mightBeDouble
		 * @return
		 */
		public boolean validDouble(String mightBeDouble)
		{
			boolean isValid = false;
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Do you personally like to play the guitar?");
		}
		
		return isValid;
	}
	
	/**part of creating a loop for the guitar
	 * 
	 */
	private void loopy()
	{
		Guitar cedricPlays = new Guitar();
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 0;
		while (!isFinished)
		{
			
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
		
		 //This is a string thing because it says string
		String response = JOptionPane.showInputDialog(null, "Question");
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Get the right answer");
		}
		cedricPlays.setScale(Double.parseDouble(response));
		
		for(int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "This is execution number " + index);
		}
		
	}
	
	//it does something to help run my code, not quite sure what it does
	private void askUser()
	{
		Guitar userGuitar = new Guitar();
		
		//ask
		String response = JOptionPane.showInputDialog(null, "How many frets on a guitar???");
			
		//repeat until finished correctly
		while (response == null || !validDouble(response) || response.equals("Give the right answer"))
		{
		response = JOptionPane.showInputDialog(null, "No! Type in a valid nubmer for the frests or don't press cancel.");
		}
		//assign and convert
		userGuitar.setScale(Double.parseDouble(response));
		
		response = JOptionPane.showInputDialog(null, "what is the type of the guitar?");
		if (response.equalsIgnoreCase("CTEC"))
		{
			JOptionPane.showMessageDialog(null, "You either presss cancel, the x, or typed nothing >:[");
		}
	}
}