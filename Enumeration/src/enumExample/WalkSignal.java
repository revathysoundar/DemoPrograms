package enumExample;

public class WalkSignal {

	
	private WalkSignalSymbol signal = WalkSignalSymbol.DONT_WALK;
	
	public boolean isShouldProceed()
	{
		return signal == WalkSignalSymbol.WALK;
	}
	
	public void whatDoIDo()
	{
		
		
		switch(signal)
		{
		case WALK:System.out.println("Go ahead and cross");
					break;
			
		case DONT_WALK:System.out.println("Dont cross. Just wait.");
						break;
			
		}
		if(signal == WalkSignalSymbol.WALK)
		{
			System.out.println("Go ahead and cross");
		}
		else if(signal == WalkSignalSymbol.DONT_WALK)
		{
			System.out.println("Dont cross. Just wait.");
		}
	}
	
	
}
