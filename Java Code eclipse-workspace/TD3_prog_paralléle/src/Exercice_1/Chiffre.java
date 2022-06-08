package Exercice_1;

public class Chiffre extends Thread {
	
	int max;
	public Chiffre(int max) {
		this.max = max;
	
	}
	public synchronized void countDown() throws InterruptedException
	{	
			
			System.out.println(this.max);
			this.max--;
			Thread.sleep(200);	
	}
	
	public void run()
	{ while (this.max>0) {
		try {
			this.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}
	
}
