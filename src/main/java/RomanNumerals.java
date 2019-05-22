import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by hansjoergkeser on 19.07.17.
 */
class RomanNumerals {

	String addTwoNumerals(String a, String b) {

		//remove lesser numerals in front of bigger ones
		String resultA = removeSubtractionNumerals(a);
		String resultB = removeSubtractionNumerals(b);

		String result = resultA + resultB;

		//now sort the sum of numerals due to roman order
		String[] array = result.split("");
		/*
		 * M = 1000
		 * D = 500
		 * C = 100
		 * L = 50
		 * X = 10
		 * V = 5
		 * I = 1
		 */
		String ORDER = "MDCLXVI";
		Arrays.sort(array, Comparator.comparingInt(ORDER::indexOf));
		result = String.join("", array);

		result = sumUpFiveDigitGroupsOfOneKind(result);

		//finally all remaining four-digit numerals of a kind have to be summarized
		if (result.contains("IIII")) {
			result = result.replace("IIII", "IV");
		}
		if (result.contains("XXXX")) {
			result = result.replace("XXXX", "XL");
		}
		if (result.contains("CCCC")) {
			result = result.replace("CCCC", "CD");
		}
		return result;

	}

	private String removeSubtractionNumerals(String result) {

		result = result.replaceAll("IV", "IIII");
		result = result.replaceAll("IX", "VIIII");
		result = result.replaceAll("XL", "XXXX");
		result = result.replaceAll("CD", "CCCC");
		result = result.replaceAll("CM", "DCCCC");
		return result;

	}

	private String sumUpFiveDigitGroupsOfOneKind(String result) {

		if (result.contains("IIIII")) {
			result = result.replace("IIIII", "V");
		}
		if (result.contains("VV")) {
			result = result.replace("VV", "X");
		}
		if (result.contains("XXXXX")) {
			result = result.replace("XXXXX", "L");
		}
		if (result.contains("LL")) {
			result = result.replace("LL", "C");
		}
		if (result.contains("CCCCC")) {
			result = result.replace("CCCCC", "D");
		}
		if (result.contains("DD")) {
			result = result.replace("DD", "M");
		}
		return result;

	}

}