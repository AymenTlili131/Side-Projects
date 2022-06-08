package Exercice_2;

public class Compte {
	int solde ;

	public Compte(int solde) {
		this.solde = solde;
	}
	public void affichage() 
	{
		System.out.println(this.solde);
	}
	public int getSolde() {
		return solde;
	}
	public void AjouterSolde(int somme) {
		this.solde = this.solde+somme;
	}
	
	public void RetrancherSolde(int somme) {
		if (this.solde-somme>0)
		this.solde = this.solde-somme;
		else System.out.println("Solde insuffisant");
	}
	
}
