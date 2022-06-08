
public class Voiture extends Vehicule implements Motorise
{ public Voiture(String a)
	{this.marque=a;}
 public void seDeplacer()
 {System.out.println( "je roule");}
 
 public String toString()
 {
	 return "de type Voiture et de marque "+this.marque;
 }
 public double calculer()
 {
	 return this.prop*2;
 }
}
