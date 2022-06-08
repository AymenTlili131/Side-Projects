
public class Avion extends Vehicule implements Motorise
{
	public Avion(String a)
	{
		this.marque=a;
	}

	public void seDeplacer()
	{
		System.out.println("Je vole");
	}
	
	public String toString()
	{
		return "de type avion et de marque "+this.marque;
	}
	
	public double calculer()
	{ return this.prop*15;}
}
