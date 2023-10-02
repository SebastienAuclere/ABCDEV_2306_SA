package exercice_heritage_panierdefruits;

public class TestFruit {

	public static void main(String[] args) 
	{
		Fruit portionfraise = new Fruit("portionfraise",8);
		Apple pomme = new Apple("pomme",4,true);
		Apple pomme2 = new Apple("pomme2",2,false);
		Pear poire = new Pear("poire",3,"green");
		Pear poire2 = new Pear("poire2",4,"yellow");
		
		Customer client1 = new Customer(40);
		Customer client2 = new Customer(35);		
	}
}
