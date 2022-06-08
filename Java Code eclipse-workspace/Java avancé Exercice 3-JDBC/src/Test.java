
public class Test 
{/*insérer les données saisies au clavier à propos plusieurs étudiants appartenant à une section, 
et ce dans la BD.*/
	public static void main(String[] args) 
	{	
	Enseignant A1 =new Enseignant(007,"Ali","Mohammed","Maitre Assistant");
	Matiére phy=new Matiére(001,"Phy",3.5f,A1);
	Section S1=new Section(1,"IDSD");
	Etudiant B1=new Etudiant();
	
	
	S1.ajouter_Mat(phy);
	S1.ajouter_Etu(B1);
	
	S1.rechercheETU(001);
	S1.rechercheETU("Ali", "Mohammed");
	
	
	}
	
	

}
