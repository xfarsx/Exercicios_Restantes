package BancoSantader;

public class ContaPoupanca extends Clientes  {

    private double saldo;
    private double tJuros;

    public ContaPoupanca() {
    }


    public ContaPoupanca(Integer numCliente, Integer numRG, Integer numCPF, double saldo, double tJuros) {
        super(numCliente, numRG, numCPF);
        this.saldo = saldo;
        this.tJuros = tJuros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double gettJuros() {
        return tJuros;
    }

    public void settJuros(double tJuros) {
        this.tJuros = tJuros;
    }

    public void depositarDinheiro(Double maisDinheiro)
    {
        this.saldo = this.saldo + maisDinheiro;
        System.out.println("+++++++++++++++++++++\nCliente: " + this.getNumCliente() + "\nDinheiro sacado: R$" + maisDinheiro
                + "\nSeu saldo é: " + this.saldo);
    }
    public void sacarDinheiro(Double menosDinheiro)
    {
        this.saldo = this.saldo - menosDinheiro;
        System.out.println("+++++++++++++++++++++++\nCliente: " + this.getNumCliente() + "\nDinheiro sacado: R$" + menosDinheiro
                + "\nSeu saldo é: " + this.saldo);
    }
    public void recolherJuros ()
    {
        this.saldo = this.saldo + this.tJuros  * this.saldo;
        System.out.println("+++++++++++++++++++++++\nCliente: " + this.getNumCliente() + "\nJuros recolhido: " + this.tJuros*100
              + "%"  + "\nSeu saldo é: " + this.saldo);
    }
}
