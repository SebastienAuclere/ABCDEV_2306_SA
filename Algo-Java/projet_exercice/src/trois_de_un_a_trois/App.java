package trois_de_un_a_trois;

import java.util.Scanner;

public class App {
	
	

	public static void main(String[] args) {
		/*Declaration des variables
		 *  
		 */
		int nombre = 0;
		
		Scanner sc = new Scanner(System.in);		
		
		do
		{
			System.out.println("Saisir un nombre: ");
			nombre = sc.nextInt();
		}
		while( nombre>3 || nombre<1 );
		
		System.out.println("La reponse convient");
		
		sc.close();
	}

}
