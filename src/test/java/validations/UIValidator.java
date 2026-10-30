package validations;

import org.junit.Assert;

public class UIValidator {

    public static void validateTextPresent(
            String actual,
            String expected) {

        Assert.assertTrue(
                "Expected text not found. Actual text: " + actual,
                actual.contains(expected));
    }

    public static void validateUrlContains(
            String actualUrl,
            String expectedText) {

        Assert.assertTrue(
                "URL validation failed: " + actualUrl,
                actualUrl.contains(expectedText));
    }
}