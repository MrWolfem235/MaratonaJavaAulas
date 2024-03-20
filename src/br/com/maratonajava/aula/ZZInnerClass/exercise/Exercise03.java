package br.com.maratonajava.aula.ZZInnerClass.exercise;

class Outter3{
    String outterMessage = "inside outter3 message";
    public void method(){
        String methodMessage = "inside method message";
        class LocalClass{
            String localMessage = "inside local class message";
            public void printMessages(){
                System.out.println(String.format(this.getClass().getSimpleName()+": 1º %s 2º %s 3º %s",localMessage,methodMessage,outterMessage));
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printMessages();
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        Outter3 outter3 = new Outter3();
        outter3.method();
    }
}
