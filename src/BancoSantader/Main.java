package BancoSantader;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1254,222015422,102745789,4520,0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2451,354587852,145785145,6205,0.05);

        contaCorrente.depositarDinheiro(450.0);
        contaCorrente.sacarDinheiro(200.0);
        contaCorrente.depositarCheque(600.0);

        contaPoupanca.depositarDinheiro(370.0);
        contaPoupanca.recolherJuros();
        contaPoupanca.sacarDinheiro(240.0);


    }
}
