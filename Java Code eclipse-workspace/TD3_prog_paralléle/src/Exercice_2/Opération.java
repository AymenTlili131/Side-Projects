package Exercice_2;

public class Op�ration extends Thread{
	String nom;
	Compte C;	
	public Op�ration(String nom, Compte compte) {
		this.nom = nom;
		this.C=compte;
	}
	
	public void retrait() throws InterruptedException {
		if (this.nom.equals("Retrait"))
			{this.C.RetrancherSolde(50);
			System.out.println(this.getName() +" a effect� un "+this.nom+" |Solde Courant: "+this.C.solde);
			Thread.sleep((int)(Math.random()*1000));}
	}
	public void d�poser() throws InterruptedException {
		if (this.nom.equals("d�pot"))
			{this.C.AjouterSolde(50);
		System.out.println(this.getName() +" a effect� un "+this.nom+" |Solde Courant: "+this.C.solde);
		Thread.sleep((int)(Math.random()*1000));}
	}
	
	
}
