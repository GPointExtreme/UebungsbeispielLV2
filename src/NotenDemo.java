
public class NotenDemo {

	public static void main(String[] args) {
		
		
		//Hier kommten die Punkte rein 0 bis 100
		int punkte = 73;
		
		//Ausgabe von der Note bzw. wenn eine ungültige Zahl eingegeben wurde
		System.out.println("Note = " + getNotentext(punkte));
		
	}
	
	public static String getNotentext(int punkte) {
		
			if (punkte <= 100 && punkte >= 90) {
				return "Sehr gut";
			}
			else if (punkte <= 89 && punkte >= 78) {
				return "Gut";
			}
			else if (punkte <= 77 && punkte >= 65) {
				return "Befriedingend";
			}
			else if (punkte <= 64 && punkte >= 51) {
				return "Genügend";
			}
			else if (punkte <= 0 && punkte >= 50) {
				return "Ungenügend";
			}
			else {
				return "Unglütige Zahl";
			}
			
		}
	
	}
