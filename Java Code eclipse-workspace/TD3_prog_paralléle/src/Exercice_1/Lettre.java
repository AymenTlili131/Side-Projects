package Exercice_1;

import java.util.ArrayList;

public class Lettre extends Thread 
{	String[] Alphabet = {"A","B","C","D","E","F","G","H"};
	ArrayList<String> L =new  ArrayList<String>();
	Chiffre C;
	int n;
	public Lettre(String l,Chiffre C) {
		this.C=C;
		
		for(int i = 0 ; i<Alphabet.length;i++)
		{	if (Alphabet[i].equals(l));
				n=i;}
		for(int i = 0 ; i<n;i++)
		{L.add(Alphabet[i]);}
		this.n=L.size()-2;
	}
	
	public synchronized void CountDown() throws InterruptedException
	{		System.out.println( L.get(n));
			n--;
	}
	
	public void run()
	{   while (n>=0) {
		try {
			this.CountDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
	
}
