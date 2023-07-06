package exercice_aire_et_volume;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
