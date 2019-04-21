package Revisao_Exc1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Aluno aluno = new Aluno ("Fernando Santos");
        Aluno aluno1 = new Aluno ("Julia Silva");
        Aluno aluno2 = new Aluno ("Rafael Andrade");
        Aluno aluno3  = new Aluno ("Roberta Domingues");
        Professor professorM = new Professor("Jessica");
        Aula aulaInterfaces = new Aula("Interface e List","19:00","22:30");
        Aula aulaClassesAbstractHeranca = new Aula("Heranca e Classe Abstrata","19:00","22:30");
        Aula aulaListSetMap = new Aula("List, Set e Map","19:00","22:30");
        Aula aulaEqualsToString = new Aula("Equals e toString","19:00","22:30");
        Aula aulaGit = new Aula("Git","19:00","22:30");
        List<Aluno> alunosM = new ArrayList<>();
        List<Aula> aulasM = new ArrayList<>();
        Turma turmaMobile = new Turma("Mobile Android",aulasM,alunosM,professorM);

        aluno.gerarNumero();
        aluno1.gerarNumero();
        aluno2.gerarNumero();
        aluno3.gerarNumero();
        professorM.gerarNumero();

        aulasM.add(aulaGit);
        aulasM.add(aulaClassesAbstractHeranca);
        aulasM.add(aulaInterfaces);
        aulasM.add(aulaListSetMap);
        aulasM.add(aulaEqualsToString);

        alunosM.add(aluno);
        alunosM.add(aluno1);
        alunosM.add(aluno2);
        alunosM.add(aluno3);

        turmaMobile.mostrarTurma(turmaMobile);



    }

}
