package TP2_ex1;

import java.util.concurrent.Semaphore;

public class Sémaphore_transacation {
		

		static Semaphore SVide,Splein,S;
		public static int Stock_farine;
	public Sémaphore_transacation(int N_Op)
	{
	SVide= new Semaphore(N_Op,true);
	Splein= new Semaphore(N_Op,true);
	S=new Semaphore(1,true);
	}

}
