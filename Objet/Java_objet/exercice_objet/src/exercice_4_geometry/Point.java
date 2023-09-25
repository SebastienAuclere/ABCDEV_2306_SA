package exercice_4_geometry;

public class Point {

	//les attributs
	
		private double abscisse;
		private double ordonnee;
		
	//constructeur avec parametres
		
		public Point(double _abscisse,double _ordonnee) {
			
			this.abscisse = _abscisse;
			this.ordonnee = _ordonnee;
		}
		
		public double getAbscisse()
		{
			return this.abscisse;
		}
		public double getOrdonnee()
		{
			return this.ordonnee;
		}
		
		
}
