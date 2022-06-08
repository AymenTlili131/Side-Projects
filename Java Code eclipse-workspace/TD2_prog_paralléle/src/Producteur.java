
public class Producteur extends Thread {
	ProdConsSem Sem;
	Producteur (ProdConsSem Sem)
	{this.Sem=Sem;}
	public void run(){
		try 
		{
			while(true)
			{int m = (int)(1000*Math.random());
			ProdConsSem.SVide.acquire();
			ProdConsSem.S.acquire();
				Sem.Deposer(m);
			ProdConsSem.S.release();
			ProdConsSem.SVide.release();
				Thread.sleep((int)(1000*Math.random()));
				
			}
		}
		catch(InterruptedException e){
			
		}
	}

}
