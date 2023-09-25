package exercice_4_geometry;

public class TestCercle {

	public static void main(String[] args) {
		
		Point centre = new Point(3.0,3.0);
		
		Cercle cercle1 = new Cercle(4.0,centre);
		
		Point test1 = new Point(4.0,4.0);
		
		cercle1.afficher();
		
		cercle1.testAppartenance(test1);

	}

}
