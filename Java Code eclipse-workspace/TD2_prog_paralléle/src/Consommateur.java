
public class Consommateur extends Thread {
	ProdConsSem Sem;
	Consommateur (ProdConsSem Sem)
	{this.Sem=Sem;}
	public void run(){
		try 
		{
			while(true)
			{
			ProdConsSem.SVide.acquire();
			ProdConsSem.S.acquire();
				int m = Sem.Prelever();
			ProdConsSem.S.release();
			ProdConsSem.SVide.release();
				Thread.sleep((int)(1000*Math.random()));
				
			}
		}
		catch(InterruptedException e){
			
		}
	}

}
