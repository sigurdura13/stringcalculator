package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {
		if (isEmptyString(text)) {
			return 0;
		}
		return 1;
	}

	private static Boolean isEmptyString(String text) {
		return text.equals("");
	}
}