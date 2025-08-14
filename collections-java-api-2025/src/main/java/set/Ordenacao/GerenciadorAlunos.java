package main.java.set.Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributos
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos () {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        Aluno novoAluno = new Aluno(nome, matricula, nota);
        if(alunoSet.contains(novoAluno)) {
            System.out.println("Já existe um aluno com a matrícula: " + novoAluno.getMatricula());
        }else {
            alunoSet.add(novoAluno);
            System.out.println("Aluno adicionado com sucesso!");
        }
    }

    public void removerAluno(long matricula) {
       if(!alunoSet.isEmpty()) {
           Aluno alunoParaRemover = null;
           for(Aluno a: alunoSet) {
               if(a.getMatricula() == matricula) {
                   alunoParaRemover = a;
                   break;
               }
           }

           if(alunoParaRemover != null) {
               alunoSet.remove(alunoParaRemover);
               System.out.println("Aluno removido com sucesso!");
           }else {
               System.out.println("Matrícula de aluno não encontrada.");
           }
       }else {
           System.out.println("Lista de alunos está vazia.");
       }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                System.out.println(" - Aluno: " + a.getNome() + " | Matrícula: " + a.getMatricula() + " | Nota: " + a.getNota());
            }
        }else {
            System.out.println("Lista de alunos está vazia.");
        }
    }

    public Aluno buscarAlunoPorMatricula(Long matricula) {
        if(alunoSet.isEmpty()) {
            System.out.println("Lista de alunos está vazia");
            return null;
        }

        for(Aluno a: alunoSet) {
            if(a.getMatricula() == matricula) {
                return a;
            }
        }

        System.out.println("Matrícula não encontrada.");
        return null;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos á lista
        gerenciadorAlunos.adicionarAluno("Alfredo", 11L, 8d);
        gerenciadorAlunos.adicionarAluno("Jorge", 11L, 7d);
        gerenciadorAlunos.adicionarAluno("Betriz", 22L, 7.8d);
        gerenciadorAlunos.adicionarAluno("Amanda", 33L, 8.4d);
        gerenciadorAlunos.adicionarAluno("Jhonatan", 34L, 8.1d);
        gerenciadorAlunos.adicionarAluno("Anequin", 35L, 8.8d);
        gerenciadorAlunos.exibirAlunos();

        // Removendo aluno através do número de matrícula
        gerenciadorAlunos.removerAluno(33L);
        gerenciadorAlunos.exibirAlunos();

        // Exibindo alunos por nome em ordem alfabética
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos por nota em ordem crescente
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        // Realizando a busca de um aluno pelo número da matrícula
        System.out.println(gerenciadorAlunos.buscarAlunoPorMatricula(39L));
    }
}
