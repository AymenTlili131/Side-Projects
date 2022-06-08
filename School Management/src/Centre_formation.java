import java.util.*;
public class Centre_formation
{	
	public Centre_formation() {}
			
	public static ArrayList<formation> Liste_formations = new ArrayList() ;
	public static Set<Mati�re> Ensemble_mati�res = new HashSet<>();
	public static Set<Participant> Ensemble_part = new HashSet<>();
	public static HashMap<formation,ArrayList<Participant>> Dict_forma=
			new HashMap<formation,ArrayList<Participant>>();
	/*dictionnaire [formation M]=[Liste participants]*/
	
	public void Consulter_forma()
	{ 
		for (int i=0;i<Liste_formations.size();i++)
		{ 	ArrayList<Participant> A=new ArrayList();
			formation aux;
			if((Liste_formations.get(i)==null)||(Dict_forma==null))
				continue;
			else
			aux =Liste_formations.get(i);
			A= Dict_forma.get(aux);
			{System.out.println("nom de la formation:"+ aux.nom +" Mati�res:");
					for (Mati�re m:aux.Mat_inclue)
					System.out.println(m.nom+"");
			}
		}
		
	} 
	public void Consulter_Mat()
	{ String Q="";
		for (Mati�re M :Ensemble_mati�res)
		{ Q= Q +"Mati�re:"+M.nom +" de coefficient :"+M.coef+"\n";
		}
		System.out.println(Q);
	} 
	public void ajouter_forma(formation F)
	{	String Message;
		boolean A=true;
		Liste_formations.add(F);
		
		/*preparer la place dans le dictionnaire*/
		ArrayList<Participant> L_participant = new ArrayList();
		/*liste de participants � la formation*/
		 for (var p:Ensemble_part)
			{for (int i=0;i<Liste_formations.size();i++)
				{if (p.Lforma_ins.get(i)==F)
					L_participant.add(p);
					if (L_participant.add(p))
						A=false;
				}
			}
		/*ajout dans le dictionnaire*/
		Dict_forma.put(F, L_participant);
		/*message*/
		if (A==false)
			Message="succ�s d'ajout";
		else
			Message="Echec d'ajout";
	} 
	public void supprimer_forma(formation F)

	{	String Message;
		boolean A=true,B=true,C=true;
		for (var p:Ensemble_part) /*supprimer chez participant*/
		{
			for (int i=0;i<Liste_formations.size();i++)
			if (p.Lforma_ins.get(i)==F)
				{p.Lforma_ins.remove(F);
				if (p.Lforma_ins.remove(F) )
					A=false;}
		}
		/*supprimer de la liste de formation*/
		for (formation f :Liste_formations)
		{ if (f== F )
			{Liste_formations.remove(f);
			if (Liste_formations.remove(f))
				B=false;}
		}
		/*supprimer du dictionnaire*/
		Dict_forma.remove(F);
		if (Dict_forma.remove(F) ==null)
			C=false;
		
		/*preparation message*/
		if ((A==false)&&(B==false)&&(C==false))
			Message="succ�s de suppression";
		else
			Message="echec de suppression";
	}
	public void aj_Mat_forma(Mati�re M,formation F)
	{	int n = F.Mat_inclue.size();
		if (n<3)
		F.Mat_inclue.add(M);
	}
	public void supp_Mat_forma(Mati�re M,formation F)
	{	ArrayList<Mati�re> aux =new ArrayList<Mati�re>() ;int c=0;
		if ((Liste_formations.contains(F))&&(Ensemble_mati�res.contains(M)))
				{for(Mati�re W : F.Mat_inclue)
					if (W == M)
						continue;
					else
					{c++;
					aux.add(W);}
				}
		F.Mat_inclue=aux;
	}
	
 /*rechercher une formation par son nom et la dur�e*/
	formation Recherche_forma(String s,float f)
	{formation a = null;
		for (int i=0;i<Liste_formations.size();i++)
			if ((Liste_formations.get(i).nom ==s)&&((Liste_formations.get(i).Dur�e ==f)))
					a= Liste_formations.get(i);
	if (a!=null)
		return  a;
	else
		return null;
	}

/*Rechercher participant parCIN et afficher donn�es+liste des formations*/
	Participant Recherche_participant(double i)
	{/*parcours disctionnaire des formation 
	jusqu'� trouver  la formation  avec le participant portant ce CIN */
		Participant aux = null;
			for (ArrayList<Participant> A : Dict_forma.values())
			{ for (Participant p : A ) 
			{
				if (p.getCIN()==i)
					aux= p;
			}
			}
			return aux;
	}
/*Afficher la liste de participants pour une formation*/
	void afficher_p(formation f)
	{	if (Liste_formations.contains(f))
		{ArrayList<Participant> L = (ArrayList<Participant>) Dict_forma.get(f) ;
        for (Participant p:L)
            	System.out.println("Participant:"+p+"\n");}
	}
/*Afficher les d�tails de la formation*/
	void afficher_p_detail(formation f)
	{int nb_participant=0; int nb_reussites=0;;float moy_general=0;float taux_v=0;
	if (Liste_formations.contains(f))
		{ArrayList<Participant> L = (ArrayList<Participant>) Dict_forma.get(f) ;
    		for (Participant p : L)
    			{nb_participant++;
    			if (p.calculer_moy()>=10)
    				{System.out.println("\nParticipant Valid�:"+p+"\n");
    				nb_reussites++;}
    			moy_general=moy_general+p.calculer_moy();}
    		taux_v=nb_reussites/nb_participant;
    		moy_general=moy_general/nb_participant;
    System.out.println("moyenne g�n�rale:"+moy_general+" taux de reussite:"+taux_v);}
	}
/*calculer la recette du centre de formation*/
	public float recette()
	{float total=0f;
		for (formation f : Liste_formations )
		{ArrayList<Participant> L = (ArrayList<Participant>) Dict_forma.get(f) ;
		for (Participant p : L)
			 {if (p.Status=="Etudiant" )
				total=total+((Etudiant)p).calculer_prix();
			 if (p.Status=="Participant")
				 total=total+p.calculer_prix();}
		}	
	return total;
	}		
/* l'�nonc� n'est pas clair si le b�nifice d�signe la recette/formation(ben�fice moyen) 
 * ou si on veut calculer le b�nifice pour chaque formation f - on fait les deux :) */
 /*pour une formation f*/
	public ArrayList<Float> b�nifice_f(formation f)
	{  
	   ArrayList<Float> L1 = new ArrayList<Float>();
	   for (formation f1 : Liste_formations )
		{float total=0f;
		if (f==f1)
		{ArrayList<Participant> L = (ArrayList<Participant>) Dict_forma.get(f1) ;
		for (Participant p : L)
		 {if (p.Status=="Etudiant" )
			total=total+((Etudiant)p).calculer_prix();
		 if (p.Status=="Participant")
			 total=total+p.calculer_prix();
		 }
			L1.add(total);}
		}
	   return L1;}
	public float b�nifice()
	{
		return recette()/Liste_formations.size();
	}
}
