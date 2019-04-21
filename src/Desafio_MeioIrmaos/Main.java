package Desafio_MeioIrmaos;

public class Main {

    public static void main(String[] args) {

        Filho fernando = new Filho("Fernando", "Nadia", "Leno");
        Filho erick = new Filho("Erick", "Nadia", "Leno");
        Filho milena = new Filho("Milena", "Lena", "Aloisio");
        Filho diego = new Filho("Diego", "Lena", "Douglas");

        fernando.saoMeioIrmaos(erick);
        System.out.println("===============================");
        fernando.saoMeioIrmaos(milena);
        System.out.println("===============================");
        milena.saoMeioIrmaos(diego);

    }
}
