package nombre_entre_10_et_20;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Declaration des variables
		int nombre = 0;
        
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Saisir un nombre: ");
			nombre = sc.nextInt();
			if(nombre<10)
			{
				System.out.println("Plus grand!");	
			}
			else if(nombre>20)
			{
				System.out.println("Plus petit!");
			}
		}
		while(nombre<10 || nombre>20);
		
		System.out.println("La reponse convient");			
		sc.close();
	}

}
