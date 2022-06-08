import javax.swing.JFrame;

public class Main 
{
	public static void main(String[] args) throws Unique_name_Exception 
	{/*on initialise 1 centre de formation ,2 formations ,
	 2 et 3 matiéres respectivement,5Participant parmi 1 est un étudiant*/
		Centre_formation C= new Centre_formation();
		
		Matiére Chimie=new Matiére("Chimie",4f,C);
		Matiére thermodynamiques=new Matiére("thermodynamiques",7f,C);		
		Matiére Statistiques_201=new Matiére("Statistiques_201",5f,C);
		
		Matiére Algorithmique =new  Matiére("Algorithmique",2f,C);
		Matiére Langage_Cs =new Matiére("Langage C sharp",3.5f,C);
		
		formation Phy_q= new formation("Physiques Quantiques",40f,100f,Chimie);
		formation GDev= new formation("Developpment jeux",25f,60f,Langage_Cs);
		
		C.ajouter_forma(Phy_q);
		C.ajouter_forma(GDev);
		C.aj_Mat_forma(thermodynamiques, Phy_q);
		C.aj_Mat_forma(Statistiques_201, Phy_q);
		C.aj_Mat_forma(Algorithmique, GDev);
		
		Participant A =new Participant(14314228, "A", "1", "13/01/1999");
		A.ajouter_adresse("Monastir");
		A.ajouter_formation(GDev,C);
		Participant B=new Participant(14314220, "B", "2", "13/01/1998");
		B.ajouter_adresse("Ariana");
		B.ajouter_formation(Phy_q,C);
		Etudiant C1= new Etudiant (14312222, "C", "3", "13/01/1998",(double) 71,"ENET'COM ");
		C1.ajouter_adresse("Ariana");
		C1.ajouter_formation(Phy_q,C);
		Participant D =new Participant(14314229, "D", "4", "13/01/1990");
		D.ajouter_formation(GDev,C);
		D.ajouter_adresse("Monastir");
		Participant E=new Participant(14314220, "E", "5", "13/01/2001");
		E.ajouter_adresse("Sfax");
		E.ajouter_formation(GDev,C);
		
		//Q1
			
				
		JFrame frame = new swing1(C);
}}

/*observation initiale (la méthode put du hashmap 
 * donne un affichage supplémentaire)
C.Consulter_forma();
C.Consulter_Mat();

test suppression formation
C.supprimer_forma(GDev); 
C.Consulter_forma();
C.ajouter_forma(GDev);
C.Consulter_forma();

test suppression matiére
C.supp_Mat_forma(Algorithmique, GDev);
C.Consulter_Mat();
GDev.aj_Mat_forma(Algorithmique, GDev);
C.Consulter_Mat();	

//Q2
System.out.println(C.Recherche_forma("Physiques Quantiques", 40f).getNom());

//Q3
System.out.println(C.Recherche_participant(14314228));

//Q4
A.fill_Bulletin();
A.afficher_bulletin();
System.out.print(A.calculer_moy());

B.fill_Bulletin();
B.afficher_bulletin();
System.out.print(B.calculer_moy());

C1.fill_Bulletin();
C1.afficher_bulletin();
System.out.print(C1.calculer_moy());

D.fill_Bulletin();
D.afficher_bulletin();
System.out.print(D.calculer_moy());

E.fill_Bulletin();
E.afficher_bulletin();
System.out.print(E.calculer_moy());

	 
//Q5
C.afficher_p(Phy_q);

//Q6 , il est recommendé d'executer Q4 pour des résultats significatfs
C.afficher_p_detail(Phy_q);

//Q7
System.out.println("La recette du centre de formation est" +C.recette());
System.out.println("bénifice de la formation 1" +C.bénifice_f(GDev));
System.out.println("bénifice de la formation 2" +C.bénifice_f(Phy_q));
System.out.println("le bénifice du centre de formation est :" +C.bénifice());
*/