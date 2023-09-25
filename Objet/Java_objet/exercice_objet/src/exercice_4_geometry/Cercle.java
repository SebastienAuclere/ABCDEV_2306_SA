package exercice_4_geometry;

public class Cercle {

	//les attributs
	
	private Point centre;
	
	private double rayon;
	private double perimetre;
	private double surface;	
	
	//constructeur avec parametres
	
	public Cercle(double _rayon,Point _centre) {
		
		this.rayon = _rayon;
		this.centre = _centre;
	}
	
	//methodes	
	
	public double calculerPerimetre() {
		
		perimetre = 2*Math.PI*this.rayon;
		return perimetre;
	}
	
	public double calculerSurface() {
		
		surface = 4*Math.PI*Math.pow(this.rayon,2);
		return surface;
	}
	
	public void testAppartenance(Point test) {
		
			
		
		if(Math.sqrt((Math.pow((test.getAbscisse() - centre.getAbscisse()),2)) + (Math.pow((test.getOrdonnee() - centre.getOrdonnee()),2))) <= rayon) {
			
			System.out.println("Le point fait parti du cercle");
		}
		else {
			
			System.out.println("Le point ne fait pas parti du cercle");
		}		
	}
	
	public void afficher() {
		
		System.out.println("Le cercle a une surface de: " + this.calculerSurface() + " cm2 et un perimetre de" + this.calculerPerimetre() + " en cm.");
		this.testAppartenance(null);
	}
}
