package d13_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

    Listic l = new Listic();
    l.dodajKombinaciju(new Kombinacija("#1", 1, 3, 5, 18, 22, 28, 33));
    l.dodajKombinaciju(new Kombinacija("#2", 7,8,15, 21, 23, 30, 38));
    l.dodajKombinaciju(new Kombinacija("#3", 2,3,11, 19, 22, 27, 32));

    l.stampajListic();

    Kombinacija dobitna = new Kombinacija("#4", 2, 3, 11, 19, 22, 27, 32);
    if (l.dobitna(dobitna)){
        System.out.println("Cestitamo! Imate dobitnu kombinaciju.");
        System.out.println("Dobitna kombinacija je: ");
        dobitna.stampaj();
    } else {
        System.out.println("Nemate dobitnu kombinaciju. Vise srece drugi put!");
        System.out.println("Dobitna kombinacija je: ");
        dobitna.stampaj();
    }
}
}