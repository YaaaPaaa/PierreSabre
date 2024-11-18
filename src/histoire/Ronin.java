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
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		System.out.println(parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fais à ce pauvre marchand!"));
		int force = honneur*2;
		if (force>=adversaire.reputation) {
			int argentGagner = adversaire.getArgent();
			gagnerArgent(argentGagner);
			honneur+=1;
			System.out.println(parler("Je t'ai eu petit Yakuza"));
			adversaire.perdre();
		} else {
			honneur-=1;
			int argentPerdu = getArgent();
			perdreArgent(argentPerdu);
			System.out.println(parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse en ont pris un coup."));
			adversaire.gagner(argentPerdu);
		}
	}
}
