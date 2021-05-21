package ui;

import java.util.Iterator;

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
		
		for (int i = 1; i <max; i++) {
			
			for (int j = 1; j <maxL; j++) {
				
				System.out.println(ESC +  j + ";" + i + "H");
				
				System.out.print(ESC+yellow+"m"+" ");
				
				System.out.print(ESC+yellow+"m"+" ");
				
				Thread.sleep(50);
				
			}
			
			
			
			
		}
		
		
		
	
		
		
		
	

	}

}
