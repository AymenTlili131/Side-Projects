package TP2_ex2;

public class ThreadDeposer extends Thread{
	double solde;
	Compte_ x;
	public ThreadDeposer(double solde,Compte_ c) {
		this.solde = solde;

	}
	
	public void D�poser(double montant) 
	{	
		try {
			this.x.d�poser(montant);
			this.notifyAll();
			System.out.println(this.x.Consulter());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
}
