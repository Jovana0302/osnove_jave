package d26_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//        Metoda nista ne vraca.

        stampajPodatke("0302992", "Jovana", "Cvetanovic", 1992, true);
    }
    public static void stampajPodatke(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}
