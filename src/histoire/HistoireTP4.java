package histoire;

public class HistoireTP4 {

	public static void main(String[] args) {
		/*Partie 1 TP4*/
//		Humain prof = new Humain ("Prof", "kombucha", 54);
//		
//		System.out.println(prof.direBonjour());
//        System.out.println(prof.acheter("une boisson", 12));
//        prof.perdreArgent(12);
//        System.out.println(prof.boire());
//        System.out.println(prof.acheter("un jeu", 2));
//        prof.perdreArgent(2);
//        System.out.println(prof.acheter("un kimono", 50));
        
        /*Partie 2 TP4 - 2*/
        Commercant marco = new Commercant ("Marco", "th�", 20);
        
        /*Partie 2 TP4 - 2.1*/
        System.out.println(marco.direBonjour());
        marco.seFaireExtorquer();
//        System.out.println(marco.getArgent()); //Test pour voir que l'argent est bien retir�.
        marco.recevoir(15);
        System.out.println(marco.boire());
//        System.out.println(marco.getArgent()); //Test pour voir que l'argent est bien donn�.
        
        /*Partie 2 TP4 - 2.2*/
        Yakuza yaku = new Yakuza ("Yaku Le Noir", "whisky", 30, "Warsong");
        System.out.println(yaku.direBonjour());
        yaku.extorquer(marco);
        
        /*Partie 2 TP4 - 2.3*/
        Ronin roro = new Ronin ("Roro", "shochu", 60);
        System.out.println(roro.direBonjour());
        roro.donner(marco);
	}
}
