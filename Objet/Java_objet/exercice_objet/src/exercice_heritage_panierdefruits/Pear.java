package exercice_heritage_panierdefruits;

public class Pear extends Fruit{
	//Les attributs
	private String color;
	//Constructeur sans parametres
	public Pear()
	{
		super();
		color = "aucun";
	}
	//Constructeur avec parametres
	public Pear(String _label,float _price,String _color) 
	{
		super();
		this.color = _color;
	}
	//getters and setters
	public String getColor()
	{
		return this.color;
	}	
	public void setColor(String _color)
	{
		this.color = _color;
	}	
	//Methodes
}
