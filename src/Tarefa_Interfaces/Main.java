package Tarefa_Interfaces;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

        soma.calcular(2,2);
        sub.calcular(4,2);
        mult.calcular(5,4);
        div.calcular(20,2);

    }
}
