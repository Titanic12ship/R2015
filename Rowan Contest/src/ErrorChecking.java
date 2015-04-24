import java.io.Serializable;

import TurtleGraphics.KeyboardReader;

public class ErrorChecking {
	/**
	 * This class checks for validity of input. @author Eric Giovannini 
	 */
	
	
	public KeyboardReader r;
	private String message;
	

	public ErrorChecking(KeyboardReader reader) 
	{
		this.r = reader;
	}

	public double checker(double low, double high, boolean inclusive)
	{
		double value;
		value = r.readDouble();
		if (inclusive)
		{
			while (value < low || value > high)
			{
				System.out.println(value + " " + this.message);
				System.out.println("The value must be between " + low + " and " + high + ", inclusive");
				value = r.readDouble(); // NOT readInt();
			}
		} else {
			while (value <= low || value >= high)
			{
				System.out.println(value + " " + this.message);
				System.out.println("The value must be between " + low + " and " + high);
				value = r.readDouble(); // NOT readInt();
			}
		}
		return value;
	}
	
	public int checker(int low, int high, boolean inclusive)
	{
		int value;
		value = r.readInt();
		if (inclusive)
		{
			while (value < low || value > high)
			{
				System.out.println(value + " " + this.message);
				System.out.println("The value must be between " + low + " and " + high + ", inclusive");
				value = r.readInt();
			}
		} else
		{
			while (value <= low || value >= high)
			{
				System.out.println(value + " " + this.message);
				System.out.println("The value must be between " + low + " and " + high);
				value = r.readInt();
			}
		}
		return value;
	}
	
	public int checkerIntNoTop(int low)
	{
		int value;
		value = r.readInt();
		while (value < low) // inclusive
		{
			System.out.println(value + " " + this.message);
			System.out.println("The value must be greater than or equal to " + low);
			value = r.readInt();
		}
		return value;
	}
	
	
	public double checkerNoTop(double low)
	{
		double value;
		value = r.readDouble();
		while (value < low)
		{
			System.out.println(value + " " + this.message);
			System.out.println("The value must be greater than or equal to " + low);
			value = r.readDouble();
		}
		return value;
	}
	
	public void setMessage(String msg)
	{
		this.message = msg;
	}
}
