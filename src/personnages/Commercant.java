package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public int seFaireExtorquer() {
		System.out.println(parler("J’ai tout perdu! Le monde est trop injuste..."));
		return perdreArgent(getArgent());
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println(parler(argent + " sous ! Je te remercie généreux donateur!"));
	}
}
