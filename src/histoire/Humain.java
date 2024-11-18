package histoire;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String direBonjour() {
		return parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public String boire() {
		return parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public String acheter(String bien, int prix) {
		if (argent >= prix) {
            return parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous.");
        } else {
            return parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " � " + prix + " sous.");
        }
	}
	
	public int gagnerArgent(int gain) {
		argent = argent + gain;
		return argent;
	}
	
	public int perdreArgent(int perte) {
		argent = argent-perte;
		return argent;
	}
	
	public String parler(String texte) {
		return "(" + nom + ") - " + texte;
	}
}
