package br.com.maratonajava.aula.Aprojects.todolist.test;

import br.com.maratonajava.aula.Aprojects.todolist.main.domain.Task;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.Category;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.InfoLevel;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.OrderList;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.Priority;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Acess;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Conclusion;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Create;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Modify;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Format;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Out;

import java.time.LocalDateTime;
import java.time.Month;

public class FormatTest01 {
    public static void main(String[] args) {
        Task task1 = Create.task("Estudar geografia hoje", "Descrição teste de nova tarefa 1", Category.HOME, Priority.NORMAL, LocalDateTime.of(2024, Month.FEBRUARY, 28, 12, 30));
        Task task2 = Create.task("Fazer compras", "Comprar mantimentos para a semana", Category.HOME, Priority.URGENCY, LocalDateTime.of(2024, Month.FEBRUARY, 29, 15, 0));
        Task task3 = Create.task("Exercícios físicos", "Ir à academia", Category.HEALTH, Priority.CASUAL, LocalDateTime.of(2024, Month.MARCH, 1, 18, 0));
        Task task4 = Create.task("Reunião de trabalho", "Preparar apresentação", Category.WORK, Priority.URGENCY, LocalDateTime.of(2024, Month.MARCH, 2, 9, 0));
        Task task5 = Create.task("Planejar viagem", "Pesquisar destinos e hospedagem", Category.TRAVEL, Priority.NORMAL, LocalDateTime.of(2024, Month.MARCH, 3, 14, 0));
        Task task6 = Create.task("Ler livro", "Concluir capítulo 5", Category.LEISURE, Priority.CASUAL, LocalDateTime.of(2024, Month.MARCH, 4, 20, 0));
        Task task7 = Create.task("Pagamento de contas", "Pagar faturas mensais", Category.FINANCES, Priority.NORMAL, LocalDateTime.of(2024, Month.MARCH, 5, 16, 0));

        Out.sleep(5000);

        Modify.task(task3, "Exercícios físicos (atualizado)",null, null, Priority.NORMAL,null);

        Conclusion.concludeTask(task1, task3, task5, task7);

        System.out.println(Format.formatTasksArrayList(Acess.getTasksByOrder(OrderList.BY_CONCLUSION), InfoLevel.FULL));
    }
}
