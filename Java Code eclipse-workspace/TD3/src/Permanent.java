
public class Permanent extends Employe {
	public Permanent(int a , String b ,float SB ,float P)
	{super(a,b);
	this.salaireBase=SB;
	this.prime=P;
	}
	public float setsalaireBase(float a)
	{return salaireBase=a;}
	public float setPrime(float a)
	{return prime=a;}
	protected float prime;
	protected float salaireBase;
	protected float calculerSalaire()
	{this.salaire=salaireBase+prime;
		return this.salaire;}
	public String toString()
	{return super.toString()+"salaire: "+this.calculerSalaire()+"\n";}
}
/* calculSalaire peut etre de type void et appelée dans le constructeur et puis dans chaque méthode 
 * qui fait intervenir l'appel de calculer salaire 2/ autrement on peut l'appeler dans toString
 */