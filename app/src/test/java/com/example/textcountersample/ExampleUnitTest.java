package com.example.textcountersample;

import org.junit.Test;

import static com.example.textcountersample.utils.ElementsCalculator.getCharsCount;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void whenCharsInputEmpty() {
        String givenInput = "";
        int expectedResult = 0;
        int actualResult = getCharsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenCharsInputLetters() {
        String givenInput = "abcd";
        int expectedResult = 4;
        int actualResult = getCharsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenCharsInputNumbers() {
        String givenInput = "12";
        int expectedResult = 2;
        int actualResult = getCharsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenCharsInputSymbols() {
        String givenInput = "@./";
        int expectedResult = 3;
        int actualResult = getCharsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenCharsInputSpace() {
        String givenInput = " ";
        int expectedResult = 1;
        int actualResult = getCharsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenCharsInputVarious() {
        String givenInput = "A1_b@ &";
        int expectedResult = 7;
        int actualResult = getCharsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
}