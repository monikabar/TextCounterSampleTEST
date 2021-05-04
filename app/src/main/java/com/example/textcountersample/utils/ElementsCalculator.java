package com.example.textcountersample.utils;

public class ElementsCalculator {
    public static int getCharsCount(String inputText){
        if (inputText != null){
            return inputText.length();
        }
        return 0;
    }

    public static int getWordsCount(String userInputText) {
        userInputText = userInputText.replace("\n", " ");
        String[] userInputTextArray = userInputText.split(" ");
        return userInputTextArray.length;
    }
}
