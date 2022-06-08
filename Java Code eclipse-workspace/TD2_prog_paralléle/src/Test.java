
public class Test 
{ 
	public static void main(String[] args)
	{
	ProdConsSem PCS=new ProdConsSem(8);
	Producteur P= new Producteur(PCS);
	Consommateur C= new Consommateur(PCS);
	//generate getter and setters and give P and C names
	P.start();
	C.start();
	}
}
