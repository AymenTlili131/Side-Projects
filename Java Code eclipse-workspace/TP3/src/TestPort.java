public class TestPort {
	public static void main(String[] args) 
	{Barque A =new Barque(" Meow ",1177,"extremly small and cute boat");
	 BarqueMoteur B= new BarqueMoteur("Cthulhu ",666,"Harbinger of doom",11);
	 Port P= new Port("Port Miami",2,100f);
	 P.entrer(B);P.entrer(A);
	 for(Barque i : P._L1)
		 System.out.println(i.nom);
	 System.out.println(P.Montant());
	}
}
