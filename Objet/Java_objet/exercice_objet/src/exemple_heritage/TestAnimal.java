package exemple_heritage;

public class TestAnimal {

	public static void main(String[] args) {
		
		Insecte abeille = new Insecte("abeille1","bourdonne","nectar","vole","trois paires de jambes");
		Canide chien = new Canide("chien","aboie"," patee","cours","inconnu",5);
		Canide chien2 = new Canide("Le labrador","aboie","de la patee","une fois sur deux","inconnu",8);
		Canide chien3 = new Canide("Pinsher","aboie","de la patee","en aboyant","inconnu",2);
		Herbivore cheval = new Herbivore("cheval","hennit","herbe et foin","non defini",true);
		Herbivore girafe = new Herbivore("girafe","meugle","vegetaux","doucement",true);
		
		System.out.println("L'animal " + abeille.getEspece()  + " " + abeille.getSeDeplaceComment()  + " pour buttiner du " + abeille.getNourriture()  + " elle " + abeille.getCommuniquePar()  + " pour signaler sa présence. Elle a " + abeille.getTroisPairesDeJambes() + " car c'est un insecte.");
		System.out.println("L'animal " + chien.getEspece()  + " " + chien.getSeDeplaceComment()  + " pour manger de la " + chien.getNourriture()  + " il " + chien.getCommuniquePar()  + " pour communiquer et defendre son territoire.");
		System.out.println("L'animal " + girafe.getEspece()  + " se deplace " + girafe.getSeDeplaceComment()  + " pour manger des " + girafe.getNourriture()  + ", elle " + girafe.getCommuniquePar()  + " pour communiquer. ");
		
		chien2.mange();
		chien3.seDeplace();
		cheval.communique();
		
		System.out.println(chien2.toString());
		chien2.setAge(2);
		System.out.println(chien2.toString());
		chien2.setAge(-3);
		System.out.println(chien2.toString());		
	}
}
