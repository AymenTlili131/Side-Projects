public class BarqueMoteur extends Barque 
 { private int _puissance;
	public BarqueMoteur(String a, double b, String c,int d) {
		super(a, b, c);
		this._puissance=d;
	}
	
	public final String toString()
	{
		return super.toString()+"Puissance Moteur: "+this._puissance+" \n";
	}

	final int getPuissance()
	{
		return this._puissance;
	}

}
