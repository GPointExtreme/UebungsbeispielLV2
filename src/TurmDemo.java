
public class TurmDemo {

	public static void main(String[] args) {
		
		int startZahl = 2; //Startzahl
		
		int counter = 2; //Multiplikation Start
		while (counter <= 9) {
			System.out.println(startZahl + " * " + counter + " = " + (startZahl*counter));
			startZahl = startZahl * counter;
			counter++;
		}
		
		counter = 2; //Division Start
		while (counter <=9) {
			System.out.println(startZahl + " / " + counter + " = " + (startZahl/counter));
			startZahl = startZahl / counter;
			counter++;	
		}
		

	}

}
