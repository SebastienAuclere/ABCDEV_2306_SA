package exercice_fonctions_et_procedures_ex_2_moi;

import java.util.Scanner;

public class App {
		/*PROCEDURE 
		perimetreEtAire(reel a,reel b,reel c)
		reel p 
		reel ai
		p<--a+b+c
		ai<--((p/2-a)*(p/2-b)*(p/2-c))*0.5

		ECRIRE "le périmètre fait: ",p,"cm
		ECRIRE "l'aire fait: ",ai,"cm2

		FIN PROCEDURE
		VARIABLES
		a est un reel
		b est un reel
		c est un reel

		DEBUT DU PROGRAMME
		ECRIRE"Saisir a, b, c"
		LIRE"a ,b ,c "

		perimetreEtAire(a,b,c)

		FIN DE PROGRAMME
		*/
		public static void perimetreEtAire(double a,double b,double c)
		{
			double p;
			double ai;
			p = a+b+c;
			ai = Math.pow((p/2-a)*(p/2-b)*(p/2-c),1/2);
			System.out.println("le perimetre fait: " + p + "cm et l aire fait: " + ai + "cm2");
		}

		public static void main(String[] args) {
			//declaration des variables
			double a;
			double b;
			double c;
			//ouverture du scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Saisir a ");
			a = sc.nextDouble();
			System.out.println("Saisir b ");
			b = sc.nextDouble();
			System.out.println("Saisir c ");
			c = sc.nextDouble();
			
			perimetreEtAire(a,b,c);
			
			
			sc.close();
	}

}
