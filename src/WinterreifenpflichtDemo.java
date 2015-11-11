
public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
		
		//Hier vergeben wir die Werte und so!
		int temperatur = 0;
		boolean rutschigeFahrbahn = true;
		
		if(istWinterreifenPflicht(temperatur, rutschigeFahrbahn)){
			System.out.println("Bitte Winterreifen verwenden");
		}
		else {
			System.out.println("Keine Winterreifen notwendig");
		}
	}
		public static boolean istWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) 
		{
			return (temperatur < 10 && rutschigeFahrbahn)
								|| temperatur < 4;
		}
		
			
	}
