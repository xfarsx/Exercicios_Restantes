package Tarefa_Interfaces;

public class Multiplicacao implements OperacaoMatematica {
    private int a;
    private int b;

    public Multiplicacao() {
    }

    public Multiplicacao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void calcular(int a, int b) {
        int calc;
        calc = a * b;
        System.out.println("A multiplicação é " + calc);

    }
}
