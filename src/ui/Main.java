package ui;

import model.Stripe;
import thread.StripeThread;

public class Main {
	
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print(ESC+"2J");//Clear screen
		//System.out.print(ESC+"0G"+ESC+"0d");//Cursor in 0,0
		int yellow = 43;
		int blue = 44;
		int red = 41;
		
		int width = 1;
		int max = 100;
		int length = 1;
		int maxL = 10;
		
		
		Stripe yellowS = new Stripe(yellow, 1, 100, 10, 25);
		Stripe blueS = new Stripe(blue, 10, 100, 15, 50);
		Stripe redS = new Stripe(red, 15, 100, 20, 50);
		
		StripeThread yellowST = new StripeThread(yellowS);
		StripeThread blueST = new StripeThread(blueS);
		StripeThread redST = new StripeThread(redS);
		
		yellowST.start();
		blueST.start();
		redST.start();
		
		yellowST.join();
		blueST.join();
		redST.join();

				
		
	

	}

}
