package TP2_ex2;

public class Compte_ {
	private int solde =100;
	public synchronized boolean retirer(double montant) throws Exception {
		boolean res = false;
		if (solde>=montant) {
			solde-=montant;
			res=true;
		}
		else
		{	
			throw new Exception("SOLDE INSUFFISANT") ;
			
		}
		return res;
	}
	public synchronized void déposer(double montant) throws Exception {

			solde+=montant;
	}
	public int Consulter() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}

}
