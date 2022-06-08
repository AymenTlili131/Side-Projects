
public class Test 
{ 
	public static void main(String[] args)
	{Matiére Java = new Matiére("Java",4f);
  Matiére CyberSécurité = new Matiére("CyberSécurité",2.5f);
  Matiére Algébre = new Matiére("Algrébre",5f);
  
  Etudiant A =new Etudiant("Ahmed","labyedh",1412);
  Etudiant B =new Etudiant("Gilles"," de Rais",1783);
  Etudiant C =new Etudiant("Pierre","kitten headpatter",1490);
  
  Section S1= new Section(30);
  Section S2= new Section(31);
  
  S1.ajout_etudiant(A);
  S1.ajout_etudiant(B);
  S1.ajout_etudiant(C);
  S1.ajout_matiére(Algébre);
  S1.ajout_matiére(Java);

  S2.ajout_etudiant(B);
  S2.ajout_etudiant(C);
  S2.ajout_matiére(CyberSécurité);
  S2.ajout_matiére(Java);
  
  A.fill_Bulletin();
  B.fill_Bulletin();
  C.fill_Bulletin();
  A.affichage();
  S2.affichage();
}}
