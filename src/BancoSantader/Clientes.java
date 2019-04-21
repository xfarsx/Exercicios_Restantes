package BancoSantader;

public class Clientes {
    private Integer numCliente;
    private Integer numRG;
    private Integer numCPF;

    public Clientes() {
    }

    public Clientes(Integer numCliente, Integer numRG, Integer numCPF) {
        this.numCliente = numCliente;
        this.numRG = numRG;
        this.numCPF = numCPF;
    }

    public Integer getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(Integer numCliente) {
        this.numCliente = numCliente;
    }

    public Integer getNumRG() {
        return numRG;
    }

    public void setNumRG(Integer numRG) {
        this.numRG = numRG;
    }

    public Integer getNumCPF() {
        return numCPF;
    }

    public void setNumCPF(Integer numCPF) {
        this.numCPF = numCPF;
    }
}
