package br.com.maratonajava.aula.Aprojects.todolist.test;

import br.com.maratonajava.aula.Aprojects.todolist.main.enums.OrderList;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Acess;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Create;

public class AcessTest02 {
    public static void main(String[] args) {
        Create.note("Compras", "Leite, ovos, pão");
        Create.note("Reunião", "Agendar reunião com a equipe");
        Create.note("Ideias para o projeto", "Pesquisar novas abordagens");
        Create.note("Contatos", "Atualizar lista de contatos");
        Create.note("Livros para ler", "Adicionar novos títulos");
        Create.note("Aniversário", "Comprar presente para o aniversário");
        Create.note("Projetos pessoais", "Listar metas para o mês");
        Create.note("Dicas de viagem", "Pesquisar dicas para próxima viagem");
        Create.note("Exercícios", "Montar novo plano de treino");
        Create.note("Filmes para assistir", "Atualizar lista de filmes");

        System.out.println(Acess.getNotesByOrder(OrderList.BY_PRIORITY));
    }
}
