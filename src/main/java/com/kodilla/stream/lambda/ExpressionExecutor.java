package com.kodilla.stream.lambda;

import com.kodilla.stream.lambda.*;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpresion mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }

}
