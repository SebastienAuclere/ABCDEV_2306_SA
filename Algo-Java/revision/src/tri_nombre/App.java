package tri_nombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	/* 
		//Déclaration des variables:
		 *
		 *a est un entier
		 *b est un entier
		 *
		 *Debut programme
		 *
		 *Ecrire "saisir a "
		 *lire a
		 *Ecrire "saisir b"
		 *lire b
		 *si ( a > b )
		 *alors ecrire "b ; a"
		 *sinon
		 *ecrire "a ; b"
		 *
		 *fin de programme
	*/
		//Declaration des variables
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir a: ");
		a = sc.nextInt();
		System.out.println("Saisir b: ");
		b = sc.nextInt();
		
		if(a == b)
		{
			System.out.println("b = a");	
		}		
		else if(a>b) 
		{
			System.out.println("b;a");	
		}
		else
		{
			System.out.println("a;b");
		}
		sc.close();
	}

}
