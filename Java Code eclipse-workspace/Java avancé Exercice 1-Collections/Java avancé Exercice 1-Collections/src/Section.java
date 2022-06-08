import java.util.HashSet;
import java.util.Set;

public class Section 
{ int num;
public  Set<Matiére> Ensemble_matiéres = new HashSet<>();
public  Set<Etudiant> Ensemble_etudi = new HashSet<>();
public Section(int num) 
{
	this.num = num;
}
void ajout_etudiant(Etudiant e)
	{ Ensemble_etudi.add(e);
	}
void ajout_matiére(Matiére m)
	{	Ensemble_matiéres.add(m);
		for (Etudiant e : Ensemble_etudi) /*tout les etudiant inscrits à cette section auront cette matiére*/
			e.Mat_ins.add(m);
	}
float max()
	{float max=0f;
	for (Etudiant e : Ensemble_etudi)
	{
		if (e.calculer_moy()>max)
			max=e.calculer_moy();
	}
	if (max==0f) 
			{System.out.println("Vérifier l'inscription des étudiants et les notes des matiéres !");}
	return max;
	}
float moyenne()
{float S=0f;
	for (Etudiant e : Ensemble_etudi)
	{S=S+e.calculer_moy();}
	return S/ Ensemble_etudi.size();}

int nbre()
	{return Ensemble_etudi.size();};

void affichage()
{	System.out.println("Numéro de la section : "+this.num+" de moyenne générale :"+this.moyenne()+"et une moyenne maximale de " +this.max());
	System.out.println("Liste des matiéres enseignées");
	for (Matiére m : Ensemble_matiéres)
		System.out.println("nom:"+m.Nom +" |coefficient:"+m.coef+"\n");
	System.out.println("Liste des étudiants enseignés");
	for (Etudiant e : Ensemble_etudi)
		System.out.println("nom:"+e.Nom +" |Cin:"+e.getCIN()+"\n");
}
}

