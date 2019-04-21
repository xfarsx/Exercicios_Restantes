package Revisao_Exc1;

public class Aula {

    private String materia;
    private String hInicial;
    private String hFinal;

    public Aula() {
    }

    public Aula(String materia, String hInicial, String hFinal) {
        this.materia = materia;
        this.hInicial = hInicial;
        this.hFinal = hFinal;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String gethInicial() {
        return hInicial;
    }

    public void sethInicial(String hInicial) {
        this.hInicial = hInicial;
    }

    public String gethFinal() {
        return hFinal;
    }

    public void sethFinal(String hFinal) {
        this.hFinal = hFinal;
    }
}
