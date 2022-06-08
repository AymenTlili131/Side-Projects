import java.util.ArrayList;
import java.util.Random;

public class MonThread extends Thread{
	ArrayList<Integer> m1;
	ArrayList<Integer> m2;
	int i;
	int j;
	int value;
	public MonThread (int i,int j,ArrayList<Integer> m1,ArrayList<Integer> m2) {
		this.m1=m1;
		this.m2=m2;
		this.i=i;
		this.j=j;
	}
	public void run() {
		value=0;
		for(int k=0;k<m1.size();k++) {
			value+=(m1.get(k)*m2.get(k));
		}
		System.out.println(value);
	}
	public int getValue() {
		return value;
	}
	public int getX() {
		return i;
	}
	public int getY() {
		return j;
	}
}

