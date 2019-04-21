package Revisao_Exc2;

import java.util.List;

public class Fatura {

    private int faturado;
    private String descricao;
    private int qtdCompradoItem;
    private double precoUnit;


    public Fatura() {
    }

    public Fatura(int faturado, String descricao, int qtdCompradoItem, double precoUnit) {
        this.faturado = faturado;
        this.descricao = descricao;
        this.qtdCompradoItem = qtdCompradoItem;
        this.precoUnit = precoUnit;
    }

    public int getFaturado() {
        return faturado;
    }

    public void setFaturado(int faturado) {
        this.faturado = faturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdCompradoItem() {
        return qtdCompradoItem;
    }

    public void setQtdCompradoItem(int qtdCompradoItem) {
        this.qtdCompradoItem = qtdCompradoItem;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
    public void mostrarFaturas(List<Fatura> faturas)
    {
        for (int i = 0;i<faturas.size();i++)
        {
            System.out.println("++++++++++++++++++++++\nFatura: " + faturas.get(i).faturado + "\nDescrição: "
            + faturas.get(i).descricao + "\nPreço Unitário: R$" + faturas.get(i).precoUnit  + "\nQuantidade: "
            + faturas.get(i).qtdCompradoItem);
            faturas.get(i).totalFatura();
        }
    }
    public void totalFatura()
    {
        double total;
        total = this.precoUnit * this.qtdCompradoItem;
        System.out.println("Total da fatura: R$" + total);
    }
}
