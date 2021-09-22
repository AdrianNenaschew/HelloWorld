
public class Gluecksspiel {

	static byte alter = 18;
	static byte geschlecht = 0;
	static String name = "Adrian";
	static double randomValue = Math.round(Math.random()*100);
	static double spieler1 = 0;
	static double spieler2 = 0;
	static double differenz1 = 0;
	static double differenz2 = 0;
	
	public static void main(String[] args) {
		differenz1=Math.abs(randomValue - spieler1);
		differenz2=Math.abs(randomValue - spieler2);
		
		if(differenz1==differenz2) {
			System.out.println("Unentschieden!");
		}
		if(differenz1<differenz2) {
			System.out.println("Spieler 1 gewinnt!");
		}
		if(differenz1>differenz2) {
			System.out.println("Spieler 2 gewinnt!");
		}
		if (alter < 18 || geschlecht == 2) {
			System.out.println("Hallo " + name);
		} else {
			if (geschlecht == 0) {
				System.out.println("Guten Tag Herr " + name + "!");
			} else {
				System.out.println("Guten Tag Frau " + name + "!");
			}
		}

	/*	if (randomValue <= 42) {
			System.out.println("Gewonnen!");
		}
		else {
			System.out.println("Verloren!");
		}*/
	}
}
