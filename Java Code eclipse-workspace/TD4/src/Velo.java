
public class Velo extends Vehicule
{
	public Velo(String a)
	{
		this.marque=a;
	}

	public void seDeplacer()
	{
		System.out.println("Je p�dale");
	}
	
	public String toString()
	{
		return "de type v�lo et de marque "+this.marque;
	}
	
}
