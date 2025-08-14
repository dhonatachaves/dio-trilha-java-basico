package main.java.set.Pesquisa;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
            return;
        }

        Tarefa tarefaParaRemover = encontrarTarefaPorDescricao(descricao);
        if(tarefaParaRemover != null) {
            tarefaSet.remove(tarefaParaRemover);
        }else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void exibirTarefas() {
        if(tarefaSet.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        }else {
            System.out.println("Tarefas");
            for(Tarefa t: tarefaSet) {
                System.out.println("- " + t.getDescricao() + " [" + (t.getTarefaConcluida() ? "Concluída" : "Pendente") + "]");
            }
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t: tarefaSet) {
            if(t.getTarefaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t: tarefaSet) {
            if(!t.getTarefaConcluida()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefa = encontrarTarefaPorDescricao(descricao);
        if(tarefa != null) {
            tarefa.setTarefaConcluida(true);
        }else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefa = encontrarTarefaPorDescricao(descricao);
        if(tarefa != null) {
            tarefa.setTarefaConcluida(false);
        }else {
            System.out.println("Tarefa não concluída.");
        }
    }

    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
            System.out.println("Lista de Tarefa já está vazia!");
        }else {
            tarefaSet.clear();
        }
    }

    private Tarefa encontrarTarefaPorDescricao(String descricao) {
        for(Tarefa t: tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                return t;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas á lista
        listaTarefas.adicionarTarefa("Lavar a louça.");
        listaTarefas.adicionarTarefa("Levar o lixo para fora.");
        listaTarefas.adicionarTarefa("Abastecer o carro.");
        listaTarefas.adicionarTarefa("Passear com os cachorros.");

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Abastecer o carro.");
        listaTarefas.exibirTarefas();

        // Obtendo o número total de tarefas
        System.out.println("Total de tarefas : " + listaTarefas.contarTarefas());

        // Exibibindo uma lista de tarefas concluídas
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        // Exibindo uma lista de tarefas pendentes
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        // Alterando situação de tarefa para concluída
        listaTarefas.marcarTarefaConcluida("Levar o lixo para fora.");
        listaTarefas.marcarTarefaConcluida("Lavar a louça.");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        // Alterando situação de tarefa para pendente
        listaTarefas.marcarTarefaPendente("Lavar a louça.");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();


    }



}
