package exercice_heritage_panierdefruits;

public class Basket {
	//Les attributs
	private int ref;
	private Fruit fruit;
	private float totalPrice;
	
	//Constructeur avec parametres
	public Basket(int _ref,Fruit _Fruit,float _totalPrice) 
	{		
		this.ref = _ref;
		this.fruit = _Fruit;
		this.totalPrice = _totalPrice;
	}
	//getters and setters
	public int getRef()
	{
		return this.ref;
	}
	public float getTotalPrice()
	{
		return this.totalPrice;
	}
	public void setRef(int _ref)
	{
		this.ref = _ref;
	}
	public float setTotalPrice(float _totalPrice)
	{
		return this.totalPrice = _totalPrice;
	}
	//Methodes
	{
	public string ajouterFruit()
	
	String[] tab1 = new String[5];
	
	tab1[0] = "portionfraise";
	tab1[1] = "pomme";
	tab1[2] = "pomme2";
	tab1[3] = "poire";
	tab1[4] = "poire2";
	
	for(int i = 0; i < tab1.length; i++)
	{
		System.out.println("tab " + i + " = " + tab1[i]);
	}
	}
	
}
