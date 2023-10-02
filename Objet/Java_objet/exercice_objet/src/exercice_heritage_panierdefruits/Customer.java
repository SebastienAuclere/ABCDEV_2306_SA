package exercice_heritage_panierdefruits;

public class Customer {
	//Les attributs
	private int clientId;
	//Constructeur sans parametres
	public Customer()
	{		
		clientId = 0;
	}
	//Constructeur avec parametres
	public Customer(int _clientId) 
	{		
		this.clientId = _clientId;
	}
	//getters and setters
	public int getClientId()
	{
		return this.clientId;
	}	
	public void setClientId(int _clientId)
	{
		this.clientId = _clientId;
	}	
	//Methodes
}


