public class Compte {
	static int compteur=0;
	String numero;
	private float solde;
	
	public Compte()
	{
		solde=0;
		compteur++;
		numero=String.valueOf(compteur);
	}
    void crediter(float x)
    {
    	solde+=x;
    	
    }
    void debiter(float x)
    {
    	if(x<=solde)
    		solde-=x;
    	else
    		System.out.println("solde insuffisant");
    		
    }
    float getsolde()
    {
    	return solde;
    	
    }
    void affiche() {
    System.out.println("le numero"+numero+"le solde ="+solde);
   
    }
    boolean verif(String x)
    {
    	return (x.equals(numero));
    		
    }
    
}