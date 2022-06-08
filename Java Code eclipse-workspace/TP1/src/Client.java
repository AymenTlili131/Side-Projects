
public class Client {

	private String nom;
	private String prenom;
	private  int nbc;
	private Compte[]T;
	
	public Client(String nom,String pr)
	{this.nom=nom;
	this.prenom=pr;
	nbc=0;
	T= new Compte[10];
	}
	public void Ouvrir_compte()
{   if (nbc<10)
		T[nbc++]=new Compte();
	else
		System.out.println("Nbr de compte max atteint");
}
	public void Ouvrir_compte(Compte c)
	{T[nbc]=c;
				}
	public void fermerCompte(String x)
	{for (int i=0;i<nbc;i++)
		if( T[i].verif(x) )
			{for(int j=i;j<nbc-1;j++)
				T[j]=T[j+1];
			nbc--;
				};
	}	
	public void Deposer (float x,String nom)	
	{int i=0;
		for(i=0;i<nbc;i++)	
			if( T[i].verif(nom) && x>0 )
				T[i].crediter(x);
	}
	public void Retirer (float x,String nom)	
		{int i=0;
			for(i=0;i<nbc;i++)	
				{if( T[i].verif(nom) && x<T[i].getsolde())
					T[i].debiter(x);
					break;}
		}
	public void Afficher()
	{System.out.println("le nom: " + nom +"le prenom: " +prenom );
	float s=0;
		for(int i=0;i<nbc;i++)	
			{s+=T[i].getsolde();
			T[i].affiche(); }
	} 
	public boolean Verif(String x)
	{boolean test=false;
	for (int i=0;i<nbc;i++)
		if(T[i].verif(x))
		{test=true;;
		}
	return test;
	}
}