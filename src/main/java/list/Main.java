package main.java.list;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.java.list.operacoes.basicas.ListaTarefa;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public void meuMetodo() {
        logger.debug("Mensagem de debug");
        logger.info("Mensagem de informação");
        logger.warn("Mensagem de aviso");
        logger.error("Mensagem de erro");
        logger.fatal("Mensagem fatal");
    }
   
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
