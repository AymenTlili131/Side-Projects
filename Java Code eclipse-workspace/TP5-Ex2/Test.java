
public class Test
{
	public static void main(String [] args)
	 {
		  //bloc try qui essaie de cr�er une personne
	 try {
	  Personne P = new Personne("Ahmed","74");}
	  catch (NumberFormatException F)
	 {P.Age=0;
	 }

}
