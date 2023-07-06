package exercice_interet;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		interetSimple = somme*(1+annees*(interets/100d));
		interetCompose = somme*Math.pow(1+(interets/100d),annees);
		
		System.out.println("interet simple "+
				interetSimple +" interet compose "+ interetCompose);
				 
		sc.close();
	}
}
