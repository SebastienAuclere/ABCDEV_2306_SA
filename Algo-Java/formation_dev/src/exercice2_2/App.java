package exercice2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
/*
 Variables
a est un entier
b est un entier

Début du programme

Ecrire "Saisir nombre a"
Lire <-- nombre a
Ecrire "Saisir nombre b"
Lire <-- nombre b

Début Si
Si a == b 
Ecrire" Nombre :" a " = " b
Sinon Si a < b
Ecrire " Nombre :" a , b
Sinon 
Ecrire " Nombre :" b , a
Fin Si
Fin du programme
 */
	
// Déclaration des variables
int a;
int b;

Scanner sc = new Scanner(System.in);

// Saisie des nombres
System.out.println("Saisir nombre a");
a = sc.nextInt();

System.out.println("Saisir nombre b");
b = sc.nextInt();

// Calcul du tri
if(a == b)
{
	System.out.println("Nombre :" + a +" = " + b);	
}

else if(a < b)
{
	System.out.println("Nombre " + a +" < " + b);
}
else
{
	System.out.println("Nombre " + b +" < " + a);
}
	
sc.close();

	
	}

}
