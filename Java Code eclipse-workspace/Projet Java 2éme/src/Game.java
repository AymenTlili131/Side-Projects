import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
public class Game {
	static ArrayList<String> Dict = new ArrayList<String>();
	static HashMap<String, Double> Sac = new HashMap<String, Double>();
	static HashMap<String, Double> Valeurs = new HashMap<String, Double>();
	static String[] Alphabet = new String[] {"a","z","e","r","t","y","u","i","o","p","q","s","d","f","g","h","j","k","l","m","w","x","c","v","b","n","A","Z","E","R","T","Y","U","I","O","P","Q","S","D","F","G","H","J","K","L","M","W","X","C","V","B","N"};
	int player_to_move; //0,1,2,3
void fill_dict()
	{for (String i : Alphabet) 
    {	
		if (i=="a" || i=="A")
		{Sac.put(i ,(double) 4);
	    Valeurs.put(i, (double) 1);}
		if (i=="E" || i=="E")
		{Sac.put(i ,(double) 15);
	    Valeurs.put(i, (double) 1);}
		
		if (i=="j" || i=="J" || i=="q" || i=="Q")
		{Sac.put(i ,(double) 1);
	    Valeurs.put(i, (double) 8);}
	    if (i=="k" || i=="K" || i=="w" || i=="W" ||i=="w" || i=="x" || i=="X" || i=="y" || i=="Y" || i=="z"|| i=="Z" )
	    {Sac.put(i ,(double) 1);
	    Valeurs.put(i, (double) 10);}
	    if (i=="B" || i=="b" || i=="C" || i=="c" || i=="p" ||i=="P")
	    {Sac.put(i ,(double) 10);
	    Valeurs.put(i, (double) 3);}	    	
	    if (i=="f" || i=="F" || i=="H" || i=="h" || i=="v" || i=="V")
	    {Sac.put(i ,(double) 10);
	    Valeurs.put(i, (double) 4);}	    		
	    if (i=="d" || i=="D" || i=="g" || i=="G" || i=="m"|| i=="M")
	    {Sac.put(i ,(double) 10);
	    Valeurs.put(i, (double) 2);}
	}}
	public Game()
	{ 	fill_dict();
		Menu M = new Menu();
		ArrayList<Player> players = new ArrayList<Player>();
		for (int i : Menu.nbr_players)
		{
		//récuperer de Menu le nombre de joueurs
		Player P1= new Player("Ali02");
		}
	 try
	    {
	      // Le fichier d'entrée
	      File file = new File("Corpus FR.txt");    
	      // Créer l'objet File Reader
	      FileReader fr = new FileReader(file);  
	      // Créer l'objet BufferedReader        
	      BufferedReader br = new BufferedReader(fr);  
	      StringBuffer sb = new StringBuffer();    
	      String line;
	      while((line = br.readLine()) != null)
	      {
	        // ajoute la ligne au buffer
	        sb.append(line);      
	        sb.append("\n");  
	        String[] words = line.split("\\W+");
	        // for-each loop (boucle for améliorée)
	        for (String i : words) 
	        {
	        	Dict.add(i);
	        }
	      }
	      fr.close();     
	    }
	 	//While Sac.size!=0 && P
	 	//créer et détruire une instance turn
	 	// changer l'attribut playerto move
	
	}
/*Menu*/
/*import Dict*/
/*Historique*/
/*liste joueurs*/
/*P1 et créaton des Chevalets
 *P2 et créaton des Chevalets
 *turn to play
 */
/*shuffle , shuffle all*/
}

/*
void fill_Historique() throws SQLException
{
	{Player p1=null;
	/*Statement statement = con.createStatement();
	PreparedStatement ps=( Connexion.getConnection()).prepareStatement("SELECT * FROM Historique Where Player like ?");
	ps.setString(1,"%"+this+"%");
	ResultSet result= ps.executeQuery();
	while (result.next())
	{
	Produit p=new Produit(result.getInt(1),result.getString(2),result.getInt(3));
	p1=p;
	this.L_produit.add(p1);
	}
	ps.close();
}}
*/