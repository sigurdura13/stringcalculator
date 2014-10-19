package is.ru.stringcalculator;



public class Calculator {

<<<<<<< HEAD
	public static int add(String text) {

		if (isEmptyString(text)) {
			return 0;
		}
		else if (text.contains("-")) {
			NegativesNotAllowed(text);
		}
		else if (contains(text)) {
			if (text.startsWith("//")) {
				return sum(newDelimiter(text));
			}
			return sum(splitNumbers(text));
		} else {
			return 1;
		}

		return toInt(text);
	}

	private static Boolean isEmptyString(String text) {
		return text.equals("");
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers) {
	    return numbers.split(",|\n");
	}

	private static int sum(String[] numbers) {
 	    int total = 0;
        for(String number : numbers) {

		    if (toInt(number) <= 1000) {
		    	total += toInt(number);
			}
		}
		return total;
    }

    private static Boolean contains(String text) {
		return text.contains(",") || text.contains("\n") || text.contains("//") || text.contains("-");
	}

	private static String[] newDelimiter(String numbers) {	 
			Character newDelimiter = numbers.charAt(2);
			numbers = numbers.substring(4);
			return numbers.split(",|\n|" + newDelimiter);
	}

	private static void NegativesNotAllowed(String numbers) {	 
		String text = "Negatives not allowed: ";
		String[] input = numbers.split("-");
		
		for (int i = 1; i < input.length; i++) {
			text += "-" + input[i].substring(0, 1);
			if (i < input.length - 1) {
				text += ",";
			}
		}
		throw new IllegalArgumentException(text);
=======
	public static int add(String text){
		if (text.equals("")) {
			return 0;
		} else {
			return 1;
		}
>>>>>>> FETCH_HEAD
	}
}