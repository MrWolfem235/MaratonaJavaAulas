package br.com.maratonajava.aula.Aprojetos.todolist.main.view.visual;

public abstract class Out {
    
    //all type of input pass by this method
    public static Object outputInstersection(Object output){
        return output;
    }

    public static void println(String string){
        System.out.println(outputInstersection(string));
    }

    public static void println(){
        System.out.println();
    }

    public static void print(String string){
        System.out.print(outputInstersection(string));
    }
    
    //delegate all code to sleep the thread a time here
    public static void sleep (long timeToWaitInMs){
        try {
            Thread.sleep(timeToWaitInMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //print a message and a timing point counter
    public static void countPoints (String waitMessage, int timeWait){
        String points = ". ";
        for (int i = 0; i < timeWait; i++) {
            print("\r" + waitMessage + " " + points);
            points += ". ";
            sleep(1000);
        }
    }

    //delay message system
    public static void delayMessage (long preMessage, String message, long posMessage){
        sleep(preMessage*1000);
        println(message);
        sleep(posMessage*1000);
    }

    //clean terminal screen code
    public static void limparTela() {
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println();
        }
        try {
            // Verifica o sistema operacional
            String os = System.getProperty("os.name").toLowerCase();

            // Executa o comando específico para limpar o terminal, dependendo do sistema operacional
            if (os.contains("win")) {
                // Para Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para Unix/Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Trata exceções, se ocorrerem
            e.printStackTrace();
        }
    }
}
