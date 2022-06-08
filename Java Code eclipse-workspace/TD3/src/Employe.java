
public class Employe 
{ 	public Employe(int a, String b)
	{this.matricule=a;
	this.nom=b;
	}
protected int matricule; 
protected String nom;protected float salaire;
public String toString()
{ return "matricule:"+this.matricule+" nom:"+this.nom;
	}
}
