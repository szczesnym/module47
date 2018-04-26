package com.kodilla.stream.beautifier;

public class AsterixText {
    public static String asterixEveryChar(String textToAsterix) {
        String textResult = "";
        if(!textToAsterix.isEmpty()) {
            for (int i = 0; i < textToAsterix.length(); i++) {
                textResult += textToAsterix.charAt(i) + "*";
            }
        }
        return textResult;
    }

    public static String bracketEverySecondChar(String textToBracket) {
        String textResult = "";
        if(!textToBracket.isEmpty()) {
            for (int i = 0; i < textToBracket.length(); i++) {
                if(i % 2 == 0 ) {
                    textResult += "(" + textToBracket.charAt(i) + ")";
                } else {
                    textResult += textToBracket.charAt(i);
                }
            }
        }
        return textResult;
    }
}
