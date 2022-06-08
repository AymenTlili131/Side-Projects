
public class Test 
{
	public static void main(String[] args)
	{
Auteur A1=new Auteur( "Mohamed" );
Auteur A2=new Auteur("Ali");
Auteur A3=new Auteur("Yves");
Livre L1= new Livre ("l'amour au temps du choléra" , [A1]);
Livre L2= new Livre("fahrenheit 451" , [A2,A1]);
Livre L3= new Livre ("Les Gauloises bleues", [A3,A2]);
/*Auteur[] tabAut={A1};*/
/*new Auteur[]={A3,A2};*/
L1.Auteur.afficher();
for (int i=0;i<L2.tabAuteur.length;i++)
	L2.i.afficher();
L1.getPremierAuteur();
}
}