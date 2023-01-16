package vezbanjeOOP;

public class Zadatak3 {
    public static void main(String[] args) {

        History h = new History();
        h.otvoriStranicu(new HistoryPage("YouTube", "https://www.youtube.com/", 10, 1));
        h.otvoriStranicu(new HistoryPage("Google", "https://www.google.com/", 10, 35));
        h.otvoriStranicu(new HistoryPage("Facebook", "https://www.facebook.com/", 11,10));

        h.sacuvajKredencijale("YouTube", "Jovana", "sifra123");
        h.sacuvajKredencijale("Google", "Jovana", "sifra123");
        h.sacuvajKredencijale("Facebook", "Jovana", "sifra123");

        h.pogledajIstoriju();
        System.out.println();

        h.obrisiKolacice("https://www.google.com/");

        h.pogledajIstoriju();
        System.out.println();

        h.obrisiSveKolaciceZaSadnjihSatVremena(11,11);

        h.pogledajIstoriju();
        System.out.println();

        h.obrisiPremaLinku("https://www.google.com/");

        h.pogledajIstoriju();
        System.out.println();

        h.obrisiSveKolacice();

        h.pogledajIstoriju();
        System.out.println();

        h.obrisiIstoriju();
        System.out.println("Obrisana istorija");
        h.pogledajIstoriju();

    }
}
