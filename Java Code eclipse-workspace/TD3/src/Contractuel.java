
public class Contractuel extends Employe {
	public Contractuel(int a , String b ,float SB)
	{super(a,b);
	this.salaireBase=SB;}
	public float setsalaireBase(float f)
	{return salaireBase=f;}
	protected float salaireBase;
	protected float calculerSalaire()
	{this.salaire=salaireBase;
		return this.salaire;}
	public String toString()
	{return super.toString()+"salaire: "+this.calculerSalaire()+"\n";}
	
}
/* calculSalaire peut etre de type void et appelée dans le constructeur et puis dans chaque méthode 
 * qui fait intervenir l'appel de calculer salaire 2/ autrement on peut l'appeler dans toString
 */