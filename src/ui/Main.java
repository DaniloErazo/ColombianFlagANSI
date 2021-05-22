package ui;

import model.Stripe;
import thread.StripeThread;

public class Main {
	public final static String ESC   = "\u001b[";
	public static void main(String[] args) throws InterruptedException {
		int yellow = 43;
		int blue = 44;
		int red = 41;
		
		System.out.print(ESC+"2J");
		
		Stripe yellowS = new Stripe(yellow, 1, 100, 10, 25);
		Stripe blueS = new Stripe(blue, 10, 100, 15, 50);
		Stripe redS = new Stripe(red, 15, 100, 20, 50);
		
		StripeThread yellowST = new StripeThread(yellowS);
		StripeThread blueST = new StripeThread(blueS);
		StripeThread redST = new StripeThread(redS);
		
		yellowST.start();
		blueST.start();
		redST.start();
	

	}

}
