
public class TeilerFindenDemo {

	public static void main(String[] args) {
		
		int Start = 100;
		int i = 2;
		int Ergebnis = 2;
		
		String ausgabe = "Teiler von " + Start + " sind: ";
		
		while (i <= (Start/2)) {
			if (Start%i == 0) {
			Ergebnis = i;
			ausgabe += i + ", ";
			 }
			i++;		
		}
		
		System.out.println(ausgabe);
		
	}


}
