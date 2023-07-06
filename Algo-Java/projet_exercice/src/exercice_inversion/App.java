package exercice_inversion;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Entrez la valeur de \"a\" : ");
			a = scanner.nextInt();
			System.out.println("Entrez la valeur de \"b\" : ");
			b = scanner.nextInt();
			System.out.println("Entrez la valeur de \"a\" et \"b\" avant inversion sont : " + a + " et " + b);
			
			
			c = b;
			b = a;
			a = c;
			
			System.out.println("Les valeurs de \"a\" et \"b\" apres inversion sont : " + a + " et " + b);
			
			scanner.close();			
			
	}

}
