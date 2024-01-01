package br.com.maratonajava.aula.projetos.encomenda.domain;

import java.text.DecimalFormat;
import java.util.Locale;

public class Funcoes {
    Locale locale = Locale.US;

    public static double real(double valor){
        DecimalFormat formatar = new DecimalFormat("####,##");
        return Double.parseDouble(formatar.format(valor));
    }
}
