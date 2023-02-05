package Week5;

public class SpacedLogger implements Logger {
	@Override
	public void Error(String str) {
		System.out.println("Error: " + SpaceString(str));
	}

	@Override
	public void Log(String str) {
		System.out.println(SpaceString(str));
	}

	private String SpaceString(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : str.toCharArray()) {
			stringBuilder.append(c);
			stringBuilder.append(' ');
		}
		return stringBuilder.toString();
	}
}
