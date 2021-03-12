// Exercise on pages 184-185

public class DemoOverload
{
	public static void main(String[] args)
	{
		int month = 6, day = 24, year = 2021;
		displayDate(month);
		displayDate(month, day);
		displayDate(month, day, year);
	}
	// Defintion of displayDate that only accepts a single argument
	public static void displayDate(int mm)
	{
		System.out.println("Event date " + mm + "/1/2021");
	}

	// Defintion of displayDate that accepts TWO arguments
	public static void displayDate(int mm, int dd)
	{
		System.out.println("Event date " + mm + "/" + dd + "/2021");
	}

	// Defintion of displayDate that accepts THREE arguments
	public static void displayDate(int mm, int dd, int yy)
	{
		System.out.println("Event date " + mm + "/" + dd + "/" + yy);
	}
}