package Exercice_2;

import java.util.concurrent.Semaphore;

public class VendCliSem {
	static Semaphore SVide2,Splein2,S2;

	public VendCliSem(int taille_fil)
	{int N=taille_fil;
	SVide2= new Semaphore(N,true);
	Splein2= new Semaphore(N,true);
	S2=new Semaphore(1,true);
	}
	public Baguette Acheter(Client c) {
		
		if ((c.argent>250)&&(c.Num_achat<4))
			{Baguette b = new Baguette();
			c.argent =c.argent-250;
			c.Sachet[c.Num_achat]=b;
			c.Num_achat+=1;
			System.out.println(Thread.currentThread().getName()+" vient d'acheter une baguette ");
			return b;}
		else 
			return null;
		
	}

	public void Vendre(Panier p,Client c) {
		Baguette x =this.Acheter(c);
		if (x==null) {System.out.println("Vous n'avez pas assez d'argent ou le nombre d'achat autorisé est atteint");}
		else {
			if (p.Pan.size()>1)
			{System.out.println(Thread.currentThread().getName()+" vient de vendre une baguette ");
			p.Pan.remove(p.Pan.size()-1);}
			else {
				while(p.Pan.size()<1)
				{
					try {
						Thread.sleep((int)(1000*Math.random()));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}	
		
	}
}
