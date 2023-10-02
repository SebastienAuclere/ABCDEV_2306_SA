package exercice_heritage_panierdefruits;

public class Fruit {
	//Les attributs
	protected String label;
	protected float price;
	//Constructeur sans parametres
	public Fruit()
	{
		label = "aucun";
		price = 0;		
	}
	//Constructeur avec parametres
	public Fruit(String _label,float _price) 
	{
		this.label = _label;
		this.price = _price;
	}
	//getters and setters
	public String getLabel()
	{
		return this.label;
	}
	public float getPrice()
	{
		return this.price;
	}
	public void setLabel(String _label)
	{
		this.label = _label;
	}
	public void setPrice(float _price)
	{
		this.price = _price;
	}
	//Methodes
}
