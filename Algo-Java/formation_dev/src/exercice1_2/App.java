package exercice1_2;

import java.util.Scanner;

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
public class App {

	public static void main(String[] args) {
		
		float rayon;
		double volume;
		double aire;
		
		final double PI = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir rayon :");
		rayon = sc.nextFloat();
		
		aire = 4 * PI * Math.pow(rayon, 2);
		aire = Math.round(aire * 1000.0) / 1000.0; //Arrondi à la troisième décimale
		System.out.println("L'aire de la sphère est de " + aire);
		
		volume = (4d/3) * PI * Math.pow(rayon, 3);
		//On met 4d pour que le résultat de 4/3 soit une valeur double.
		volume = Math.round(volume * 1000.0) / 1000.0; //Arrondi à la troisième décimale
		System.out.println("Le volume de la sphère est de " + volume);
		
		sc.close();
	}

}
