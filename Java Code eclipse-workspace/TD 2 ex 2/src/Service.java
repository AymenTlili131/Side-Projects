import java.util.Scanner;
public class Service {
	Scanner keyb;
	String nom_s;
	Employe chef;
	int nbMax,nbEmp;
	Employe tabEmp[]= new Employe[nbMax];
	public Service(String nom1 ,int nbMax1)
	{
		nom_s=nom1; nbMax=nbMax1;
	}
	public void getNom()
	{
		System.out.println("Le nom du service est "+ nom_s);
	}
	public Employe getchef()
	{
		if (chef!=null)
		System.out.println("Le nom du chef service est " + chef.getNom() );
		return /**/;
	}
	public void setchef(int mat)
	{
		chef=tabEmp[ mat-1001];
	}
	public void affecterEmp(int mat)
	{
		tabEmp[mat-1001].service.nom_s=nom_s;	
	}
	public void eliminerEmp(int mat)
	{for (int i=mat-1000;i<tabEmp.length;i++)
		tabEmp[i]=tabEmp[i+1]; /*pas d'appel auto de system.gc pour le dernier mais des affectation de null */
	}
	public void augmenterSalaire(float F)
	{
		for (int i=0;i<tabEmp.length;i++)
			tabEmp[i].augmenter_salaire(F);
	}
	public void affiche()
		{
		System.out.println("Description : Service "+ nom_s +"Chef Service : " + chef.afficher());
		for (int i=0;i<tabEmp.length;i++)
			tabEmp[i].afficher();
		}
	
		
}
