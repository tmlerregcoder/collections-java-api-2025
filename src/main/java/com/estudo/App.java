package com.estudo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.estudo.list.operacoesBasicas.ListaTarefa;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) throws Exception {

        logger.debug("Hello, World!");
        ListaTarefa tarefas = new ListaTarefa();
        logger.debug("O número total de tarefas é: " + tarefas.obterNumeroTotaldeTarefas());
        for (int i = 1; i <= 5; i++) {
            tarefas.adicionarTarefa("Tarefa " + i);
            final int ii = i;
            tarefas.getTarefaList().forEach(action -> {
                logger.debug("Testando tarefa: tarefa de numero = " + ii + "." + action.getDescricao());               
            });
        }
        logger.debug("O número total de tarefas é: " + tarefas.obterNumeroTotaldeTarefas());
        tarefas.obterDescricoesTarefas();

    }

}
