package personnages;

public class Yakuza extends Humain{
	private String clan;
	public int reputation=4;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argentVol = victime.getArgent();
		System.out.println(parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"));
		System.out.println(parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !"));
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		reputation+=1;
		System.out.println(parler("J'ai piqué les " + argentVol + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " dans ma poche. "));
	}

	public int perdre() {
		int argentPerdu=getArgent();
		perdreArgent(argentPerdu);
		reputation -=1;
		System.out.println(parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + "."));
		return argentPerdu;
	}
	
	public void gagner (int gain) {
		gagnerArgent(gain);
		reputation +=1;
		System.out.println(parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + " ?\n"
				+ "Je l'ai dépouillé de ses " + gain + " sous."));
	}
}
