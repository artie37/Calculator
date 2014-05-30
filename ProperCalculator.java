/* Artie Knapp
 * Proper Calculator
 * This is a proper calculator that works like a real one.
 */

public class ProperCalculator
{
	public boolean isNumber(String input)
	// Checks each character to see if it is a number. Returns true if number, false otherwise.
	{
		int decimalFlag = 0;
		
		for (char c : input.toCharArray())
		{
			if (!Character.isDigit(c))
			{
				if ((c != '.') || (decimalFlag == 1))
				// Not a valid number
				{
					return false;
				}
				
				decimalFlag++;
			}
		}
		
		return true;
	}
	
	public boolean isOperation(String input)
	// Checks if input is a valid mathematical operation and returns true, false otherwise.
	{
		if (input.equals("+"))
		{
			return true;
		}
		
		else if (input.equals("-"))
		{
			return true;
		}
		
		else if (input.equals("*"))
		{
			return true;
		}
		
		else if (input.equals("/"))
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
	
	public double performOperation(String op, double total, String num)
	{
		double number;
		// Stores string "num" to be calculated
		
		number = Double.parseDouble(num);
		
		if (op.equals("+"))
		{
			total += number;
		}
		
		else if (op.equals("-"))
		{
			total -= number;
		}
		
		else if (op.equals("*"))
		{
			total *= number;
		}
		
		else if (op.equals("/"))
		{
			total /= number;
		}
		
		return total;
	}
}