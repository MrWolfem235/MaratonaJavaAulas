package br.com.maratonajava.aula.ZZInnerClass.test;

class Compani{
    abstract static class Sector{
        public void work(){
            System.out.print(this.getClass().getSimpleName()+": ");
        };
    }

    static class FinancialSector extends Sector{
        @Override
        public void work() {
            super.work();
            System.out.println("Calculando finanças! 💴💴💴");
        }
    }
    static class HRSector extends Sector{
        @Override
        public void work() {
            super.work();
            System.out.println("Administrando relações com funcionários! 👨‍🚒👩‍🚒");
        }
    }
    static class AdmSector extends Sector{
        @Override
        public void work() {
            super.work();
            System.out.println("Administrando demais setores... 🤵");
        }
    }
}

public class StaticClassTest02 {
    public static void main(String[] args) {
        Compani.FinancialSector financialSector = new Compani.FinancialSector();
        Compani.HRSector hrSector = new Compani.HRSector();
        Compani.AdmSector admSector = new Compani.AdmSector();
        financialSector.work();
        hrSector.work();
        admSector.work();
    }
}
