package br.com.maratonajava.aula.ZZInnerClass.exercise;

public class Exercise04 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("This is a message from the anonymous class of Runnable!");
                try {
                    Thread.sleep(10000l);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
    }
}
