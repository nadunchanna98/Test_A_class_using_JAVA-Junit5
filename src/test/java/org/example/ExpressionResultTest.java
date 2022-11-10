package org.example;
import static org.junit.jupiter.api.Assertions.*;

class ExpressionResultTest {

        @org.junit.jupiter.api.Test
        void evaluate() {
            ExpressionResult expressionResult = new ExpressionResult();
            expressionResult.setExpression("1 + 2");
            assertEquals(3, expressionResult.getResult());
        }

}