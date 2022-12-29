package d27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}

//        konvertuj - metoda konvertuje tezinu u kilograme i tone.
//        Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
//        a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”

//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Milka";
        cokolada.cena = 399.99;
        cokolada.tezina = 300;

        cokolada.stampaj();
        System.out.println("Konvertovana tezina: " + cokolada.konvertuj("kg"));

        Proizvod pica = new Proizvod();
        pica.naziv = "Capricciosa";
        pica.cena = 999.99;
        pica.tezina = 999.99;

        pica.stampaj();
        System.out.println("Konvertovana tezina: " + pica.konvertuj("t"));

    }
}