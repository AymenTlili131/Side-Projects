 
class Test
{
  public static void main(String [] args)
 {
	  //bloc try qui essaie de cr�er 2 temps dont l'un est erron�
 try {
  Temps T = new Temps(21, 12, 37);
  T.affiche();
  T = new Temps(25, 62, -1);//temps invalide pour tester les composantes du code
  T.affiche();
 }
 catch (TempsException e) //bloc catch avec un affichage au cas ou TempsException est lev�
 {System.out.println("\t Temps invalide \n"); }
 }
} 