import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hansjoergkeser on 30.07.17.
 */
public class ConvertToDecimalsTest {

    ArabicDecimals decimals = new ArabicDecimals();

    @Test
    public void assertConvertToOneTest() {
        String input = "I";
        int expectedResult = 1;
        Assert.assertEquals("assertConvertToOneTest failed.", expectedResult, decimals.convert(input));
    }

    @Test
    public void assertConvertToTwoTest() {
        Assert.assertEquals("assertConvertToTwoTest failed.", 2, decimals.convert("II"));
    }

    @Test
    public void assertConvertToThreeTest() {
        Assert.assertEquals("assertConvertToThreeTest failed.", 3, decimals.convert("III"));
    }

    @Test
    public void assertConvertToFourTest() {
        Assert.assertEquals("assertConvertToFourTest failed.", 4, decimals.convert("IV"));
    }

    @Test
    public void assertConvertToFiveTest() {
        Assert.assertEquals("assertConvertToFiveTest failed.", 5, decimals.convert("V"));
    }

    @Test
    public void assertConvertToSixTest() {
        Assert.assertEquals("assertConvertToSixTest failed.", 6, decimals.convert("VI"));
    }

    @Test
    public void assertConvertToSevenTest() {
        Assert.assertEquals("assertConvertToSevenTest failed.", 7, decimals.convert("VII"));
    }

    @Test
    public void assertConvertToEightTest() {
        Assert.assertEquals("assertConvertToEightTest failed.", 8, decimals.convert("VIII"));
    }

    @Test
    public void assertConvertToNineTest() {
        Assert.assertEquals("assertConvertToNineTest failed.", 9, decimals.convert("IX"));
    }

    @Test
    public void assertConvertToTenTest() {
        Assert.assertEquals("assertConvertToTenTest failed.", 10, decimals.convert("X"));
    }

}
