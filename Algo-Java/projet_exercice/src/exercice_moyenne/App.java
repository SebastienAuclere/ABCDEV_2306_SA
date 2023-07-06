package exercice_moyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
			// declaration des variables
			int nombre1;
			int nombre2;
			double moyenne;
			Scanner sc;
			sc = new Scanner(System.in);
			//Scanner sc = new Scanner(System.in);
			
			//debut du programme
			System.out.println("Saisir le premier nombre : ");
			nombre1 = sc.nextInt();
			System.out.println("Saisir le deuxieme nombre : ");
			nombre2 = sc.nextInt();
			moyenne = (nombre1 + nombre2)/2d;
			System.out.println("La moyenne des deux nombres est : "+moyenne);
			
			sc.close();
	}

}
