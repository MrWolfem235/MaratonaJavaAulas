package br.com.maratonajava.aula.XColections.exercises.test;

import br.com.maratonajava.aula.XColections.exercises.domain.MathExpression;

public class MathExpressionValidateTest {
    public static void main(String[] args) {
        MathExpression expression2 = new MathExpression("((a+b)×(c−d))2+((e÷f)+g)");
        MathExpression expression1 = new MathExpression("(3×((x+y)2−(x−y)2))×(z1200B+1)2");
        System.out.println(expression2.isValid());
        System.out.println(expression1.isValid());
    }
}
