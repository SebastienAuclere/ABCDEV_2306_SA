package exercice_depart;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Declaration des variables
		int nombre;
		int x;
		
		//debut programme
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir nombre: ");
		nombre = sc.nextInt();	
		x = nombre + 10;
		
		while(nombre != x)
		{
			 nombre=nombre+1;
			 System.out.println(nombre);
		}
			
		
		sc.close();
		
	}

}
