package Exercice_2;

public class Opération extends Thread{
	String nom;
	Compte C;	
	public Opération(String nom, Compte compte) {
		this.nom = nom;
		this.C=compte;
	}
	
	public void retrait() throws InterruptedException {
		if (this.nom.equals("Retrait"))
			{this.C.RetrancherSolde(50);
			System.out.println(this.getName() +" a effecté un "+this.nom+" |Solde Courant: "+this.C.solde);
			Thread.sleep((int)(Math.random()*1000));}
	}
	public void déposer() throws InterruptedException {
		if (this.nom.equals("dépot"))
			{this.C.AjouterSolde(50);
		System.out.println(this.getName() +" a effecté un "+this.nom+" |Solde Courant: "+this.C.solde);
		Thread.sleep((int)(Math.random()*1000));}
	}
	
	
}
