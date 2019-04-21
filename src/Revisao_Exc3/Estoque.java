package Revisao_Exc3;

public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void mudarNome (String nome)
    {
        this.nome = nome;
    }
    public void mudarQtdMinima (int qtdMinima)
    {
        this.qtdMinima = qtdMinima;
        System.out.println("+++++++++++++++++++++++\nProduto: " + this.getNome() +
                "\nQuantidade mínima atualizada: " + this.qtdMinima);
    }
    public void repor (int qtd)
    {
        this.qtdAtual = this.qtdAtual + qtd;
        System.out.println("+++++++++++++++++++++++\nProduto: " + this.getNome() + "\nRepor: " +
                qtd + "\nQuantidade atualizada: " + this.qtdAtual);
    }
    public void darBaixa (int qtd)
    {

        this.qtdAtual = this.qtdAtual - qtd;
        System.out.println("+++++++++++++++++++++++\nProduto: " + this.getNome() + "\nBaixa: " +
        qtd + "\nQuantidade atualizada: " + this.qtdAtual);
    }
    public void mostra()
    {
        System.out.println("+++++++++++++++++++++++\n" + this.nome + "\n+++++++++++++++++++++++" );
    }
    public void precisaRepor()
    {
        int x = 1;
        if (this.qtdAtual < qtdMinima) {
            x = this.qtdMinima - this.qtdAtual;
            System.out.println("+++++++++++++++++++++++\nProduto: " + this.getNome() + "\nQuantidade Mínima: " +
                    this.qtdMinima + "\nQuantidade atual: " + this.qtdAtual + "\nRepor: " + x);
        }
        else
        {
            System.out.println("++++++++++++++++++++++++\nQuantidade OK!");
        }
    }
}
