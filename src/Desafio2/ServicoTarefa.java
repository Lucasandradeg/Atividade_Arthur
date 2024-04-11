package Desafio2;
import java.util.ArrayList;
import java.util.List;

public class ServicoTarefa {

    private ArrayList<Tarefa> listaTarefas;

    public ServicoTarefa() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void removerTarefa(String nome) {
        listaTarefas.removeIf(tarefa -> tarefa.getNome().equals(nome));
    }
}