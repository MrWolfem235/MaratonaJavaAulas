package br.com.maratonajava.aula.ZZInnerClass.exercise;

class Outter2{
    final static private String staticMessage = "This is the static private Outter2 message";
    static class Nested{
        public void printOutterStaticMessage(){
            System.out.println("Nested: "+ staticMessage);
        }
    }
}

public class Exercise02 {
    public static void main(String[] args) {
        Outter2.Nested nested = new Outter2.Nested();
        nested.printOutterStaticMessage();
    }

}
