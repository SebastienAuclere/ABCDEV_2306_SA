package revision_algo_exercice1_2;

import java.util.Scanner;

public class App {
	/*
	 Variables
	rayon est un entier
	aire est un reel double
	volume est un reel double
Constantes
	pi est un reel double
Debut du programme
	Ecrire "Saisir le rayon"
	Lire rayon
	pi <-- 3.1415
	aire <-- 4*pi*rayon^2
	volume <-- 4/3*pi*rayon^3
	Ecrire "L'aire est : ",aire," Le volume est : ",volume
Fin du programme
	 */

	public static void main(String[] args) {
		//declaration des variables
		int rayon;
		double aire,volume;
		// declaration constante
		final double pi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon");
		rayon = sc.nextInt();
		pi = Math.PI;
		
		aire = 4d*pi*Math.pow(rayon, 2);
		aire = Math.round(aire*100.0)/100.0;
		volume = 4/3d*pi*Math.pow(rayon, 3);
		volume = Math.round(volume*100.0)/100.0;
		
		System.out.println("L'aire est : "+aire+" \nLe volume est : "+volume);
		
		sc.close();
	}

}
