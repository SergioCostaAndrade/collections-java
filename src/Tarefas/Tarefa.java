package Tarefas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) { // construtor
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String toString() {
        return descricao;
    }
}
