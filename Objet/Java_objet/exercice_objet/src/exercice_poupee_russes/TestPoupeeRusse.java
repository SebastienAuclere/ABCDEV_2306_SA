package exercice_poupee_russes;

public class TestPoupeeRusse {

	public static void main(String[] args)
		{
		Poupee_Russes poupeeRusse1 = new Poupee_Russes("poupeeRusse1",1,true,false,false);
		Poupee_Russes poupeeRusse2 = new Poupee_Russes("poupeeRusse2",2,false,false,false);
		
		boolean test1 = poupeeRusse2.ouvrir();
		boolean test2 = poupeeRusse1.placerDans(poupeeRusse2);
		boolean test3 = poupeeRusse2.fermer();
		boolean test4 = poupeeRusse2.ouvrir();
		boolean test5 = poupeeRusse1.sortirDe(poupeeRusse2);
		boolean test6 = poupeeRusse2.fermer();
		}

}
