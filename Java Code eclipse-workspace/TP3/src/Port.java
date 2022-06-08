import java.util.ArrayList;
public class Port 
{
public Port(String a,int b, float c)
	 {
		 this.nom=a;
		 this._Capacité_acceuil_Barque=b;
		 this._taxe_j=c;
	 }

protected ArrayList<Barque> _L1 = new ArrayList<Barque>();
public int getCapAct()
{return _Hebergement_actuelle=_L1.size();}

public boolean add(Barque e)
 {
 assert _L1.size()<_Capacité_acceuil_Barque;
 return _L1.add(e);
 }

public boolean remove(Barque e)
 {
 assert _L1.size()>0;
 return _L1.remove(e);
 }

public final String toString()
{return "nom du Port : "+this.nom+" Capacité Maximale : "+this._Capacité_acceuil_Barque+" taxe hebdomadaire : "+_taxe_j+" Hebergement actuel: "+getCapAct();}

protected String nom;
	private int _Capacité_acceuil_Barque;
 	private int _Hebergement_actuelle ;
 	private float _taxe_j;
 protected void entrer (Barque f)
 {
	 if (_L1.add(f)==true)
		 System.out.println("\n Barque ajoutée avec succés .");
	 else
		 System.out.println("\n Capacité maximale atteint . Port Plein ! ");
 }
 protected void sortir (Barque f)
 {
	 if (_L1.remove(f)==true)
	 { System.out.println("\n Barque sortie avec succés .");}
	 else
		 {_Hebergement_actuelle=_L1.size();
	 System.out.println("\n Pas de Barques portant ce nome dans le port . Port peut etre Vide ! Nb barque :"+getCapAct());}
 }
protected float Montant()
{float Somme=0;
for(Barque i : _L1)
	{
		{ if (i instanceof BarqueMoteur)
			{if ( 0<((BarqueMoteur) i).getPuissance() && ((BarqueMoteur) i).getPuissance()<5)
				Somme=Somme + _taxe_j*1.1f;
			else 
				Somme=Somme + _taxe_j*1.2f;}
	
		else
		  Somme=Somme+_taxe_j;
		}
	} 
System.out.println(Somme);return Somme;
}
}
