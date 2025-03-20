package main.java.list;

import main.java.list.operacoes.basicas.ListaTarefa;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ListaTarefa tarefas = new ListaTarefa();
        for (int i = 1; i <= 5; i++) {            
            tarefas.adicionarTarefa("Tarefa " + i); 
            final int ii = i;           
            tarefas.getTarefaList().forEach(action -> {
                System.out.println("Testando tarefa: tarefa de numero = "+ii+"."+action.getDescricao());
            });
        }
    }
}
