
public class Reel extends Affichage implements Operation 
{
double x;
public Reel(double a)
{this.x=a;}
/*public Object plus(Object obj)
{	obj=(Reel)obj;
	this.x=this.x+obj.x;}
public Object moins(Object obj)
{	obj=(Reel)obj;
	this.x=this.x-obj.x;}*/
@Override
/*public Object plus(Object obj) {
	this.x =this.x+(double)obj;
	return this;
}*/
public Object plus(Object o)
{ return new Reel(x-((Reel)o).x);}
@Override
public Object moins(Object obj) {
	this.x=this.x-(double)obj;
	return this;
}
@Override
public String affiche() {
	return "Le reel est "+this.x ;
}
}
