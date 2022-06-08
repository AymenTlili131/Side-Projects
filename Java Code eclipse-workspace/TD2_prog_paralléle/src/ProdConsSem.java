import java.util.concurrent.*;
public class ProdConsSem {
static Semaphore SVide,Splein,S;
int Tampon[];
int queue,tete,N;


public ProdConsSem(int taille)
{N=taille;
Tampon= new int[N];
SVide= new Semaphore(N,true);
Splein= new Semaphore(N,true);
S=new Semaphore(1,true);
}
public void Deposer (int m )throws InterruptedException
{Tampon[queue]=m;
queue= (queue+1)%N;
System.out.println(Thread.currentThread().getName()+" vient de produire "+m);
}
public int Prelever() {
	int m=Tampon[tete];
	tete=(tete+1)%N;
	System.out.println(Thread.currentThread().getName()+" vient de produire "+m);
	return m;}
}

