import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hansjoergkeser on 19.07.17.
 */
public class AdditionTest {

    @Test
    public void assertOnePlusOneTest() {
        String expectedResult = "II";
        String result = new RomanNumerals().addTwoNumerals("I","I");
        assertEquals("assertOnePlusOneTest failed.", expectedResult,result);
    }

    @Test
    public void assertOnePlusTwo() {
        assertEquals("assertOnePlusTwo failed.","III",new RomanNumerals().addTwoNumerals("I","II"));
    }

    @Test
    public void assertTwoPlusOne() {
        assertEquals("assertTwoPlusOne failed.","III",new RomanNumerals().addTwoNumerals("II","I"));
    }

    @Test
    public void assertTwoPlusTwoTest() {
        assertEquals("assertTwoPlusTwoTest failed.","IV",new RomanNumerals().addTwoNumerals("II","II"));
    }

    @Test
    public void assertThreePlusTwoTest() {
        assertEquals("assertThreePlusTwoTest failed.","V",new RomanNumerals().addTwoNumerals("III","II"));
    }

    @Test
    public void assertThreePlusThreeTest() {
        assertEquals("assertThreePlusThreeTest failed.","VI",new RomanNumerals().addTwoNumerals("III","III"));
    }

    @Test
    public void assertThreePlusFourTest() {
        assertEquals("assertThreePlusFourTest failed.","VII",new RomanNumerals().addTwoNumerals("III","IV"));
    }

    @Test
    public void assertFourPlusFourTest() {
        assertEquals("assertFourPlusFourTest failed.","VIII",new RomanNumerals().addTwoNumerals("IV","IV"));
    }

    @Test
    public void assertTenPlusOneTest() {
        assertEquals("assertTenPlusOneTest failed.","XI",new RomanNumerals().addTwoNumerals("X","I"));
    }

    @Test
    public void assertFourteenPlusFourteenTest() {
        assertEquals("assertFourteenPlusFourteenTest failed.",
                "XXVIII",new RomanNumerals().addTwoNumerals("XIV","XIV"));
    }

    @Test
    public void assertTwentyPlusTwentyTest() {
        assertEquals("assertTwentyPlusTwentyTest failed.",
                "XL",new RomanNumerals().addTwoNumerals("XX","XX"));
    }

    @Test
    public void assertTwoHundredPlusTwoHundredTest() {
        assertEquals("assertTwoHundredPlusTwoHundredTest failed.",
                "CD",new RomanNumerals().addTwoNumerals("CC","CC"));
    }

    @Test
    public void assert1666Plus1666() {
        assertEquals("assert1666Plus1666 failed.",
                "MMMCCCXXXII",new RomanNumerals().addTwoNumerals("MDCLXVI","MDCLXVI"));
    }

    @Test
    public void assert2449Plus1988() {
        assertEquals("assert2449Plus1988 failed.",
                "MMMMCDXXXVII",new RomanNumerals().addTwoNumerals("MMCDXLIX","MCMLXXXVIII"));
    }

}