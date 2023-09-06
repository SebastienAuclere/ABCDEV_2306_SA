package exercice_objet_porte_de_garage;

public class PorteDeGarage 
{	
	// Attributes
	private boolean estOuverte;
	private boolean estVerrouiller;
	private boolean estDeverrouiller;
	private final int degreMax;
	private int degreOuvrable;//= degreMax - degreOuverture;
	private int degreFermable;//= degreOuverture;	
	private int degreOuverture;
	private String nom;
	private boolean estOuvertPartiellement;
	private boolean estFermerPartiellement;
	// Constructor par default
	public PorteDeGarage() 
	{
		estOuverte = true;
		estVerrouiller = false;
		estDeverrouiller = true;
		degreMax = 100;
		degreOuvrable = 75;
		degreFermable = 25;
		degreOuverture = 25;
		nom = " ";
		estOuvertPartiellement = true;	
		estFermerPartiellement = true;
	}
	// Constructor with parameters
	public PorteDeGarage(boolean _estOuverte,boolean _estVerrouiller,boolean _estDeverrouiller,int _degreMax,int _degreOuvrable,int _degreFermable,int _degreOuverture,String _nom,boolean _estOuvertPartiellement,
			boolean _estFermerPartiellement)
	{
		this.estOuverte = _estOuverte;
		this.estVerrouiller = _estVerrouiller;
		this.estDeverrouiller= _estDeverrouiller;
		this.degreMax = _degreMax;
		this.degreOuvrable = _degreOuvrable;		
		this.degreFermable = _degreFermable;
		this.degreOuverture = _degreOuverture; 
		this.nom = _nom;
		this.estOuvertPartiellement = _estOuvertPartiellement;
		this.estFermerPartiellement = _estFermerPartiellement;
	}
	public boolean ouvrir()
		{
			if(this.estOuverte == true)
				{
				//this.estOuverte = true;
				return false;
				}
			else
				{
					if (this.estVerrouiller == true)
						{
						//this.estOuverte = false;
						return false;
						}
					else
						{
						this.estOuverte = true;
						return true;
						}
				}
		}	
	public boolean fermer()
		{
			if(this.estOuverte == true) 
				{
				this.estOuverte = false;
				return true;
				}
			else
			    {
				//this.estOuverte = false;
				return false;					
			    }
		}
	public boolean verrouiller()
		{
			if(this.estOuverte == true)
				{
				//this.estVerrouiller = false;
				return false;
				}
			else
				{
				if(this.estVerrouiller == true)
					{
					//this.estVerrouiller = true;
					return false;
					}
				else 
					{
					this.estVerrouiller = true;
					return true;
					}
				}
		}
	public boolean deverrouiller()
		{
		if(this.estOuverte == true)
			{
			//this.estDeverrouiller = true;
			return false;
			}
		else
			{
			if(this.estDeverrouiller == true)
				{
				//this.estDeverrouiller = true;
				return false;
				}
			else
				{
				this.estDeverrouiller = true;
				return true;
				}
			}
		}
	public boolean ouvrirPartiellement()
	{	
		if(this.estOuverte && this.estDeverrouiller)
			{
			if(this.degreOuverture < this.degreOuvrable)
				{
				this.estOuvertPartiellement = true;
				return true;
				}
			else
				{
				//this.estOuvertPartiellement = false;
				return false;
				}
			}
		else 
			{				
				return false;
			}	
	}
	public boolean fermerPartiellement()
	{
	if(this.estOuverte && this.estDeverrouiller)	
		{
		if(this.degreFermable < this.degreOuverture)
			{
			this.estFermerPartiellement = true;
			return true;
			}
		else
			{
			//this.estFermerPartiellement = false;
			return false;
			}
		}
	else
		{
			return true;
		}
		}
}
