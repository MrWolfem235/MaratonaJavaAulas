package br.com.maratonajava.aula.ZZInnerClass.test;

interface Usable {
    public abstract void use();
}

class Home{

    @Override
    public String toString() {
        return "This is home!";
    }

    class Bedroom implements Usable {
        @Override
        public String toString() {
            return "This is the bedroom";
        }

        @Override
        public void use() {
            System.out.println("Sleeping... 🛏");
        }

        class Bed implements Usable{
            @Override
            public void use() {
                System.out.println("Tidyng up the bed! 🧱");
            }
        }
    }
    class Restroom implements Usable {
        @Override
        public String toString() {
            return "This is the restroom";
        }

        @Override
        public void use() {
            System.out.println("Taking a shower 🚿");
        }
    }
    class Kitchen implements Usable {
        @Override
        public String toString() {
            return "This is the kitchen";
        }

        @Override
        public void use() {
            System.out.println("Cooking 🍳🥓🍜");
        }
    }
}

public class InnerClassTest02 {
    public static void main(String[] args) {
        Home home = new Home();
        Home.Kitchen kitchen = home.new Kitchen();
        Home.Bedroom bedroom = home.new Bedroom();
        Home.Bedroom.Bed childBed = bedroom.new Bed();
        Home.Bedroom.Bed myBed = bedroom.new Bed();
        Home.Restroom restroom = home.new Restroom();

         use(childBed, myBed);
    }

    private static void use(Usable... usables){
        for (Usable usable : usables) {
            usable.use();
        }

    }
}
