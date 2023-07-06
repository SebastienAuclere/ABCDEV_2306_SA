package exempleSphere;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		variable:
		    R est un nombre réel
		    Aire est un réel
		    Volume est un réel
		debut programme
		    Ecrire "Saisissez le rayon de la sphère:"
		    Lire <-- R    
		    Aire <--4*pi*R^2
		    Volume <-- (4/3)*pi*R^3
		    Ecrire "l'Aire et le Volume de la sphère sont :",Aire,"et",Volume
		fin de programme 
		*/
		/*public static void main(String[] args) {
			// declaration des variables
			int nombre1;
			int nombre2;
			int resultat;
			Scanner sc;
			sc = new Scanner(System.in);
			//Scanner sc = new Scanner(System.in);
			
			System.out.println("Saisir le 1er nombre ");
			nombre1 = sc.nextInt();
			System.out.println("Saisir le 2eme nombre ");
			nombre2 = sc.nextInt();
			resultat = nombre1 + nombre2;
			
			System.out.println("Le resultat de l'addition de "+
								nombre1 +" et "+ nombre2 + " est "+
								resultat);
			sc.close();
			*/
			// declaration des variables
			double rayon;
			double aire;
			double volume;
			Scanner sc;
			sc = new Scanner(System.in);
			//Scanner sc = new Scanner(System.in);
			
			//debut du programme
			System.out.println("Saisir le rayon ");
			rayon = sc.nextDouble();
			aire = 4*Math.PI*Math.pow(rayon,2);
			volume = 4/3d*Math.PI*Math.pow(rayon,3);
			
			System.out.println("l'Aire et le Volume de la sphère sont : "+aire+" et "+volume);
			sc.close();
	}

}
