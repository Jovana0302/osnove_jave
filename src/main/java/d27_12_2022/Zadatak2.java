package d27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:

//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string

//        metodu za stampu (proizvoljno)

//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.temperatura = 23;
        klima1.mode = "hladi";

        klima1.stampaj();
        if (klima1.jeVecaTNapolju(30)) {
            System.out.println("Napolju je veca temperatura.");
        } else {
            System.out.println("Napolju je manja temperatura.");
        }
        System.out.println();

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Galanz";
        klima2.temperatura = 30;
        klima2.mode = "greje";

        klima2.stampaj();
        if (klima2.jeVecaTNapolju(15)) {
            System.out.println("Napolju je veca temperatura.");
        } else {
            System.out.println("Napolju je manja temperatura.");
        }
    }
}