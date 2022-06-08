package TP2_ex1;

public class Compte_s {
	private int solde =100;
	public synchronized void retirer(int montant) throws Exception {
		if (solde>=montant) {
			solde-=montant;
		}
		else
		{	
			throw new Exception("SOLDE INSUFFISANT") ;
			
		}
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}

}
