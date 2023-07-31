package exercice2_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Variables 
	annee est un entier

debut du programme
	ecrire "l'annee"
	<-- lire annee

Debut du si
 si a/4 et non par 100 ou /400
alors
ecrire " l'annee est bissextille"
sinon 
ecrire "l'annee n'est pas bissextille"
fin du si 
fin du programme
		 */
		
// Variables
		
	int annee;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Saisir l'annee : ");
	annee = sc.nextInt();
	
	// Debut du si 
	
	if (annee%4 == 0 && annee%100 != 0 ||annee%400 == 0)
	{
		System.out.println("L'annee "+annee+" est bisextille");
	}
	else
	{
		System.out.println("L'annee "+annee+" n'est pas bisextille");
	}
	sc.close();

	}

}
