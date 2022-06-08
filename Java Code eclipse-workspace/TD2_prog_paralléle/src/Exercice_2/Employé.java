package Exercice_2;

public class Employé extends Thread {
	BoulEmpSem Sem;
	Employé (BoulEmpSem Sem)
	{this.Sem=Sem;}
	public void run(){
		try 
		{
			while(true)
			{if (Sem.Stock_farine>500) 
				Thread.sleep((int)(100000*Math.random()));
			else {
			int m = (int)(1000*Math.random());
			BoulEmpSem.SVide.acquire();
			BoulEmpSem.S.acquire();
				try {
					Sem.Deposer(m);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			BoulEmpSem.S.release();
			BoulEmpSem.SVide.release();
				Thread.sleep((int)(100000*Math.random()));
			}
			}
		}
		catch(InterruptedException e){
			
		}
	}

}
