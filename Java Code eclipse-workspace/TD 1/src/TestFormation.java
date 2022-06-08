import java.util.Scanner;

public class TestFormation {
	Scanner keyb=new Scanner(System.in);
	String str = nom1.nextLine();
	String str = nom2.nextLine();
	e1=new enseignant(nom1,spec1);
	e2=new enseignant(nom2,spec2);
	f= new formation(nom,e1);
	p= new Participant(nom_p,e2.spec2);
	p.affecterFormation(f);
	p.afficher();
	f=formation(nom,e2);
	p.affecterFormation(f);
	p.afficher()
	
}
