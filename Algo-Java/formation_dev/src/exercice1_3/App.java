package exercice1_3;

import java.util.Scanner;

/*
 VARIABLE
    Rayon est un reel
    Angle est un reel
    Aire est un reel
Constante
    Pi est un reel
Debut du programme
    Ecrire "Saisir le rayon"
    Lire <-- Rayon
    Ecrire "saisir l'angle"
    Lire <-- Angle
    Aire <-- (Pi * Rayon^2 * Angle)/360
    Ecrire "l'aire du secteur circulaire est ",Aire
Fin du programme

 */

public class App {

	public static void main(String[] args) {
		// declaration des variables
		double rayon;
		double angle;
		double aire;
		
		final double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon");
		rayon = sc.nextDouble();
		System.out.println("Saisir l'angle");
		angle = sc.nextDouble();
		
		aire = (pi * Math.pow(rayon, 2) * angle)/360;
		aire = Math.round(aire * 1000.0) / 1000.0;
		
		System.out.println("L'aire du secteur circulaire est : " + aire);
		
		sc.close();

	}

}
