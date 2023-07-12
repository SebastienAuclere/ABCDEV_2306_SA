package deux_bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 /*
		 * Declaration des variables:
		 * annee est un entier
		 * debut du programme 
		 * ecrire "l'annee"
		 * <--lire annnee
		 * 
		 * Debut du si 
		 * si a/4 et non par 100 ou /400
		 * alors
		 * ecrire "l'annee est bissextile"
		 * sinon 
		 * ecrire " l'annee n'est pas bissextile"
		 * fin du si 
		 * fin du programme
		 */ 
		 
		 // declaration des variables
		int annee;		
		
		Scanner sc = new Scanner(System.in); 
	
		System.out.println("Saisir l'annee: ");
		annee = sc.nextInt();
		
		//debut du si
		if (annee%4 == 0 && annee%100 !=0 ||annee%400 == 0)
		{
			System.out.println("L'annee"+annee+"est bissextile ");	
		}
		else
		{
			System.out.println("L'annee"+annee+"n'est pas bissextile" );
		}
			
		sc.close();
	}
}