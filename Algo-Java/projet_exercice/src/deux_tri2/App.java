package deux_tri2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//declaration des variables
		 double a;
		 double b;
		 double c;
		 
		 Scanner sc = new Scanner(System.in);
			//Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Saisir le nombre a : ");
		 a = sc.nextDouble();
		 System.out.println("Saisir le nombre b : ");
		 b = sc.nextDouble();
		 System.out.println("Saisir le nombre c : ");
		 c = sc.nextDouble();
		 
		 		 
		 if (b > a && c > a) {
			 if (c > b) {
				 	System.out.println("a < b < c");						
			}
			 else {
				    System.out.println("a < c < b");
			 }
		 }
		 else if (a > b && c > b) {
			 if (a > c) {
				 	System.out.println("b < c < a");						
			}
			 else {
				    System.out.println("b < a < c");
			 } 
		 }
		 else if (a > c && b > c) {
			 if (b > a) {
				 	System.out.println("c < a < b");						
			}
			 else  {
				    System.out.println("c < b < a");
			 } 
		 }
		 
		 
		 sc.close();
	}

}
