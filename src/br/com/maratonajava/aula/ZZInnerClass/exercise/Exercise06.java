package br.com.maratonajava.aula.ZZInnerClass.exercise;

class Outter6{
    {
        System.out.println(this.getClass().getSimpleName()+": instance created!");
    }
    class Inner1{
        {
            System.out.println(this.getClass().getSimpleName()+": instance created!");
        }
        class Inner2{
            {
                System.out.println(this.getClass().getSimpleName()+": instance created!");
            }
            public void printMessage(){
                System.out.println(this.getClass().getSimpleName()+": Message printed sucessfully!");
            }
        }
    }
}

public class Exercise06 {
    public static void main(String[] args) {
        Outter6 outter6 = new Outter6();
        Outter6.Inner1 inner1 = outter6.new Inner1();
        Outter6.Inner1.Inner2 inner2 = inner1.new Inner2();
        inner2.printMessage();
    }
}
