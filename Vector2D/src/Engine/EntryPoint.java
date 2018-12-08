package Engine;

import Test.GameApp;

public class EntryPoint {

	public static void main(String args[])
	{
		
		GameApp.init();
		
		while(GameApp.isRunning())
		{
			
			GameApp.update();
			
		}
		
		GameApp.end();
		
	}
	
}
