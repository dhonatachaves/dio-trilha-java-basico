package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    //Atributo
    private String descricao;
    private boolean tarefaConcluida;

    //getters e setters
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.tarefaConcluida = false;
    }


    public String getDescricao() {
        return descricao;
    }


    public boolean getTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
