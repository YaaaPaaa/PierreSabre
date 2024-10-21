package histoire;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain ("Prof", "kombucha", 54);
		
		System.out.println(prof.direBonjour());
        System.out.println(prof.acheter("une boisson", 12));
        prof.perdreArgent(12);
        System.out.println(prof.boire());
        System.out.println(prof.acheter("un jeu", 2));
        prof.perdreArgent(2);
        System.out.println(prof.acheter("un kimono", 50));
	}
}
