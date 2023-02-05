package Week5;

public class App {
	public static void main(String[] args) {
		AsteriskLogger astrisk = new AsteriskLogger();
		
		astrisk.Log("logged");
		astrisk.Error("errored");
		
		SpacedLogger spaced = new SpacedLogger();
		
		spaced.Log("logged");
		spaced.Error("errored");
	}
}
