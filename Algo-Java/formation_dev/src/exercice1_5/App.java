package exercice1_5;

import java.util.Scanner;

/*
 VARIABLE
    a est un entier
    b est un entier
    c est un entier
Debut du programme
    Ecrire " Saisir le nombre a"
    Lire <-- a
    Ecrire "Saisir le nombre b"
    Lire <-- b
    Ecrire "Nombre a ",a," Nombre b",b
    c <-- b
    b <-- a
    a <-- c
    Ecrire "Nombre a ",a," Nombre b",b
Fin du programme

 */

public class App {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Entrez la valeur de \"a\" : ");
			a = scanner.nextInt();
			System.out.println("Entrez la valeur de \"b\" : ");
			b = scanner.nextInt();
			System.out.println("Les valeurs de \"a\" et \"b\" avant inversion sont : " + a + " et " + b);
		
			c = b;
			b = a;
			a = c;
			
			System.out.println("Les valeurs de \"a\" et \"b\" apres inversion sont : " + a + " et " + b);
			
		scanner.close();

	}

}
