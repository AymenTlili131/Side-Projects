
public class Racine 
{
float precision;float opérande;
public Racine (float a)
{
	this.precision=a;
	try {this.opérande=opérande;}
	catch (ExceptionValeurNégative e =new ExceptionValeurNégative(opérande))
	{	e.getMessage();
		if (opérande<0)
			opérande=- opérande;}
	finally 
	{ 
	if (opérande>0)
			this.opérande=opérande;
	}
}
public float getPrecision() 
{
	return this.precision;
}
public void setPrecision(float precision) 
{this.precision = precision;}
public float calcul (this.opérande)	
{ float a=0f,b=this.opérande;float s;
	s=(a+b)/2;
	while (abs(b-a)>this.precision)
	{
		if (s*s > this.opérande)
			b=s;
		else
			a=s;
	}
	s=(a+b)/2;
	return s;
}

}
