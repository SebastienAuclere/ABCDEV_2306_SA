package surface_secteur_circulaire;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		// declaration des variables
		double rayon;
		double angle;		
		double aire;
		
		final double pi = Math.PI;				
		
		Scanner sc= new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		
		//debut du programme
		System.out.println("Saisir le rayon ");
		rayon = sc.nextDouble();
		System.out.println("Saisir l'angle ");
		angle = sc.nextDouble();
		
		aire = (pi*Math.pow(rayon,2)*angle)/360;
		aire = Math.round(aire*1000.0)/1000.0;
		
		System.out.println("l'Aire du secteur angulaire est : "+aire);		
		sc.close();
		 
	}

}
