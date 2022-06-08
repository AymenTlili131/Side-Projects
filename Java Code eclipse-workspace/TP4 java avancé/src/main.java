import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Personne P=new Personne ("nom1","prenom1",122);
		EcrirePersonne ec=new EcrirePersonne();
		ec.ecrire(P);
		ec.ecrire(new Personne("nom2","prenom2",133));
		ec.ecrire(new Personne("nom2","prenom2",133));
		LirePerspnne lp=new LirePersonne();
		lp.lire();
	}
	lp.recherche();

}
