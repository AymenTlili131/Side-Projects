import java.sql.Connection;
import java.sql.DriverManager;
public class Connexion 
{ /*afficher la BD*/
	private static Connection con;
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");/*tester si le driver est chargé et existe*/
			System.out.println("Driver ok");
			String url ="jdbc:mysql://localhost:3306/catalogue";
			String user ="root";
			String pwd="";
			Connection con =DriverManager.getConnection(url, user, pwd);
			System.out.println("Connected ");
			}	
		catch (Exception e)
		{e.printStackTrace();	
		}
	}
	public static Connection getConnection()
	{return con ;}
}