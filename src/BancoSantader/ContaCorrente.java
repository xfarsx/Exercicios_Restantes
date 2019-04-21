package BancoSantader;

public class ContaCorrente extends Clientes {

    private double saldo;
    private double chequeEspecial;

    public ContaCorrente() {
    }

    public ContaCorrente(Integer numCliente, Integer numRG, Integer numCPF, double saldo, double chequeEspecial) {
        super(numCliente, numRG, numCPF);
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void depositarDinheiro(Double maisDinheiro)
    {
        this.saldo = this.saldo + maisDinheiro;
        System.out.println("+++++++++++++++++++++\nCliente: " + this.getNumCliente() + "\nDinheiro depositado: R$" + maisDinheiro
                + "\nSeu saldo é: " + this.saldo);
    }
    public void sacarDinheiro(Double menosDinheiro)
    {
        this.saldo = this.saldo - menosDinheiro;
        System.out.println("+++++++++++++++++++++\nCliente: " + this.getNumCliente() + "\nDinheiro sacado: R$" + menosDinheiro
                + "\nSeu saldo é: " + this.saldo);
    }
    public void depositarCheque (Double chequeEspecial)
    {
        this.saldo = chequeEspecial + this.saldo;
        System.out.println("+++++++++++++++++++++\nCliente: " + this.getNumCliente() + "\nCheque Especial depositado: R$" + chequeEspecial
                + "\nSeu saldo é: " + this.saldo);
    }
}
