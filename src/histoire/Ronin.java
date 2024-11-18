package histoire;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		System.out.println(parler(beneficiaire.getNom() + " prend ces " + don + " sous."));
		beneficiaire.recevoir(don);
	}
}
