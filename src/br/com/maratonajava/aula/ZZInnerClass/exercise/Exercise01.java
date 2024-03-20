package br.com.maratonajava.aula.ZZInnerClass.exercise;

class Outter1 {
    String outterMessage = "This is the outter message!!!";
    class Inner{
        public void printOutterMessage(){
            System.out.println("Inner: "+outterMessage);
        }
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        Outter1 outter = new Outter1();
        Outter1.Inner inner = outter.new Inner();
        inner.printOutterMessage();
    }
}
