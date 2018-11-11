package yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScoreBlad {
//	Dobbelsteen d = new Dobbelsteen ();
			
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
	
	int bonus;												// dit werkt niet
	int tot1 = (sc1 + sc2 + sc3 + sc4 + sc5 + sc6);			// dit werkt niet
	int tot2 = threeOfAKind + carre + fullHouse + kleineStraat + groteStraat + yahtzee + kans; 	// dit werkt ook niet
				
	boolean set1; 	// of een score al is ingevuld. als set = true, dan kan dit veld niet meer worden ingevuld.
	boolean set2;	// ik kwam er alleen nog niet helemaal uit.
	boolean set3;
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
		
		
		if (tot1 >= 63) {
			bonus = 35;
		}else {
			bonus = 0;
		}
	System.out.println("=========SCOREBLAD=========" +
						 "	\n 1 = Enen		" + sc1+
						"\n 2 = Tweeën		" + sc2 +
						"\n 3 = Drieën		" + sc3 +
						"\n 4 = Vieren		" + sc4 +
						"\n 5 = Vijven		" + sc5 +
						"\n 6 = Zessen		" + sc6 +
						"\n===========================" +
						"\n  TOTAAL 1E HELFT	" + tot1 +
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
						"\n  TOTAAL 2E HELFT	" + tot2 +
						"\n  TOTAAL 1E HELFT	" + (tot1 + bonus) +			
						"\n===========================" + 
						"\n EINDSCORE 		" +	(tot1 + bonus + tot2));
		}
	
	public void setScore(int dobbelA, int dobbelB, int dobbelC, int dobbelD, int dobbelE) {
		
		
	
		System.out.println("Hiermee moet je het doen: \nDobbelsteen A: " + dobbelA + 
											"\nDobbelsteen B: " + dobbelB + 
											"\nDobbelsteen C: " + dobbelC + 
											"\nDobbelsteen D: " + dobbelD + 
											"\nDobbelsteen E: " + dobbelE);
		
		int [] dobbelstenen = {dobbelA, dobbelB, dobbelC, dobbelD, dobbelE};
		Arrays.sort(dobbelstenen);		//sorteer de dobbelstenen van klein naar groot in een array, zodat vergelijkingen kunnen worden gemaakt.
		
	//	System.out.print("Dobbelstenen gesorteerd: ");			// later hoeft dit niet geprint te worden, 
		System.out.println(Arrays.toString(dobbelstenen));		// is ter controle voor mezelf. 
		
		
		System.out.println("\nWaar wil je de score invoeren?\n");
		
		printScoreSheet();
		Scanner scanner = new Scanner(System.in);
		int keuze = scanner.nextInt();
		
 
		{switch(keuze) {
	case 1:
//	if (set1 == true) {
//		System.out.println("Dit veld heb je al ingevuld. Maak een andere keuze!");
//		continue;
//	} else {		
		int counter = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i] ==1) {
			counter += 1;
			}
			sc1 = counter;
			set1 = true;
			}
		break;
	case 2:
		counter = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i] ==2) {
			counter += 2;
			}	
		sc2 = counter;
		set2 = true;
			}
		break;
	case 3:
		counter = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i] ==3) {
			counter += 3;
		}
		sc3 = counter;
		set3 = true;
		}
		break;
	case 4:
		counter = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i] ==4) {
			counter += 4;
		}
		sc4 = counter;
		set4 = true;
		}
		break;
	case 5:
		counter = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i] ==5) {
			counter += 5;
		}
		sc5 = counter;
		set5 = true;
		}
		break;
	case 6:
		counter = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i] == 6) {
			counter += 6;
		}
		sc6 = counter;
		set6 = true;
		}
		break;
	case 7:
		if (((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen[1] == dobbelstenen[2])) || 
			((dobbelstenen[1] == dobbelstenen[2]) && (dobbelstenen[2] == dobbelstenen[3])) ||
			((dobbelstenen[2] == dobbelstenen[3]) && (dobbelstenen[3] == dobbelstenen[4]))){
		threeOfAKind = dobbelA + dobbelB + dobbelC + dobbelD + dobbelE;
			}else {
			threeOfAKind = 0;
			}
		set7 = true;
		break;
	case 8:
		if (((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen[1] == dobbelstenen[2]) && (dobbelstenen[2] == dobbelstenen [3])) || 
			((dobbelstenen[1] == dobbelstenen[2]) && (dobbelstenen[2] == dobbelstenen[3]) && (dobbelstenen[3] == dobbelstenen[4]))){
			carre = dobbelA + dobbelB + dobbelC + dobbelD + dobbelE;
		}else {
			carre = 0;
		}
		set8 = true;
		break;
	case 9:
		if(((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen [2] == dobbelstenen [3]) && (dobbelstenen[3] == dobbelstenen[4])) ||
		  ((dobbelstenen[0] == dobbelstenen[1]) && (dobbelstenen [1] == dobbelstenen [2]) && (dobbelstenen[3] == dobbelstenen[4]))){
		fullHouse = 25;
		  }else { fullHouse = 0;
		  }
		set9 = true;
		break;
	case 10:
		if (dobbelstenen[0] == dobbelstenen[1]) {
			dobbelstenen[1] = 9;
		}
		if(dobbelstenen[1] == dobbelstenen[2]) {
			dobbelstenen[2] = 9;
		}
		if(dobbelstenen[2] == dobbelstenen[3]) {
			dobbelstenen[3] = 9;
		}
		if(dobbelstenen[3] == dobbelstenen[4]) {
			dobbelstenen[4] = 9;
		}
		
		Arrays.sort(dobbelstenen);
		if (((dobbelstenen[0]+1 == dobbelstenen[1]) && (dobbelstenen[1]+1 == dobbelstenen[2]) && (dobbelstenen[2]+1 == dobbelstenen [3])) || 
				((dobbelstenen[1]+1 == dobbelstenen[2]) && (dobbelstenen[2]+1 == dobbelstenen[3]) && (dobbelstenen[3]+1 == dobbelstenen[4]))){
		kleineStraat = 30;
				} else {
					kleineStraat = 0;
				}
		set10 = true;
		break;
	case 11:
		if ((dobbelstenen[0]+1 == dobbelstenen[1]) && (dobbelstenen[1]+1 == dobbelstenen[2]) && (dobbelstenen[2]+1 == dobbelstenen [3]) && (dobbelstenen[3]+1 == dobbelstenen [4])){
		groteStraat = 40;
		}else {
			groteStraat = 0;
		}
		set11 = true;
		break;
	case 12:
		if ((dobbelA==dobbelB) && (dobbelC == dobbelD) && (dobbelB == dobbelE) && (dobbelB==dobbelC)){
		yahtzee = 50;
		}else yahtzee = 0;
		set12 = true;
	case 13:
		kans = dobbelA + dobbelB + dobbelC + dobbelD + dobbelE;
		set13 = true;
		break;
	}	//ends switch
	} // ends while
		
		System.out.println("\n===========================\n");
		printScoreSheet();
		System.out.println("\n===========================\n");
		
		
//		if (yahtzee.ronde <13) {								// ik wil hier aangeven dat als de ronde <13, dat deze vraag gesteld wordt en anders niet. 
		String invoer = "";
		while (!invoer.equals("G")){
		System.out.println("Druk g om aan de volgende beurt te beginnen.");
		invoer = scanner.next().toUpperCase();
		}
		}	
//	}
	
	public void eindeSpel(){
		System.out.println("Gefeliciteerd! Je eindscore is " + (tot1 + bonus + tot2));
		System.out.println("Wil je nog een keer spelen? J/N");
		
		Scanner scanner = new Scanner(System.in);
		String invoer = scanner.next().toUpperCase();
		
	 while (!invoer.equals("J") && !invoer.equals("N")); // blijft de loop herhalen tot iemand J of N invoert.
	
	if (invoer.equals("J")) {
		System.out.println("Er wordt een nieuw spel gestart. Succes!");
		new Yahtzee().startSpel();	
	} else if (invoer.equals("N")) {
		System.out.println("U verlaat het spel. Bedankt voor het spelen.");
	}
	}
	
}
