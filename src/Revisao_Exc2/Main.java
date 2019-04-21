package Revisao_Exc2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fatura fatura = new Fatura(1220,"Corante",4000,30.0);
        Fatura fatura1 = new Fatura(1221,"EDTA",300,60.0);
        Fatura fatura2 = new Fatura(1222,"BHT",50,150.0);
        List<Fatura> listaDeFaturas = new ArrayList<>();
        listaDeFaturas.add(fatura);
        listaDeFaturas.add(fatura1);
        listaDeFaturas.add(fatura2);

        fatura.mostrarFaturas(listaDeFaturas);


    }

}
