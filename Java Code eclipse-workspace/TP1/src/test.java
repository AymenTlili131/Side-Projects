public class test{
		public static void main(String[]args)
		{
			Compte c=new Compte();
			c.crediter(28.27f);
			c.affiche();
			c.debiter(170);
			c.affiche();
			Client c1=new Client("Aa","1");
			Client c2=new Client("Bb","2");
			Client c3=new Client("Cc","3");
			c1.Ouvrir_compte();
			c1.Deposer(100f, "2");
			c1.Afficher();
			c2.Ouvrir_compte();
			c2.fermerCompte("Bb");
		}
}