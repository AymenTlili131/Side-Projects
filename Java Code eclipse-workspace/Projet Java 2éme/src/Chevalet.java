import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;
public class Chevalet 
{ /*List 7  lettres 
	Score
	Joueurs
	*/
	static String[] Alphabet = new String[] {"a","z","e","r","t","y","u","i","o","p","q","s","d","f","g","h","j","k","l","m","w","x","c","v","b","n","A","Z","E","R","T","Y","U","I","O","P","Q","S","D","F","G","H","J","K","L","M","W","X","C","V","B","N"};
	int Score;
	ArrayList<String> chars = new ArrayList<String>(); // Create an ArrayList object
	String Lettre_choisit;
	Player P;
	String P_name=P.Username;
	public Chevalet() {
		this.Score=0;
	}
	
	void add_char(String S)
	{
		boolean contains = Arrays.stream(Alphabet).anyMatch(S::equals);
		if ((contains==true) && (chars.size()<7))
		{
			chars.add(S);
		}
	}
	void use_char(String S,Square sq) /*check if entire word is in dictionary*/
	{
		boolean contains = chars.contains(S);
		if ((contains==true) && (sq.active==false) && P.allowedSQ.contains(sq.position))
		{
			chars.remove(S);
		}
	}
	int DisplayScore()
	{	Score=P.score;
		return this.Score;
	}
}
	