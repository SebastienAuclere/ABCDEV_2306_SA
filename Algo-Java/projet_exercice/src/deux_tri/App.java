package deux_tri;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration des variables
		double a ;
		double b ;
	
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		//debut du programme
		System.out.println("Saisir a : ");
		a = sc.nextDouble();
		System.out.println("Saisir b : ");
		b = sc.nextDouble();
		if(a > b) {
			System.out.println("Ordre croissant :"+ b +" "+ a );
		}
		else if(b > a) {
			System.out.println("Ordre croissant :"+ a +" "+ b );
		}
		sc.close();
	}


}
