package Revisao_Exc1;

import java.util.List;

public class Turma extends Aula{

    private String nome;
    private List<Aula> aulas;
    private List<Aluno> alunos;
    private Professor professor;

    public Turma() {
    }

    public Turma(String nome, List<Aula> aulas, List<Aluno> alunos, Professor professor) {
        this.nome = nome;
        this.aulas = aulas;
        this.alunos = alunos;
        this.professor = professor;
    }

    public Turma(String materia, String hInicial, String hFinal, String nome, List<Aula> aulas, List<Aluno> alunos, Professor professor) {
        super(materia, hInicial, hFinal);
        this.nome = nome;
        this.aulas = aulas;
        this.alunos = alunos;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void mostrarTurma(Turma turma)
    {
        System.out.println("\n======== Turma Formada =======\n" + turma.nome + "\n=============================\n"
        + "Professor(a): " + turma.professor.getNome() + "\nRD: " +turma.professor.getRd() +
                "\n=============================\n" + "\nAulas Programadas" + "\n=============================\n" );

        for (int i = 0;i<turma.aulas.size();i++)
        {
            int num = 0;
            num = i + 1;
            System.out.println("Aula (" + num +") - " + turma.aulas.get(i).getMateria() + "\nInício: "
            + turma.aulas.get(i).gethInicial() + "\nTérmino: " + turma.aulas.get(i).gethFinal() +  "\n=============================\n");
        }
        System.out.println("\n===== Alunos Registrados =====\n");
        for (int i = 0;i<turma.alunos.size();i++)
        {
            System.out.println("Aluno: " + turma.alunos.get(i).getNome() + "\nRA: " + turma.alunos.get(i).getRa() +
                    "\n=============================\n"  );
        }
    }
}
