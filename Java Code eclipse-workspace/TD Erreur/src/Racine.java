
public class Racine 
{
float precision;float op�rande;
public Racine (float a)
{
	this.precision=a;
	try {this.op�rande=op�rande;}
	catch (ExceptionValeurN�gative e =new ExceptionValeurN�gative(op�rande))
	{	e.getMessage();
		if (op�rande<0)
			op�rande=- op�rande;}
	finally 
	{ 
	if (op�rande>0)
			this.op�rande=op�rande;
	}
}
public float getPrecision() 
{
	return this.precision;
}
public void setPrecision(float precision) 
{this.precision = precision;}
public float calcul (this.op�rande)	
{ float a=0f,b=this.op�rande;float s;
	s=(a+b)/2;
	while (abs(b-a)>this.precision)
	{
		if (s*s > this.op�rande)
			b=s;
		else
			a=s;
	}
	s=(a+b)/2;
	return s;
}

}