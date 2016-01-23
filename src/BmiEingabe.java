import java.util.Scanner;

public class BmiEingabe {
	
	public static double eingabeGewicht() throws GewichtUnplausibel {
		
		Scanner scanner = new Scanner(System.in); 
		
		try {	 	
			double gewicht;
			GewichtUnplausibel ex = new GewichtUnplausibel();
		
			System.out.println("Bitte Ihr Gewicht in kg eingeben: ");
			gewicht = scanner.nextDouble();
			scanner.close();
			
			if (gewicht > 250 || gewicht < 30)
				throw ex;
			else 
				return gewicht;				
		}
		
		finally {
			// nichts zu tun
		}
		
	}
	
	public static double eingabeGroesse() throws GroesseUnplausibel {
		
		Scanner scanner1 = new Scanner(System.in); 
		
		try {	 	
			double groesse;
			GroesseUnplausibel ex = new GroesseUnplausibel();
		
			System.out.println("Bitte Ihre Größe in cm eingeben: ");
			groesse = scanner1.nextDouble();
			
			if (groesse > 230 || groesse < 120)
				throw ex;
			else {
				scanner1.close();
				return groesse;
			}
		}
		
		finally {
			scanner1.close();
		}
	}
}
