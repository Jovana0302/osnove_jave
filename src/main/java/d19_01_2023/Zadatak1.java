package d19_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(new Tetrapak("232-2823", "Jogurt", 1000, 1050, true, 150));
        korpa.dodajAmbalazu(new Tetrapak("877-9867", "Mleko", 500, 550, false, 200));
        korpa.dodajAmbalazu(new Tetrapak("544-2342", "Sok", 1500, 1550, true, 200));
        korpa.dodajAmbalazu(new StaklenaAmbalaza("766-3421", "Pivo", 500, 550, 10, true, 100));
        korpa.dodajAmbalazu(new StaklenaAmbalaza("965-8765", "Vino", 750, 800, 50, false, 500));

        System.out.println("U KORPI: ");
        korpa.stampaj();

        System.out.println("CENA KORPE SA POPUSTOM: " + korpa.cenaKorpe(new SuperKartica(2345, "Jovana Cvetanovic", 100)));

    }
}
