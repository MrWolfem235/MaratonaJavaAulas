package br.com.maratonajava.aula.Aprojetos.validacao.test;

public class ValidadorTest02 {
    public static void main(String[] args) {
        String text = " carloseduscc@gmail.co, legendofzelda235@gmail.com,carlos.esccavaletto@senacsp.edu.br, joao*@%.7, luanzin@)(.)(, débora¨¨@gmail.com";
        System.out.println(text.split(",")[1].trim());
    }
}
