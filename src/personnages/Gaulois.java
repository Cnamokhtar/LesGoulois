package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		int forceCoup = (force / 3) * effetPotion;
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
					+ romain.getNom());
	}
		
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
		
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
		Gaulois obelix = new Gaulois("Ob�lix", 8);
			
		System.out.prinln(asterix.prendreParole());
			
		asterix.parler("Bonjour, amis Gaulois !");
		obelix.parler("Salut, Ast�rix !");
		asterix.boirePotion(3);
	}
	public int boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl��.");
		return forcePotion;
	}


}
