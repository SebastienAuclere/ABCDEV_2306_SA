package exercice_tableau_2;

public class App {
	/*
	 Variables 
	tab2[6] est un tableau de caractere
Debut du programme
	tab2[0] <-- "a"
	tab2[1] <-- "e"
	tab2[2] <-- "i"
	tab2[3] <-- "o"
	tab2[4] <-- "u"
	tab2[5] <-- "y"
Fin du programme
	 */

	public static void main(String[] args) {
		char[] tab2 = new char[6];
		
		tab2[0] = 'a';
		tab2[1] = 'e';
		tab2[2] = 'i';
		tab2[3] = 'o';
		tab2[4] = 'u';
		tab2[5] = 'y';
		
		for(int i = 0; i < tab2.length; i++)
		{
			System.out.print(tab2[i]+" ");
		}
		
	}

}
