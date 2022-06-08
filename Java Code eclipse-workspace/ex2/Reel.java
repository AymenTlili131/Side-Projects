
public class Reel extends Affichage implements Operation 
{
double x;
public Reel(double a)
{this.x=a;}
Object plus(Object obj)
{	obj=(Reel)obj;
	this.x=this.x+obj.x;}
Object minus(Object obj)
{	obj=(Reel)obj;
	this.x=this.x-obj.x;}
}
