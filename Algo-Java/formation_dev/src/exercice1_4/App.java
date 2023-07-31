package exercice1_4;

import java.util.Scanner;

/*
 VARIABLE
    Somme est un reel
    Interet est un reel
    Annees est un entier
    ISimple est un reel
    IComposer est un reel
Debut du programme
    Ecrire "Saisir la somme"
    Lire <-- Somme
    Ecrire "Saisir l'Interet"
    Lire <-- Interet
    Ecrire "Saisir le nombre d'annees"
    Lire <-- Annees
    ISimple <-- Somme * (1 + Annees * Interet)
    IComposer <-- Somme * (1 + Interet)^Annees
    Ecrire "L'interet simple est ", ISimple " et l'interet composer est ",IComposer
Fin du programme

 */

public class App {

	public static void main(String[] args) {
		
		double Somme;
		double Interet;
		int Annees;
		double ISimple;
		double IComposer;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir la somme :");
		Somme = sc.nextDouble();
		
		System.out.println("Saisir l'interet :");
		Interet = sc.nextDouble();
		
		System.out.println("Saisir le nombre d'annees :");
		Annees = sc.nextInt();
		
		ISimple = Somme*(1+Annees*Interet/100d);
		IComposer = Somme*Math.pow(1+Interet/100d,Annees);
		
		System.out.println("l'interet simple vaut " + ISimple + " et l'interet compose vaut " + IComposer);
		
		sc.close();

	}

}
