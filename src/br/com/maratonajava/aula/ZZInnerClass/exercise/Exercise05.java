package br.com.maratonajava.aula.ZZInnerClass.exercise;

interface Animal{
    public void makeSound();
}

class Outter5 {
    class Inner implements Animal{
        @Override
        public void makeSound() {
            System.out.println("'Animal Sound'");
        }
    }
}

public class Exercise05 {
    public static void main(String[] args) {
        Outter5 outter5 = new Outter5();
        Outter5.Inner inner = outter5.new Inner();
        inner.makeSound();
    }
}
