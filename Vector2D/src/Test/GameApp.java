package Test;

public class GameApp {

	private static boolean isRunning = true;
	
	public static void init()
	{
		System.out.println("Hello World");
		isRunning = false;
	}
	
	public static void update()
	{
		
	}
	
	public static void end()
	{
		
	}
	
	public static boolean isRunning()
	{
		return isRunning;
	}
	
}
