package br.com.maratonajava.aula.XColections.exercises.domain;

import java.util.Stack;

public class MathExpression {
    String mathExpression;

    public MathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public boolean isValid(){
        char[] characters = mathExpression.toCharArray();
        Stack<Integer> parentesis = new Stack<>();
        for (char character : characters){
            switch (character) {
                case ('('):
                    parentesis.push(1);
                    break;
                case(')'):
                    if (parentesis.isEmpty()) return false;
                    parentesis.pop();
                    break;
                default:
                    break;
            }
        }
        if (!parentesis.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}
