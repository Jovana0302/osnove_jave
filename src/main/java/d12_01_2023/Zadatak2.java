package d12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

    Racun posiljalac = new Racun("170-289328923-23", "Jovana Cvetanovic", 200000);
    Racun primalac = new Racun("180-389395967-47", "Jana Cvetanovic", 100000);

    posiljalac.stampajRacun();
    primalac.stampajRacun();

    Transakcija prenos = new Transakcija("#12345jj", posiljalac, primalac);

    prenos.izvrsiTransakciju(50000);

    prenos.stampajTransakciju();

    System.out.println("Posle transakcije");

    posiljalac.stampajRacun();
    primalac.stampajRacun();

    }
}
