package deux_comparaison;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//declaration des variables
		int a ;
		int b = 18 ;
		
		/* Si a est supérieur à b
		 * ALORS
		 * 	ECRIRE " Vous êtes majeur "
		 * SINON SI
		 *  A<=0
		 *  ECRIRE " Vous êtes pas né "
		 * SINON
		 *  ECRIRE " Vous êtes mineur "
		 *FIN SI  
		 */
		
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		//debut du programme
		System.out.println("Saisir a : ");
		a = sc.nextInt();
		if(a >= b) {
			System.out.println( "Vous etes majeur");
		}
		else if(a <= 0) {
			System.out.println( "Vous n'etes pas ne");
		}	
		else {
			System.out.println( "Vous etes mineur");
		}
		sc.close();		
		
	}

}
