package exercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration
		double nombreA;
		double nombreB;
		double nombreC;
		Scanner sc = new Scanner(System.in);
		
		//Debut Programme
		System.out.println("Saisir NombreA : ");
		nombreA = sc.nextDouble();
		System.out.println("Saisir Nombre B : ");
		nombreB = sc.nextDouble();
		System.out.println("Saisir Nombre C : ");
		nombreC = sc.nextDouble();
		sc.close();
		if (nombreA <= nombreB && nombreA <= nombreC) {
			if (nombreB <= nombreC) {
				System.out.println(nombreA + " " + nombreB + " " + nombreC);
			}
			else {
				System.out.println(nombreA + " " + nombreB + " " + nombreC);
			}
		}
		else if (nombreB <= nombreA && nombreB <= nombreC) {
			if (nombreA <= nombreC) {
				System.out.println(nombreB + " " + nombreA + " " + nombreC);
			}
			else {
				System.out.println(nombreB + " " + nombreC + " " + nombreA);
			}
		}
		else {
			if (nombreA <= nombreB) {
				System.out.println(nombreC + " " + nombreA + " " + nombreB);
			}
			else {
				System.out.println(nombreC + " " + nombreB + " " + nombreA);
			}
		}
		
	}

}
