public class Test
{
	public static void main(String [] args)
	 {Personne P=null;
		  //bloc try qui essaie de cr�er une personne
	 try {
	  P = new Personne("Ahmed","74"); 
	  //on pourra changer les valeurs et voir le comportement face aux erreurs
	  }
	  catch (NumberFormatException F)
	 {
		 if (P!=null) P.Age=0;
	 }
	 catch (AgeInvalideException A)
	 { //de plus le message dans le constructeur de l'erreur
		 System.out.println("Erreur lors de la cr�ation � cause de l'age inser�");
	 } catch (NomInvalideException e) {
		//ce bloc est autogener� car il n'y a pas de comportement sp�cifi� contre le manque de nomenclature
		e.printStackTrace();
	}

}
}