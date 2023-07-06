package exercice4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*variables
	    somme est un reel
	    interet est un reel
	    annees est un entier
	    interet simple est un reel
	    interet compose est un reel
	debut du programme
	    ecrire "entrer la somme"
	    Lire <-- somme  
	    ecrire "entrer les interets" 
	    Lire <-- interets 
	    ecrire "entrer les annees" 
	    Lire <-- annees
	    interet simple < -- Somme(1+annees*interets)
	    interet compose < -- Somme(1+interets)*annees
	    ecrire "interet simple",interet simple,"interet compose",interet compose
	fin du programme  	
		*/
		/*
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
		*/
		//declaration des variables
			double somme;
			double interets;
			int annees;
			double interetSimple;
			double interetCompose;
			Scanner sc;
			sc = new Scanner(System.in);
			//Scanner sc = new Scanner(System.in);
			//debut du programme
			System.out.println("Saisir la somme ");
			somme = sc.nextDouble();
			System.out.println("Saisir les interets ");
			interets = sc.nextDouble();
			System.out.println("Saisir les annees ");
			annees = sc.nextInt();
			interetSimple = somme*(1+annees*(interets/100));
			interetCompose = somme*((1+(interets/100))*annees);
			
			System.out.println("interet simple "+
					interetSimple +" interet compose "+ interetCompose);
					 
			sc.close();
		
				
	}

}
