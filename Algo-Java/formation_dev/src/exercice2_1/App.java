package exercice2_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* 	Variables
				age est un entier
			Debut du Programme
				Ecrire "Quel est votre age?"
				Lire <-- age
			Debut si
				Si age >= 18 alors
				Ecrire "Vous êtes majeur"
				Sinon si age < 0 alors
				Ecrire "Vous n'êtes pas né"
				Sinon 
				Ecrire "Vous êtes mineur"
			Fin si
			Fin du Programme*/

			int age;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quel est votre age?");
			age = sc.nextInt();
			
			if (age>=18) 
			{
				System.out.println("Vous êtes majeur.");
			}else if (age < 0)
			{
				System.out.println("Vous n'êtes pas né.");
			}else
			{
				System.out.println("Vous êtes mineur.");
			}
			sc.close();
	}

}
