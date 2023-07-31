package exercice2_6;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nombre est un entier
	i est un entier
	est_premier est un booleen
Debut du programme
	est_premier <-- vrai
	ecrire "Saisir un nombre"
	lire nombre
	Debut boucle pour
		Pour i allant de 2 à nombre - 1
		debut Si
			Si nombre%i = 0 
			Alors 
			est_premier <-- faux
		Fin Si
	Fin pour

	debut si
		si est_premier = vrai
		alors ecrire "nombre ",nombre" est un nombre premier"
		sinon ecrire "nombre ",nombre" n'est pas un nombre premier"
	fin si
fin du programme
	 */

	public static void main(String[] args) {
		//Déclaration des variables
        int nombre;
        int i;
        boolean est_premier;
        
        est_premier = true;
        
        //Début du programme
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre: ");
        nombre=sc.nextInt();
        
        nombre = Math.abs(nombre); // valeur absolue d'un nombre
        
        if(nombre == 0 || nombre == 1) est_premier = false;
        
        for(i=2;i<nombre;i++)
        {
        	if(nombre%i == 0)
        	{
        		est_premier = false;
        	}
        }
        
        if(est_premier)
        {
        	System.out.println(nombre+" est premier");
        }
        else 
        {
        	System.out.println(nombre+" n'est pas premier");
        }
        sc.close();	
	}

}
