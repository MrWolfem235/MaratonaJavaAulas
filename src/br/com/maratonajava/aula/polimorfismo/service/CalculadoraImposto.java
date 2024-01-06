package br.com.maratonajava.aula.polimorfismo.service;

import br.com.maratonajava.aula.polimorfismo.dominio.*;

public class CalculadoraImposto {
    
    public static void calcularImposto(Produto produto){
        String nome = produto.getNome();
        double valor = produto.getValor();
        double imposto = produto.calcularImposto();
        double total = valor + imposto;

        System.out.println("---- Relatório Imposto Produto ----");
        System.out.printf("produto: %s\nValor: %.2f\nTaxa a pagar: %.2f\nTotal: %.2f\n",nome, valor, imposto, total);

        if(produto instanceof Tomate){//Como produto não pode chamar dataValidade, verificamos se o produto é instância de Tomate e fazemos casting, podendo agora chamar os métodos de Tomate para esse objeto
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Validade: "+dataValidade);
        }
    }
    /*
        * A conversão de tipo em Java é usada para converter objetos ou variáveis de um tipo em outro.
        * Quando estamos convertendo ou atribuindo um tipo de dados a outro, eles podem não ser compatíveis.
        * Se for adequado, funcionará sem problemas, caso contrário, haverá chances de perda de dados.
        *
        * Tipos de conversão de tipos em Java
        *   O Java Type Casting é classificado em dois tipos.
        *       - Widening cast (Ímplicito) - conversão automática de tipo
        *       - Narrowing cast (explicito) - precisa de conversão explicita
        *
        * Widening Cast (menor para o maior tipo): Pode ocorrer se os dois tipos forem compatíveis e o tipo
        * destino for maior que o tipo origem
        * ex.:
        * byte source = 40;
        * short target = source; (não precisa de casting pra short)
        *
        * Widening Cast (Tipo de classe): No exemplo abaixo, a classe Computer e Tomato são os tipos menores
        * que estamos atribuindo ao tipo de classe Product, que é um tipo maior, portanto,
        * nenhuma conversão é necessária.
        *
        * Narrowing Cast (maior para o menor tipo): Quando estamos atribuindo um tipo maior a um tipo menor,
        * a conversão explicita é necessária.
        * ex.:
        * double source = 30.0;
        * float target = (float) source; (precisa do casting explícito pra float)
        *
        * Narrowing Cast (Tipo de classe): Quando estamos atribuindo um tipo maior a um tipo menor,
        * precisamos convertê -lo explicitamente.
        * ex.:
        * Product product = new Computer();
        * Computer computer = (computer) product;
        * System.out.println(computer.getName());
        * */
        
    /*Método que recebe uma referencia de produto que pode contem objetos
    específicos como tomate ou computador, 
    e usar seus métodos específicos */
}
