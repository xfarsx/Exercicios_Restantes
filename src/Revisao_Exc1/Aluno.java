package Revisao_Exc1;

import java.util.List;
import java.util.Random;

public class Aluno extends Turma implements GerarNumero {

    private String nome;
    private int ra;
    Random random = new Random();

    public Aluno() {
    }
    public Aluno(String nome) {
        this.nome = nome;

    }
    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public Aluno(String nome, List<Aula> aulas, List<Aluno> alunos, Professor professor, String nome1, int ra) {
        super(nome, aulas, alunos, professor);
        this.nome = nome1;
        this.ra = ra;
    }

    public Aluno(String materia, String hInicial, String hFinal, String nome, List<Aula> aulas, List<Aluno> alunos, Professor professor, String nome1, int ra) {
        super(materia, hInicial, hFinal, nome, aulas, alunos, professor);
        this.nome = nome1;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public void gerarNumero() {
        ra = random.nextInt(10000);
    }
}
