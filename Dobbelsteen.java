package yahtzee;

import java.util.Random;
import java.util.Scanner;

public class Dobbelsteen {


	public int dobbelA;
	public int dobbelB;
	public int dobbelC;
	public int dobbelD;
	public int dobbelE;
	
	Random r = new Random();
	
	
	public void gooien() {
		System.out.println("Alles is opnieuw gegooid");
			dobbelA = r.nextInt(6) + 1;
			dobbelB = r.nextInt(6) + 1;
			dobbelC = r.nextInt(6) + 1;
			dobbelD = r.nextInt(6) + 1;
			dobbelE = r.nextInt(6) + 1;

					
	} // ends method gooien
	
	public void gooien(String invoer) {

		if(invoer.contains("A")) {		
			dobbelA = r.nextInt(6) + 1;
			System.out.println("Dobbelsteen A is opnieuw gegooid");
		}
		
		if(invoer.contains("B")) {	
		dobbelB = r.nextInt(6) + 1;
		System.out.println("Dobbelsteen B is opnieuw gegooid");
		}
		
		if(invoer.contains("C")) {	
		dobbelC = r.nextInt(6) + 1;
		System.out.println("Dobbelsteen C is opnieuw gegooid");
		}
		
		if(invoer.contains("D")) {	
		dobbelD = r.nextInt(6) + 1;
		System.out.println("Dobbelsteen D is opnieuw gegooid");
		}
		
		if(invoer.contains("E")) {	
		dobbelE = r.nextInt(6) + 1;
		System.out.println("Dobbelsteen E is opnieuw gegooid");
		}
				
	}// ends method gooien(String invoer)
} // ends class
