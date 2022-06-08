import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test  {
	
	public static void main(String[] args) 
	{	
		try
		 { Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogue","root", "");
		Traitement Test1 =new Traitement();
		Produit p0 = new Produit(65,"Javel Judy 5L",963);
		Produit p5 = new Produit(66,"Grésil Judy 1.5L",963);
		Produit p1= new Produit(70,"OMO",963);
		Produit p2 = new Produit(75,"Sachet noir",963);
		Produit p6 =new Produit(75,"Sachet poubelle ",100);
		Produit p3 = new Produit(80,"4 Oeufs ",963);
		Produit p4 = new Produit(85,"bouteille de Lait 1.5 L",963);
			Test1.save(p0);
		Test1.save(p1);
		Test1.save(p2);
		Test1.save(p3);
		Test1.save(p4);
		Test1.save(p5);
		
		System.out.println(Test1.toString());
		System.out.println(Test1.produitsParMC("Judy").toString());
		System.out.println(Test1.getProduit((double) p1.id).toString());
		System.out.println(Test1.updateProduit(p6).toString());
		System.out.println(Test1.toString());
		Test1.deleteProduit(p4);
		System.out.println(Test1.toString());
		
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}/*du main*/
}/*de la classe Test*/
