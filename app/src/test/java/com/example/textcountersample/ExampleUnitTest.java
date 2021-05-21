package com.example.textcountersample;

import org.junit.Test;

import static com.example.textcountersample.utils.ElementsCalculator.getCharsCount;
import static com.example.textcountersample.utils.ElementsCalculator.getWordsCount;
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
    @Test
    public void whenCharsInputVeryLong() {
        String givenInput = "kkdjskgjakgfdjahkjaskhjgkhjkfghsjghgjkfdkjkdgjksjgksfjksfjhksljhskljhklsjhksfjhk";
        int expectedResult = 80;
        int actualResult = getCharsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputEmpty() {
        String givenInput = "";
        int expectedResult = 0;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputLetters() {
        String givenInput = "Labas vakaras";
        int expectedResult = 2;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputNumbers() {
        String givenInput = "123 456 789";
        int expectedResult = 3;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputSymbols() {
        String givenInput = "/ - # (";
        int expectedResult = 4;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputSpace() {
        String givenInput = "   ";
        int expectedResult = 0;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputVarious() {
        String givenInput = "Labas :) 10 balų";
        int expectedResult = 4;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputVeryLong() {
        String givenInput = "When you run, debug, or test your code, Android Studio uses a run/debug configuration to determine how to perform the operation. Typically, the default configuration is sufficient to run or debug an app. However, you can modify and create new configurations, and modify the default templates to suit your development process as described on this page.";
        int expectedResult = 56;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void whenWordsInputWordsSum() {
        String givenInput = "Labas" + "Vakaras";
        int expectedResult = 1;
        int actualResult = getWordsCount(givenInput);
        assertEquals(expectedResult, actualResult);
    }
}