package Exercice_2;

import java.util.concurrent.Semaphore;
public class BoulEmpSem {
	

	static Semaphore SVide,Splein,S;
	public static int Stock_farine;


public BoulEmpSem(int N_boulanger)
{this.Stock_farine=this.Stock_farine+1000*N_boulanger;
SVide= new Semaphore(N_boulanger,true);
Splein= new Semaphore(N_boulanger,true);
S=new Semaphore(1,true);
}

public void Deposer (int m )throws Exception
{ 
this.Stock_farine+=m;
System.out.println(Thread.currentThread().getName()+" vient de fournir "+m);
}

public void Prelever(int m,int N_boulanger) throws Exception {
	if (this.Stock_farine>m)
	{this.Stock_farine-=m;
	System.out.println(Thread.currentThread().getName()+" vient de consommer "+m+ " farine");}
	else throw new Exception("Stock insuffisant");
	
	if (this.Stock_farine < this.Stock_farine+333*N_boulanger) {
		this.Stock_farine=this.Stock_farine+1000*N_boulanger;
	}
}
}