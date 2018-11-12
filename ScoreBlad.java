package yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScoreBlad {
			
	int sc1;
	int sc2;
	int sc3;
	int sc4;
	int sc5;
	int sc6;
	int threeOfAKind;
	int carre;
	int fullHouse;
	int kleineStraat;
	int groteStraat;
	int yahtzee;
	int kans;
				
	boolean set1; 	// of een score al is ingevuld. als set = true, dan kan dit veld niet meer worden ingevuld.
	boolean set2;	// ik kwam er alleen nog niet helemaal uit
	boolean set3;	// hoe ik de speler dan opnieuw kan laten kiezen, zonder dat het spel doorgaat.
	boolean set4;
	boolean set5;
	boolean set6;
	boolean set7;
	boolean set8;
	boolean set9;
	boolean set10;
	boolean set11;
	boolean set12;
	boolean set13;

	
	public void printScoreSheet() {	
		int bonus;												
		int tot1 = sc1 + sc2 + sc3 + sc4 + sc5 + sc6;			
		int tot2 = threeOfAKind + carre + fullHouse + kleineStraat + groteStraat + yahtzee + kans; 	
		
		if (tot1 >= 63) {
			bonus = 35;
		}else {
			bonus = 0;
		}
	System.out.println("\n=========SCOREBLAD=========" +
						 "	\n 1 = Enen		" + sc1+
						"\n 2 = Tweeën		" + sc2 +
						"\n 3 = Drieën		" + sc3 +
						"\n 4 = Vieren		" + sc4 +
						"\n 5 = Vijven		" + sc5 +
						"\n 6 = Zessen		" + sc6 +
						"\n===========================" +
						"\n  SUBTOTAAL 1E HELFT	" + tot1 +
						"\n BONUS bij 63 of meer 	" + bonus + 
						"\n===========================" +
						"\n 7 = Three of a Kind	" + threeOfAKind +
						"\n 8 = Carré		" + carre +
						"\n 9 = Full House		" + fullHouse +
						"\n 10 = Kleine Straat	" + kleineStraat +
						"\n 11 = Grote Straat	" + groteStraat +
						"\n 12 = Yahtzee		" + yahtzee +
						"\n 13 = Kans		" + kans +
						"\n===========================" +
						"\n  SUBTOTAAL 2E HELFT	" + tot2 +
						"\n  SUBTOTAAL 1E HELFT	" + (tot1 + bonus) +			
						"\n===========================" + 
						"\n TOTAAL 		" +	(tot1 + bonus + tot2));
		
	} // ends method printScoreSheet
	
	public void setScore(int dobbelA, int dobbelB, int dobbelC, int dobbelD, int dobbelE) {
		
		System.out.println("\n\nHiermee moet je het doen: \nDobbelsteen A: " + dobbelA + 
											"\nDobbelsteen B: " + dobbelB + 
											"\nDobbelsteen C: " + dobbelC + 
											"\nDobbelsteen D: " + dobbelD + 
											"\nDobbelsteen E: " + dobbelE);
		
		int [] dobbelstenen = {dobbelA, dobbelB, dobbelC, dobbelD, dobbelE};
		Arrays.sort(dobbelstenen);		//sorteer de dobbelstenen van klein naar groot in een array, zodat vergelijkingen kunnen worden gemaakt.
		
//		System.out.print("Dobbelstenen gesorteerd: ");			// later hoeft dit niet geprint te worden, 
//		System.out.println(Arrays.toString(dobbelstenen));		// is ter controle voor mezelf. 
		
		printScoreSheet();
		System.out.println("\nWaar wil je de score invoeren?\n");
		Scanner scanner = new Scanner(System.in);
		int keuze = scanner.nextInt();
		
		{switch(keuze) {
			case 1:
				if (set1 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
					} else {		
						for (int i = 0; i < dobbelstenen.length; i++) {
							if (dobbelstenen[i] ==1) {
								sc1 += 1;
							}
						set1 = true;
						}
				}
			break;
			case 2:
				if (set2 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				for (int i = 0; i < dobbelstenen.length; i++) {
						if (dobbelstenen[i] ==2) {
						sc2 += 2;
					}	
				set2 = true;
				}
			}
			break;
			case 3:
				if (set3 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {				
				for (int i = 0; i < dobbelstenen.length; i++) {
					if (dobbelstenen[i] ==3) {
						sc3 += 3;
					}
				set3 = true;
				}
			}
			break;
			case 4:
				if (set4 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				for (int i = 0; i < dobbelstenen.length; i++) {
					if (dobbelstenen[i] ==4) {
						sc4 += 4;
					}
				set4 = true;
				}
				}
			break;
			case 5:
				if (set5 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				
				for (int i = 0; i < dobbelstenen.length; i++) {
					if (dobbelstenen[i] ==5) {
						sc5 += 5;
					}
					set5 = true;
				}
				}
			break;
			case 6:
				if (set6 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				for (int i = 0; i < dobbelstenen.length; i++) {
					if (dobbelstenen[i] ==5) {
						sc6 += 6;
					}
					set6 = true;
				}
				}
			break;
			case 7:
				if (set7 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				if (((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen[1] == dobbelstenen[2])) || 
					((dobbelstenen[1] == dobbelstenen[2]) && (dobbelstenen[2] == dobbelstenen[3])) ||
					((dobbelstenen[2] == dobbelstenen[3]) && (dobbelstenen[3] == dobbelstenen[4]))){
						threeOfAKind = dobbelA + dobbelB + dobbelC + dobbelD + dobbelE;
				}else {
					threeOfAKind = 0;
				}
					set7 = true;
				
				}
			
			break;
			case 8:
				if (set8 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				if (((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen[1] == dobbelstenen[2]) && (dobbelstenen[2] == dobbelstenen [3])) || 
					((dobbelstenen[1] == dobbelstenen[2]) && (dobbelstenen[2] == dobbelstenen[3]) && (dobbelstenen[3] == dobbelstenen[4]))){
						carre = dobbelA + dobbelB + dobbelC + dobbelD + dobbelE;
				}else {
					carre = 0;
				}
					set8 = true;
				}
			break;
			case 9:
				if (set9 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				if(((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen [2] == dobbelstenen [3]) && (dobbelstenen[3] == dobbelstenen[4])) ||
					((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen [1] == dobbelstenen [2]) && (dobbelstenen[3] == dobbelstenen[4]))){
						fullHouse = 25;
				}else { fullHouse = 0;
				}
			set9 = true;
				}
			break;
			case 10:
				if (set10 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				if (dobbelstenen[0] == dobbelstenen[1]) {		// dit zorgt ervoor dat dubbele waarden uit de opeenvolgende reeks worden getrokken
					dobbelstenen[1] = 9;						// zodat een worp van 1 2 2 3 4  wordt veranderd naar 1 2 3 4 9
				}												// en de logica van 4 opeenvolgende values kan worden gevonden als conditie voor kleine straat
				if(dobbelstenen[1] == dobbelstenen[2]) {
					dobbelstenen[2] = 9;
				}
				if(dobbelstenen[2] == dobbelstenen[3]) {
					dobbelstenen[3] = 9;
				}
				if(dobbelstenen[3] == dobbelstenen[4]) {
					dobbelstenen[4] = 9;
				}
				
				Arrays.sort(dobbelstenen);			// opnieuw sorteren omdat de waarden opeenvolgend moeten worden gevonden. 
				if (((dobbelstenen[0]+1 == dobbelstenen[1]) && (dobbelstenen[1]+1 == dobbelstenen[2]) && (dobbelstenen[2]+1 == dobbelstenen [3])) || 
					((dobbelstenen[1]+1 == dobbelstenen[2]) && (dobbelstenen[2]+1 == dobbelstenen[3]) && (dobbelstenen[3]+1 == dobbelstenen[4]))){
						kleineStraat = 30;
				} else {
					kleineStraat = 0;
				}
					set10 = true;
				}
			break;
			case 11:
				if (set11 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				if ((dobbelstenen[0]+1 == dobbelstenen[1]) && (dobbelstenen[1]+1 == dobbelstenen[2]) && (dobbelstenen[2]+1 == dobbelstenen [3]) && (dobbelstenen[3]+1 == dobbelstenen [4])){
					groteStraat = 40;
				}else {
					groteStraat = 0;
				}
				set11 = true;
				}
			break;
			case 12:
				if (set12 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				if ((dobbelA==dobbelB) && (dobbelC == dobbelD) && (dobbelB == dobbelE) && (dobbelB==dobbelC)){
					yahtzee = 50;
					System.out.println("HOERA! YAHTZEE!");
				}else {
					yahtzee = 0;
				}
				set12 = true;
				}
			break;
			case 13:
				if (set13 == true) {
					System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");		// ik wil zorgen dat de speler een nieuwe keuze moet maken, dus dat het spel niet doorgaat. 
					setScore(dobbelA, dobbelB, dobbelC, dobbelD, dobbelE);
					break;
				}else {	
				kans = dobbelA + dobbelB + dobbelC + dobbelD + dobbelE;
				}
				set13 = true;
				
			break;
		}	//ends switch
	} 

		System.out.println("\n===========================\n");
		printScoreSheet();
		System.out.println("\n===========================\n");
	
	}	
	
	public void eindeSpel(){
		System.out.println("\nJe kaart is vol! Wil je nog een keer spelen? J/N");
		
		Scanner scanner = new Scanner(System.in);
		String invoer = scanner.next().toUpperCase();
		
			while (!invoer.equals("J") && !invoer.equals("N")); // blijft de loop herhalen tot iemand J of N invoert.
					if (invoer.equals("J")) {
						System.out.println("Er wordt een nieuw spel gestart. Succes!");
						new Yahtzee().startSpel();	
					} else if (invoer.equals("N")) {
						System.out.println("U verlaat het spel. Bedankt voor het spelen.");
					} // sluit else if
		} // sluit method eindeSpel
} // sluit class
