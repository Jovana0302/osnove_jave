package d29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
    Proizvod cokolada = new Proizvod();
    cokolada.naziv = "Milka";
    cokolada.cena = 399.99;
    cokolada.tezina = 300;

    cokolada.stampaj();

    cokolada.povecajCenu(50);
        System.out.println("Nova cena: " + cokolada.cena);

        System.out.println("Cena sa popustom: " + cokolada.vratiCenuSaPopustom(100));

        System.out.println("Postarina: " + cokolada.racunajPostarinu());

        System.out.println();

    Proizvod pica = new Proizvod();
        pica.naziv = "Capricciosa";
        pica.cena = 999.99;
        pica.tezina = 999.99;

        pica.stampaj();

        pica.povecajCenu(90);
        System.out.println("Nova cena: " + pica.cena);

        System.out.println("Cena sa popustom: " + pica.vratiCenuSaPopustom(50));

        System.out.println("Postarina: " + pica.racunajPostarinu());
    }
}
