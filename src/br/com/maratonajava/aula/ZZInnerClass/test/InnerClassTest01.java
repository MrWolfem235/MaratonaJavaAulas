package br.com.maratonajava.aula.ZZInnerClass.test;

class OutterClass{
    public String string = "OutterClass String";
    public void printInnerStringFromOutter(){
        System.out.println("OutterClass: this is the new instant InnerClass message ->"+new InnerClass().string);
    }
    class InnerClass{
        public String string = "InnerClass String";
        public void printOutterStringFromInner(){
            System.out.println("InnerClass: this is my OutterClass string -> "+OutterClass.this.string);
        }
    }

}

public class InnerClassTest01 {
    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        OutterClass.InnerClass innerClass = outterClass.new InnerClass();
        outterClass.printInnerStringFromOutter();
        innerClass.printOutterStringFromInner();
    }
}
