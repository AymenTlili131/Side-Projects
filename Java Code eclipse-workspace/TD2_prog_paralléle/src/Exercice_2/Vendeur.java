package Exercice_2;

import java.util.ArrayList;

public class Vendeur extends Thread{
	
	
	BoulVendSem Sem1;
	VendCliSem Sem2;
	static ArrayList<Client> L_C = new ArrayList<Client>();
	static ArrayList<Panier> L_p = new ArrayList<Panier>();
	Vendeur (BoulVendSem Sem1)
	{this.Sem1=Sem1;}
	
	
	Vendeur (VendCliSem Sem2,ArrayList<Client> L_C,ArrayList<Panier> L_p)
	{this.Sem2=Sem2;
	this.L_C=L_C;
	this.L_p=L_p;
	}
	
	
	public void run(){
		try 
		{
			while(true)
			{
				BoulVendSem.SVide1.acquire();
				BoulVendSem.S1.acquire();
					Sem1.PreleverB((int)(10*Math.random()));
				BoulVendSem.S1.release();
				BoulVendSem.SVide1.release();
				Thread.sleep((int)(1000*Math.random()));
				
			if (L_C.size()>1)	
			{	int index = (int)(Math.random() * L_p.size());
				VendCliSem.SVide2.acquire();
				VendCliSem.S2.acquire();
				Sem2.Vendre(L_p.get(index),L_C.get(0));
				VendCliSem.S2.release();
				VendCliSem.SVide2.release();
				Thread.sleep((int)(1000*Math.random()));
			}
			}
		}
		catch(InterruptedException e){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
