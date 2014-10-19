package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {
		if (isEmptyString(text)) {
			return 0;
		}
		else if(text.contains(",")) {
			String[] numbers = text.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		} else {
			return 1;
		}
	}

	private static Boolean isEmptyString(String text) {
		return text.equals("");
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}
}