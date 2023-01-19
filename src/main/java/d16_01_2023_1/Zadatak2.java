package d16_01_2023_1;

public class Zadatak2 {
    public static void main(String[] args) {

        Igrac igrac = new Igrac("Pera Peric", "12109987645", 1998, 5, "odbrambeni", false);
        igrac.dodajKarton("zuti");
        igrac.dodajKarton("zuti");
        igrac.dodajKarton("crveni");

        igrac.stampaj();
    }
}
