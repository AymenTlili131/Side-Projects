import java.util.ArrayList;

public class Test1 
{ public static void main(String[] args) 
  {
	ArrayList<Vehicule> L1=new ArrayList<Vehicule>();
	Avion A1= new Avion("Airbus 3700");Voiture A2= new Voiture("Aston Martin S");
	Velo A3= new Velo("Honda xr650");
	L1.add(A1);
	L1.add(A2);
	L1.add(A3);
	for (Vehicule i : L1)
	{
		System.out.println(i.toString());
		i.seDeplacer();
		/*var a = ((Object)i).getClass().getSimpleName();
		System.out.println(a);
		System.out.println(((a)i).calculer());*/
		if (i instanceof Avion )
		{	System.out.println(((Avion) i).calculer());}
		if (i instanceof Voiture)
		{System.out.println(((Voiture) i).calculer());}
	}
  }
}
