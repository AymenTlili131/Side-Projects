
public class Personnel {
Employe []emp=new Employe[100];
int nb=0;
public void ajouterEmploye(Employe e)
{
	emp[nb++]=e;
}
void afficherSalaire()
{for(int i=0;i<nb;i++)
	System.out.println(emp[i].calculSalaire());
}
float salaireMoyen()
{ float som=0;
	for(int i=0;i<nb;i++)
		som+=emp[i].calculSalaire();
	return som/nb;
	}
}

