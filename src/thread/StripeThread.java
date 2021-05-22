package thread;

import model.Stripe;

public class StripeThread extends Thread {
	
	public final static String ESC   = "\u001b[";
	private Stripe flagStripe;
	
	public StripeThread(Stripe s) {
		flagStripe=s;
	}
	
	@Override
	public synchronized void run() {
		int max = flagStripe.getWidth();
		int maxL = flagStripe.getLength();
		int y = flagStripe.getY();
		int color = flagStripe.getColor();
		int sleep = flagStripe.getSleep();
		try {
			for (int i = 1; i <max; i++) {
				
				for (int j = y; j <maxL; j++) {
					
					System.out.print(ESC+ i + "G"+ESC+ j + "d");
					
					System.out.print(ESC+color+"m"+" ");
					
					Thread.sleep(sleep);
					
				}
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
