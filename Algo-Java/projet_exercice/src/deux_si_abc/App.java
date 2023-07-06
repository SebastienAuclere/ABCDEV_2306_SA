package deux_si_abc;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declaration des variables
		double a ;
		double b ;
		double c ;
		String croissant;
	
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		
		//debut du programme
		System.out.println("Saisir a : ");
		a = sc.nextDouble();
		System.out.println("Saisir b : ");
		b = sc.nextDouble();
		System.out.println("Saisir c : ");
		c = sc.nextDouble();
		croissant = "en ordre croissant: " ;
		/*System.out.println(croissant); sert a doubler croissant*/
		
		if(a < b && a < c) {
			if(b < c) {
				System.out.println(croissant+"a,b,c");
			}
			else {
				System.out.println(croissant+"a,c,b");
			}
		}
		else if(b < a  && b < c) {
			if(c < a) {
					System.out.println(croissant+"b,c,a");
				}
			else {
					System.out.println(croissant+"b,a,c");
				}
			}
		else{
			if(a < b) {
					System.out.println(croissant+"c,a,b");
				}
			else {
					System.out.println(croissant+"c,b,a");
				}
			}
		sc.close();
		}		
	}