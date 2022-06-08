import java.util.HashSet;
import java.util.Set;

public class Section 
{ int num;
public  Set<Mati�re> Ensemble_mati�res = new HashSet<>();
public  Set<Etudiant> Ensemble_etudi = new HashSet<>();
public Section(int num) 
{
	this.num = num;
}
void ajout_etudiant(Etudiant e)
	{ Ensemble_etudi.add(e);
	}
void ajout_mati�re(Mati�re m)
	{	Ensemble_mati�res.add(m);
		for (Etudiant e : Ensemble_etudi) /*tout les etudiant inscrits � cette section auront cette mati�re*/
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
			{System.out.println("V�rifier l'inscription des �tudiants et les notes des mati�res !");}
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
{	System.out.println("Num�ro de la section : "+this.num+" de moyenne g�n�rale :"+this.moyenne()+"et une moyenne maximale de " +this.max());
	System.out.println("Liste des mati�res enseign�es");
	for (Mati�re m : Ensemble_mati�res)
		System.out.println("nom:"+m.Nom +" |coefficient:"+m.coef+"\n");
	System.out.println("Liste des �tudiants enseign�s");
	for (Etudiant e : Ensemble_etudi)
		System.out.println("nom:"+e.Nom +" |Cin:"+e.getCIN()+"\n");
}
}

