package yahtzee;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Yahtzee {

	ScoreBlad scoreblad = new ScoreBlad();
	Dobbelsteen dobbelsteen = new Dobbelsteen();
	static Scanner scan = new Scanner(System.in);
	static String invoer;

	public static void main(String[] args) {

		System.out.println("Welkom bij YAHTZEE!");
		do {
			System.out.println("Voer 'b' in om te beginnen en 's' om te stoppen");
			invoer = scan.next().toUpperCase();
		} while (!invoer.equals("B") && !invoer.equals("S")); // blijft de loop herhalen tot iemand B of S invoert.

		if (invoer.equals("B")) {
			System.out.println("We gaan beginnen! Succes!");

			new Yahtzee().startSpel();

		} else if (invoer.equals("S")) {
			System.out.println("U verlaat het spel. Bedankt voor het spelen.");
		}

		System.out.println("");

	} // sluit main

	public void startSpel() {
		
			
	
		for (int i = 0 ; i < 13 ; i++) {
		
			dobbelsteen.gooien();
			
			for (int x = 0; x < 2; x++) {
				
				// print resultaat
				System.out.println("Worp: " + (x+1));
				System.out.println("Dobbelsteen A: " + dobbelsteen.dobbelA + "\nDobbelsteen B: " + dobbelsteen.dobbelB + "\nDobbelsteen C: "
				+ dobbelsteen.dobbelC + "\nDobbelsteen D: " + dobbelsteen.dobbelD + "\nDobbelsteen E: " + dobbelsteen.dobbelE);
		
		
				//vraag wat speler wil doen
				System.out.println("Voer de dobbelstenen in die je opnieuw wilt gooien \nOF druk g om meteen opnieuw te gooien, \nOF druk op s om door te gaan naar je scoreblad!");
				invoer = scan.next().toUpperCase();
		
				if (invoer.equals("G")){
					dobbelsteen.gooien();
				} else if (invoer.equals("S")) {
					break;
				}  else {
					dobbelsteen.gooien(invoer);
				}
		
	
			} // sluit for loop van 3x gooien
			
			scoreblad.setScore(dobbelsteen.dobbelA, dobbelsteen.dobbelB, dobbelsteen.dobbelC, dobbelsteen.dobbelD, dobbelsteen.dobbelE);
			
		} // sluit for loop van spel
		
		scoreblad.eindeSpel();
	}
	

}
