package histoire;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	void extorquer(Commercant victime) {
		int argentVol = victime.getArgent();
		System.out.println(parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"));
		System.out.println(parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !"));
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		reputation+=1;
		System.out.println(parler("J'ai piqué les " + argentVol + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " dans ma poche. "));
	}

}
