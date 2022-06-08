package Exercice_2;
import java.util.concurrent.Semaphore;
public class BoulVendSem {

	static Semaphore SVide1,Splein1,S1;
	public BoulVendSem(int N_vendeur) 
	{
int n = N_vendeur;
Semaphore SVide1= new Semaphore(n,true);
Semaphore Splein1= new Semaphore(n,true);
Semaphore S1=new Semaphore(1,true);
}
	public void PreleverB(int n ) throws Exception 
{
	if ((n<4)&&(n>0))
	{	for(int i=0;i<n;i++)
			
			(Panier.Pan).remove(Panier.Pan.get(Panier.Pan.size() -1));
	}
	else  throw new Exception("Stock insuffisant");
	
	System.out.println(Thread.currentThread().getName()+" vient de Prelever "+n+" baguettes ");
}

	public Baguette DéposerB(Panier p) {
		Baguette b= new Baguette(p);
		p.Pan.add(b);
		System.out.println(Thread.currentThread().getName()+" vient de déposer une baguette ");
		return b;
		
	}

}
