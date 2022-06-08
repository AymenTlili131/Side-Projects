import java.util.ArrayList;

public class JobSylvieEtBruno implements Runnable{
	String nom;
	Compte compte;
	public String getNom() {
		return nom;
	}
	public JobSylvieEtBruno(Compte comp) {
		this.compte = comp;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void run() {
		for (int i=0;i<=9;i++)
		{
			try {
				effectuerRetrait(10);
			} catch (Exception e1) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void effectuerRetrait(int montant) throws Exception
	{	Thread.sleep(500);
		compte.retirer(montant);
		System.out.println("-----SOLDE-----"+" "+" | Derniere Operation Effectuée Par : "+this.getNom());
		System.out.println(compte.getSolde());
		
	}
	
	public static void main(String[] args) {
		Compte compte= new Compte();
		JobSylvieEtBruno Bruno1 = new JobSylvieEtBruno(compte);
		JobSylvieEtBruno Sylvie2 = new JobSylvieEtBruno(compte);
		
		Bruno1.setNom("Bruno");
		Sylvie2.setNom("Sylvie");
		Thread Bruno = new Thread(Bruno1);
		Thread Sylvie = new Thread(Sylvie2);
		Bruno.start();
		Sylvie.start();
		System.out.println("3/il n ya pas d'accés concurrent à la ressource variable solde du compte grace à sychronized");
		System.out.println("4/non ,pas de probléme.");
	}
}
