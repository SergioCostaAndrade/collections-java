package List.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() { // construtor
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t:tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public List<Tarefa> obterDescricoesTarefas() {
        return tarefaList;
    }
    //public void obterDescricoesTarefas() {
    //    System.out.println(tarefaList.toString());
    //}
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Varrer");
        listaTarefas.adicionarTarefa("Limpar");
        listaTarefas.adicionarTarefa("Varrer");
        //listaTarefas.removerTarefa("Varrer");
        //listaTarefas.removerTarefa("Limpar");
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricoesTarefas());
        //listaTarefas.obterDescricoesTarefas();
    }




}
