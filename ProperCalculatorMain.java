/* Artie Knapp
 * Proper Calculator Main
 * This is the main method to run the calculator.
 */
import java.util.Scanner;
public class ProperCalculatorMain
{
	public static void main(String[] args)
	{
		String input;
		String operation = null;
		Scanner sc = new Scanner(System.in);
		ProperCalculator calc = new ProperCalculator();
		double number;
		// Stores the number the user inputed
		double total;
		// Stores the total value of all operations
		
		input = sc.nextLine();
		
		while (true)
		// Checks if the first value the user inputs is a number. If not, display message and wait for
		// user to input again. If input is a number, break out of loop.
		{
			if (!calc.isNumber(input))
			{
				System.out.println("Invalid Input: First value must be a number.");
				input = sc.nextLine();
			}
			
			else
			{
				total = Double.parseDouble(input);
				break;
			}
		}
		
		while (!input.equals("quit"))
		// Accepts input until the user enters "quit"
		{
			if (!calc.isNumber(input))
			{
				if (calc.isOperation(input))
				// Checks if the user input a valid mathematical operation
				{
					operation = input; // Store operation in separate variable to be used later 
				}
				
				else if (input.equals("clear"))
				// Clears out total
				{
					total = 0;
					
					input = sc.nextLine();
					
					if (input.equals("quit"))
					// Break out of loop if user enters "quit"
					{
						break;
					}
					
					while (!calc.isNumber(input))
					// Checks if the user entered a number
					{
						System.out.println("Invalid Input: A number must be entered.");
						input = sc.nextLine();
					}
					
					total = Double.parseDouble(input);
				}
				
				else
				{
					System.out.println("Invalid Input");
				}
			} 
			
			else
			{			
				if (operation != null)
				{
					total = calc.performOperation(operation, total, input);
					System.out.println("Total = " + total);
				}
			}
			
			input = sc.nextLine();
		}
	}
}
