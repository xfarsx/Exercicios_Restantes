package Revisao_Exc3;

public class Main {

    public static void main(String[] args) {

        Estoque produto = new Estoque("Corante",200,50);
        Estoque produto2 = new Estoque("Fragrancia",800,1000);
        Estoque produto1 = new Estoque("ácido cítrico",500,100);




        produto.darBaixa(50);
        produto.mostra();
        produto1.mudarQtdMinima(150);
        produto2.precisaRepor();
        produto2.repor(200);

    }

}
