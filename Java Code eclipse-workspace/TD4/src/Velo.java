
public class Velo extends Vehicule
{
	public Velo(String a)
	{
		this.marque=a;
	}

	public void seDeplacer()
	{
		System.out.println("Je pédale");
	}
	
	public String toString()
	{
		return "de type vélo et de marque "+this.marque;
	}
	
}
