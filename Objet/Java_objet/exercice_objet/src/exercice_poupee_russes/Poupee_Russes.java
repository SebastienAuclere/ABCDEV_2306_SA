package exercice_poupee_russes;

public class Poupee_Russes {
	//Attributs
	private String nom;
	private int taillePoupee;
	private boolean estOuverte;	
	private boolean contientPoupee;
	private boolean estContenueDans;
	
	//Constructeur sans parametres
	public Poupee_Russes()
	{
		nom = "aucun";
		taillePoupee = 0;
		estOuverte = false;
		contientPoupee = false;
		estContenueDans = false;
		
	}
	//Construction avec parametres
	public Poupee_Russes(String _nom,int _taillePoupee,boolean _estOuverte,boolean _contientPoupee,boolean _estContenueDans)
	{
		this.nom = _nom;
		this.taillePoupee = _taillePoupee;
		this.estOuverte = _estOuverte;		
		this.contientPoupee = _contientPoupee;
		this.estContenueDans = _estContenueDans;
		
	}
	//getters and setters
	public String getNom()
	{
		return this.nom;
	}
	public int getTaillePoupee()
	{
		return this.taillePoupee;
	}
	public boolean getEstOuverte()
	{
		return this.estOuverte;
	}
	public boolean getContientPoupeee()
	{
		return this.contientPoupee;
	}
	public boolean getEstContenueDans()
	{
		return this.estContenueDans;
	}
	public void setNom(String _nom)
	{
		this.nom = _nom;
	}
	public void setTaillePoupee(int _taillePoupee)
	{
		this.taillePoupee = _taillePoupee;
	}			
	public void setEstOuverte(boolean _estOuverte)
	{
		this.estOuverte = _estOuverte;
	}	
	public void setContientPoupee(boolean _contientPoupee)
	{
		this.contientPoupee = _contientPoupee;
	}
	public void setEstContenueDans(boolean _estContenueDans)
	{
		this.estContenueDans = _estContenueDans;
	}
	//Methodes
	public boolean ouvrir()
	{
		if(!this.estOuverte && !this.estContenueDans)
		{
			this.estOuverte = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean fermer()
	{
		if(this.estOuverte && this.estContenueDans)
		{
			this.estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean placerDans(Poupee_Russes p)
	{
		if(this.estOuverte && !this.estContenueDans)
		{
			if(p.estOuverte && !p.contientPoupee)
			{
				if(p.taillePoupee > this.taillePoupee)
				{
					this.estContenueDans = true;
					p.contientPoupee = true;
					return true;
				}	
		        else
		        {
		        	return false;
		        }
			}	
			else
			{
				return false;
			}
		}	
		else
		{
			return false;
		}
	}
	public boolean sortirDe(Poupee_Russes p)
	{
		if(this.estContenueDans && this.estOuverte)
		{
			this.estContenueDans = false;
			p.contientPoupee = false;
			return true;
		}
		else
		{
			return false;
		}
	}
}
