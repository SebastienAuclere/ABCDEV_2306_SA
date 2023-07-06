package Aire_Volume;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
			/*	
			VARIABLE
		    Rayon est un reel
		    Volume est un reel
		    Aire est un reel
		Constante
		    Pi est un reel
		Debut du programme
		    Ecrire "Saisir le rayon"
		    Lire <-- rayon
		    Aire <-- 4*Pi*Rayon^2
		    Volume <-- 4/3 * Pi * Rayon^3
		    Ecrire "L'aire de la sphere est ",Aire, " Le volume de la sphere est ",Volume
		Fin du programme
			 */
	
		// declaration des variables
		double rayon;
		double volume;
		double aire;
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir le rayon ");
		rayon = sc.nextInt();
		aire = 4*Math.PI*Math.pow(rayon,2);
		volume = 4/3d*Math.PI*Math.pow(rayon,3);
		
		System.out.println("L'aire de la sphere est de "+
				aire +" Le volume de la sphere est "+ volume);
				 
		sc.close();		
	}	
		
}
