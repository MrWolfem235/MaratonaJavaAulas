package br.com.maratonajava.aula.Aprojetos.todolist.test;

import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Task;
import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Category;
import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Priority;
import br.com.maratonajava.aula.Aprojetos.todolist.main.services.Create;

import java.time.LocalDateTime;
import java.time.Month;

public class PreCreateData {
    public static void init(){
        //Testing purpose initializations
        Task task1 = Create.task("Estudar geografia hoje", "Descrição teste de nova tarefa 1", Category.HOME, Priority.NORMAL, LocalDateTime.of(2024, Month.FEBRUARY, 28, 12, 30));
        Task task2 = Create.task("Fazer compras", "Comprar mantimentos para a semana", Category.HOME, Priority.URGENCY, LocalDateTime.of(2024, Month.FEBRUARY, 29, 15, 0));
        Task task3 = Create.task("Exercícios físicos", "Ir à academia", Category.HEALTH, Priority.CASUAL, LocalDateTime.of(2024, Month.MARCH, 1, 18, 0));
        Task task4 = Create.task("Reunião de trabalho", "Preparar apresentação", Category.WORK, Priority.URGENCY, LocalDateTime.of(2024, Month.MARCH, 2, 9, 0));
        Task task5 = Create.task("Planejar viagem", "Pesquisar destinos e hospedagem", Category.TRAVEL, Priority.NORMAL, LocalDateTime.of(2024, Month.MARCH, 3, 14, 0));
        Task task6 = Create.task("Ler livro", "Concluir capítulo 5", Category.LEISURE, Priority.CASUAL, LocalDateTime.of(2024, Month.MARCH, 4, 20, 0));
        Task task7 = Create.task("Pagamento de contas", "Pagar faturas mensais", Category.FINANCES, Priority.NORMAL, LocalDateTime.of(2024, Month.MARCH, 5, 16, 0));

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
    }
}
