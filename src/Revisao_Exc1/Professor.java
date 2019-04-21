package Revisao_Exc1;

import java.util.List;
import java.util.Random;

public class Professor extends Turma implements GerarNumero {

    private String nome;
    private int rd;
    Random random = new Random();


    public Professor() {
    }
    public Professor(String nome) {
        this.nome = nome;
    }
    public Professor(String nome, int rd, Random random) {
        this.nome = nome;
        this.rd = rd;
        this.random = random;
    }

    public Professor(String nome, List<Aula> aulas, List<Aluno> alunos, Professor professor, String nome1, int rd, Random random) {
        super(nome, aulas, alunos, professor);
        this.nome = nome1;
        this.rd = rd;
        this.random = random;
    }

    public Professor(String materia, String hInicial, String hFinal, String nome, List<Aula> aulas, List<Aluno> alunos, Professor professor, String nome1, int rd, Random random) {
        super(materia, hInicial, hFinal, nome, aulas, alunos, professor);
        this.nome = nome1;
        this.rd = rd;
        this.random = random;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public void gerarNumero() {
            rd = random.nextInt(10000);
    }
}
