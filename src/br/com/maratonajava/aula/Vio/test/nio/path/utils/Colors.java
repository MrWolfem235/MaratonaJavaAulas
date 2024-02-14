package br.com.maratonajava.aula.Vio.test.nio.path.utils;

public enum Colors {
    RESET("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    SUBLINE("\u001B[6m"),
    WHITE_BACK("\u001B[7m"),
    RISKED("\u001B[9m"),
    RED_BACK("\u001B[41m"),
    GREEN_BACK("\u001B[42m"),
    YELLOW_BACK("\u001B[43m"),
    BLUE_BACK("\u001B[44m"),
    PURPLE_BACK("\u001B[45m"),
    LIGHT_BLUE_BACK("\u001B[46m"),
    WHITE_BACK2("\u001B[47m"),
    GRAY("\u001B[90m"),
    RED_STR("\u001B[91m"),
    GREEN_STR("\u001B[92m"),
    YELLOW_STR("\u001B[93m"),
    BLUE_STR("\u001B[94m"),
    PURPLE_STR("\u001B[95m"),
    LIGHT_BLUE_STR("\u001B[96m");

    public static String format(Object object, Colors colors){
        try {
            return colors + (String) object + RESET;
        } catch (Exception e) {
            return colors + object.toString() + RESET;
        }
    }

    public static void init(Colors colors){
        System.out.println(colors.toString());
    }

    public static void end(){
        System.out.println(RESET.toString());
    }

    String colorCode;

    Colors(String string){
        colorCode = string;
    }

    @Override
    public String toString() {
        return colorCode;
    }
}
