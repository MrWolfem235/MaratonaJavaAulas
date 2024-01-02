package br.com.maratonajava.aula.modificadorabstrato.test;

import br.com.maratonajava.aula.modificadorabstrato.domain.*;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Funcionario funcionario = new Funcionario("Zoro", 1500); Não é possível instanciar classes abstratas, apenas classes concretas
        Gerente gerente = new Gerente("Nami", 3000d);
        Desenvolvedor dev = new Desenvolvedor("Zoro", 12000d); 
        
        System.out.println(gerente.toString());
        System.out.println();
        System.out.println(dev.toString());
    }
}
