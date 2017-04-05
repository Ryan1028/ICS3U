package seftel;

import hsa_new.Console;
public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
		boolean rockChosen = false;
		boolean paperChosen = false;
		boolean scissorsChosen = false;
		//BufferedImage img = null;
				
		
		
		for (int counter = 0; counter<4; counter++)
			
		{
		
		c.println("chose rock paper or scissors");
		String ChoiceOne = c.readLine();
		if (ChoiceOne.equals("rock") && !rockChosen)
		{
			c.println("you win");
			rockChosen = true;
		}
		else if (ChoiceOne.equals("paper") && !paperChosen)
		{
			c.println("you lose");
			paperChosen = true;
			
		}
		else if (ChoiceOne.equals("scissors") && !scissorsChosen)
		{
			c.println("tie");
			scissorsChosen = true;
		}
		else
		{
			c.println("please dont chose the same path");
		}
		
		}
		c.println("your done now");
	}

}
