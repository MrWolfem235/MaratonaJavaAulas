package br.com.maratonajava.aula.ZZInnerClass.test;

class Outter{
    static String firstName = "Carlos ";
    public static class StaticInner{
        String lastName = "Eduardo";
        public void printFullName(){
            System.out.println("StaticInner: "+firstName + lastName);
        }
    }
}

public class StaticClassTest01 {
    public static void main(String[] args) {
        Outter.StaticInner staticInner = new Outter.StaticInner();
        staticInner.printFullName();
    }
}
