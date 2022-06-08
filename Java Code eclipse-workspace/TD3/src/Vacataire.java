
public class Vacataire extends Employe {
	protected int nbHeures;protected float prixHeure ;
public Vacataire(int a , String b ,int nbHeures,float prixHeures)
{super(a,b);
this.prixHeure=prixHeures;
this.nbHeures=nbHeures;}

public int setnbHeures(int a)
{return nbHeures=a;
	}
public float setprixHeure(float f)
{return prixHeure=f;
	}

protected float calculerSalaire()
{return this.salaire=this.prixHeure*this.nbHeures;}
public String toString()
{return super.toString()+"salaire: "+this.calculerSalaire()+"\n";
	}
}
/* calculSalaire peut etre de type void et appelée dans le constructeur et puis dans chaque méthode 
 * qui fait intervenir l'appel de calculer salaire 2/ autrement on peut l'appeler dans toString
 */