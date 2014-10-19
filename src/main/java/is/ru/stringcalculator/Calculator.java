package is.ru.stringcalculator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Calculator {

	public static int add(String text) {

		if (isEmptyString(text)) {
			return 0;
		}
		else if (text.contains(",") || text.contains("\n") || text.contains("//")) {
			return sum(splitNumbers(text));
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

	private static String[] splitNumbers(String numbers) {
		if (numbers.startsWith("//")) {
			Character newDelimiter = numbers.charAt(2);
			numbers = numbers.substring(4);
			return numbers.split(",|\n|" + newDelimiter);
		}

	    return numbers.split(",|\n");
	}

	private static int sum(String[] numbers) {
 	    int total = 0;
        for(String number : numbers) {
		    total += toInt(number);
		}
		return total;
    }

    private static Boolean contains(String text) {
		return text.contains(",") || text.contains("\n");
	}

}