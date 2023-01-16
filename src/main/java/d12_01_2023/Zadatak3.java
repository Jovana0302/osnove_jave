package d12_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Ringla r1 = new Ringla("obicna", 1.5);
        Ringla r2 = new Ringla("obicna", 1.5);
        Ringla r3 = new Ringla("obicna", 1.5);
        Ringla r4 = new Ringla("ekspres", 2);

        ElektricniSporet s = new ElektricniSporet("bosch", 10, 3, r1, r2, r3, r4);

        s.pojacaj(1);
        s.pojacaj(2);
        s.pojacaj(3);
        s.pojacaj(4);
        s.stampaj();
        System.out.println(String.format("Ukupna potrosnja: %.2f kW", s.ukupnaPotrosnja(2)));

    }
}
