package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.AsterixText;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        String beautyResult;
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("fhksjdhfsjkdfhk",AsterixText::asterixEveryChar );
        poemBeautifier.beautify("fhksjdhfsjkdfhk",String::toUpperCase);
        poemBeautifier.beautify("fhksjdhfsjkdfhk",(s) -> "0000000" + s);
        poemBeautifier.beautify("fhksjdhfsjkdfhk",(s) -> s + "00000000");
        poemBeautifier.beautify("fhksjdhfsjkdfhk",AsterixText::bracketEverySecondChar);
    }
}
