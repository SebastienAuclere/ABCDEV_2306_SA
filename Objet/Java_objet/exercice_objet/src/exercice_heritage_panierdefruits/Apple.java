package exercice_heritage_panierdefruits;

public class Apple extends Fruit{
	//Les attributs
	private boolean redLabel;
	//Constructeur sans parametres
	public Apple()
	{
		super();
		redLabel = true;
				
	}
	//Constructeur avec parametres
	public Apple(String _label,float _price,boolean _redLabel) 
	{
		super(_label,_price);
		this.redLabel = true;
	}
	//getters and setters
	public boolean getRedLabel()
	{
		return this.redLabel;
	}
	public void SetRedLabel(boolean _redLabel)
	{
		this.redLabel = _redLabel;
	}	
	//Methodes
	public boolean isRedLabel()
	{
	if(this.redLabel == true)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
}
