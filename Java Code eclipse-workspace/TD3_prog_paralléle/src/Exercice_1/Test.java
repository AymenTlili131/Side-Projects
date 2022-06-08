package Exercice_1;

public class Test {

	public static void main(String[] args) {
		Chiffre C1= new Chiffre(10);
		Lettre L1= new Lettre("F",C1);
		while ((C1.max>0)||(L1.n)>=0)
		{try {
			C1.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			L1.CountDown();
		} catch (InterruptedException e) 
		{
			continue;
		}
		catch (IndexOutOfBoundsException e)
		{
			continue;
		}
		
		}
		System.out.println("----------------");
		Chiffre C= new Chiffre(10);
		Lettre L= new Lettre("F",C);
		C.start();
		L.start();
		
	}

}