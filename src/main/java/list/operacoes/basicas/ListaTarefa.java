package main.java.list.operacoes.basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefaList.add(tarefa);
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao) {

        List<Tarefa> tarefasAremover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasAremover.add(tarefa);
            }

        }
        this.tarefaList.removeAll(tarefasAremover);
    }

    public int obterNumeroTotaldeTarefas() {
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.getDescricao());
        }
    }

}
