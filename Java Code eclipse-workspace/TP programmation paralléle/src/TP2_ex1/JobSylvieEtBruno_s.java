package TP2_ex1;

public class JobSylvieEtBruno_s implements Runnable{
	String nom;
	Compte_s compte;
	S�maphore_transacation Sem;
	public String getNom() {
		return nom;
	}
	public JobSylvieEtBruno_s(Compte_s comp) {
		this.compte = comp;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void run() {
		for (int i=0;i<=9;i++)
		{while(true)
		{try {
					Sem.SVide.acquire();
					Sem.S.acquire();
					try {
						effectuerRetrait(10);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Sem.S.release();
					Sem.SVide.release();
					Thread.sleep((int)(1000*Math.random()));}	
					
			 catch (Exception e1) {
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
		System.out.println("-----SOLDE-----"+" "+" | Derniere Operation Effectu�e Par : "+this.getNom());
		System.out.println(compte.getSolde());
		
	}
	
	public static void main(String[] args) {
		Compte_s compte= new Compte_s();
		JobSylvieEtBruno_s Bruno1 = new JobSylvieEtBruno_s(compte);
		JobSylvieEtBruno_s Sylvie2 = new JobSylvieEtBruno_s(compte);
		
		Bruno1.setNom("Bruno");
		Sylvie2.setNom("Sylvie");
		Thread Bruno = new Thread(Bruno1);
		Thread Sylvie = new Thread(Sylvie2);
		Bruno.start();
		Sylvie.start();
		System.out.println("3/il n ya pas d'acc�s concurrent � la ressource variable solde du compte grace � sychronized");
		System.out.println("4/non ,pas de probl�me.");
	}
}
