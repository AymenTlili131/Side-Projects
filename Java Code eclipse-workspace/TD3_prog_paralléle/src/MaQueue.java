
public class MaQueue {
	private String valeur;
	private boolean disponible = false;
	
	public synchronized String get() throws InterruptedExceeption
	{
		while(disponible == false)
		{wait();}
		diponible=false;
	
	}
	
	public synchronized String set() throws InterruptedExceeption
	{
		while(disponible == false)
		{wait();}
		diponible=false;
		
}
}
