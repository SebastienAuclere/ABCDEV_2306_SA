package deux_tri;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//declaration des variables
		int a ;
		int b ;
	
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		//debut du programme
		System.out.println("Saisir a : ");
		a = sc.nextInt();
		System.out.println("Saisir b : ");
		b = sc.nextInt();
		if(a == b) {
			System.out.println("Egalite :" + a + " = " + b );
		}
		else if(a < b) {
			System.out.println("Ordre croissant :" + a + " < " + b );
		}
		else {
			System.out.println("Ordre croissant :" + b + " < " + a );
		}
		sc.close();
	}


}
