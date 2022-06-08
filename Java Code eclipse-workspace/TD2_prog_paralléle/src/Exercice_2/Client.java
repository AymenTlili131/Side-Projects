package Exercice_2;

public class Client extends Thread {
	public int argent;
	int Num_achat;
	Baguette[] Sachet = new Baguette[3];
	int nb_b_demandé;
	
	
	
	
	VendCliSem Sem2;
	Client (VendCliSem Sem2,int arg,int nb_b_demandé)
	{this.Sem2=Sem2;
	this.argent=arg;
	this.nb_b_demandé=nb_b_demandé;
	Vendeur.L_C.add(this);
	}
	public void run(){
		try 
		{
			while(true)
			{
				VendCliSem.SVide2.acquire();
				VendCliSem.S2.acquire();
				Baguette b = Sem2.Acheter(this);
				VendCliSem.S2.release();
				VendCliSem.SVide2.release();
				Thread.sleep((int)(1000*Math.random()));
				
			}
		}
		catch(InterruptedException e){
			
		}
	}

}
