package TP2_ex2;

public class Testing {

	public static void main(String[] args) {
		Compte_ C= new Compte_();
		ThreadDeposer TD= new ThreadDeposer(200.3,C);
		ThreadDeposer TR= new ThreadDeposer(10.3,C);
		TR.start();
		TD.start();
		
	}

}

///5) l'appel de retirer est suivie d'une attente de 2 secondes et puis une reprise et succession de depot jusqu'� la fin de l'execution du programme'
///6) la v�rification de la suffisance du solde se fait une seule dans la m�thode retirer donc il ya des cas ou le sodle peut etre n�gatif