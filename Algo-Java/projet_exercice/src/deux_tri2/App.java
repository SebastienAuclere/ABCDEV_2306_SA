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
		 
		 		 
		 if (a>b && a>c) {
			 if (b > c) {
				 	System.out.println("a>c>b");						
			}
			 else {
				    System.out.println("a>b>c");
			 }
		 }
		 else if (b>a && b>c) {
			 if (c>a) {
				 	System.out.println("b>a>c");						
			}
			 else {
				    System.out.println("b>c>a");
			 } 
		 }
		 else if (c>a && c>b) {
			 if (a>b) {
				 	System.out.println("c>b>a");						
			}
			 else  {
				    System.out.println("c>a>b");
			 } 
		 }
		 
		 
		 sc.close();
	}

}
