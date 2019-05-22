/**
 * Created by hansjoergkeser on 30.07.17.
 */
class ArabicDecimals {

	private int result = -1;

	int convert(String input) {
		if (input.equalsIgnoreCase("I")) {
			result = 1;
		}
		if (input.equalsIgnoreCase("II")) {
			result = 2;
		}
		if (input.equalsIgnoreCase("III")) {
			result = 3;
		}
		if (input.equalsIgnoreCase("IV")) {
			result = 4;
		}
		if (input.equalsIgnoreCase("V")) {
			result = 5;
		}
		if (input.equalsIgnoreCase("VI")) {
			result = 6;
		}
		if (input.equalsIgnoreCase("VII")) {
			result = 7;
		}
		if (input.equalsIgnoreCase("VIII")) {
			result = 8;
		}
		if (input.equalsIgnoreCase("IX")) {
			result = 9;
		}
		if (input.equalsIgnoreCase("X")) {
			result = 10;
		}
		return result;
	}

}
