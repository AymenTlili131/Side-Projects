
public class Test 
{ 
	public static void main(String[] args)
	{Mati�re Java = new Mati�re("Java",4f);
  Mati�re CyberS�curit� = new Mati�re("CyberS�curit�",2.5f);
  Mati�re Alg�bre = new Mati�re("Algr�bre",5f);
  
  Etudiant A =new Etudiant("Ahmed","labyedh",1412);
  Etudiant B =new Etudiant("Gilles"," de Rais",1783);
  Etudiant C =new Etudiant("Pierre","kitten headpatter",1490);
  
  Section S1= new Section(30);
  Section S2= new Section(31);
  
  S1.ajout_etudiant(A);
  S1.ajout_etudiant(B);
  S1.ajout_etudiant(C);
  S1.ajout_mati�re(Alg�bre);
  S1.ajout_mati�re(Java);

  S2.ajout_etudiant(B);
  S2.ajout_etudiant(C);
  S2.ajout_mati�re(CyberS�curit�);
  S2.ajout_mati�re(Java);
  
  A.fill_Bulletin();
  B.fill_Bulletin();
  C.fill_Bulletin();
  A.affichage();
  S2.affichage();
}}
