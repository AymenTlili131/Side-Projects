
public class Test2 
{
	public static void main(String[] args) 
	{
	Complexe z= new Complexe(6,9d);
	Reel x=new Reel(5d) ;
	x.plus(4d);z.moins(7d);
	
	System.out.println(z.affiche());
	System.out.println(x.affiche());
	}
}
/* 