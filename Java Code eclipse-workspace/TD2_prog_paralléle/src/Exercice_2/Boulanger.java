package Exercice_2;

public class Boulanger extends Thread{
	BoulVendSem Sem1;
	BoulEmpSem Sem;
	Panier p;
	Boulanger (BoulEmpSem Sem)
	{this.Sem=Sem;}
	Boulanger (BoulVendSem Sem1)
	{this.Sem1=Sem1;}
	
	Boulanger (BoulEmpSem Sem,BoulVendSem Sem1)
	{this.Sem1=Sem1;
	this.Sem=Sem;}
	
	public void run()
	{
		try 
		{
			while(true)
			{
				BoulEmpSem.SVide.acquire();
				BoulEmpSem.S.acquire();
				try {
					Sem.Prelever(50,4); /*consommer farine*/
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BoulEmpSem.S.release();
				BoulEmpSem.SVide.release();
				Thread.sleep((int)(1000*Math.random()));	
				
				
				BoulEmpSem.SVide.acquire();
				BoulEmpSem.S.acquire();
				try {
					Sem.Deposer (100); /*re-stock de farine*/
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BoulEmpSem.S.release();
				BoulEmpSem.SVide.release();
				Thread.sleep((int)(1000*Math.random()));	
				
			
				int m = (int)(5*Math.random());
				BoulVendSem.SVide1.acquire();
				BoulVendSem.S1.acquire();
					Sem1.DéposerB(p);
				BoulVendSem.S1.release();
				BoulVendSem.SVide1.release();
					Thread.sleep((int)(1000*Math.random()));
					
			}
			
		}
		catch(InterruptedException e){
			
		}
	}

	
}

