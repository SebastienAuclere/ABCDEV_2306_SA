package deux_bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// declaration des variables
		int annees;
		double calcul1;
		double calcul2;
		double calcul3;
		
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		
		//debut du programme
		System.out.println("ecrire le chiffre annees (exemple 1996): ");
		annees = sc.nextInt();
		calcul1 = (annees/4);
		calcul2 = (annees/100);
		calcul3 = (annees/400);
		
		System.out.println("resultat du calcul1 : "+calcul1);
		System.out.println("resultat du calcul2 : "+calcul2);
		System.out.println("resultat du calcul3 : "+calcul3);
		
		if (calcul1 = 1) {
			if(calcul2 = 0.1)
				
				calcul3 = 0.1) {
		

	}
		
		if(a < b && a < c) {
			if(b < c) {
				System.out.println(croissant+"a,b,c");
			}
			else {
				System.out.println(croissant+"a,c,b");
			}
		}
		else if(b < a  && b < c) {
			if(c < a) {
					System.out.println(croissant+"b,c,a");
				}
			else {
					System.out.println(croissant+"b,a,c");
				}
			}
		else{
			if(a < b) {
					System.out.println(croissant+"c,a,b");
				}
			else {
					System.out.println(croissant+"c,b,a");
				}
			}
		sc.close();
}
