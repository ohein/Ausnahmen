public class GewichtUnplausibel extends Exception {
	private static final long serialVersionUID = 1L;

	public GewichtUnplausibel() {	// Konstruktor
		super("Eingegebenes Gewicht ist unplausibel!");
	}
}