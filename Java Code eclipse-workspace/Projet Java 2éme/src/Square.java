
public class Square {
/*active
 *multiplier
 *position
 *effect
 *color of icon 
 */
	boolean active =false;
	int multiplier =1;
	int position ;
	int effect; /*0 : no effect , 1: multiplier  letter 2:multiplier mot*/
	String icon_color;
	public Square(int pos,int eff , int mul)
	{ this.active =false;
		this.multiplier =mul;
		this.position=pos ;
		this.effect=eff;
	}
	public Square(int pos,int eff )
	{ this.active =false;
		this.position=pos ;	
		this.effect=eff;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getEffect() {
		return effect;
	}
	public void setEffect(int effect) {
		this.effect = effect;
	}
	public String getIcon_color() {
		return icon_color;
	}
	public void setIcon_color(String icon_color) {
		this.icon_color = icon_color;
	}	
}
