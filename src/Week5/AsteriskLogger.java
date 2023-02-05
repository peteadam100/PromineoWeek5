package Week5;

public class AsteriskLogger implements Logger {
	@Override
	public void Error(String str) {
		String errorLine = "***Error: " + str + "***";
		System.out.println("*".repeat(errorLine.length()));
		System.out.println(errorLine);
		System.out.println("*".repeat(errorLine.length()));
	}

	@Override
	public void Log(String str) {
		System.out.println("***" + str + "***");
	}
}
