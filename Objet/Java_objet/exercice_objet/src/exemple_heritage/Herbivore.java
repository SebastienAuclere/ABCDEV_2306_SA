package exemple_heritage;

public class Herbivore extends Animal {
	//Les attributs		
	private boolean enzymesGlucose;
	//Constructeur sans parametres
	public Herbivore()
	{
		super();
		enzymesGlucose = false;			
	}
	//Constructeur avec parametres
	public Herbivore(String _espece,String _communiquePar,String _nourriture,String _seDeplaceComment,boolean _enzymesGlucose)
	{
		super(_espece,_communiquePar,_nourriture,_seDeplaceComment);
		this.enzymesGlucose = _enzymesGlucose;
	}
	//Getters & Setters
	public boolean getEnzymesGlucose()
	{
		return this.enzymesGlucose;
	}		
	public void setEnzymesGlucose(boolean _enzymesGlucose)
	{
		this.enzymesGlucose = _enzymesGlucose;
	}
	public boolean enzymesGlucose()
	{
		System.out.println("Les herbivores sont des animaux qui n'ont pas d'enzymes pour digerer le glucose, c'est pour cela qu'ils mangent des vegetaux.");
		return true;
	}
}
