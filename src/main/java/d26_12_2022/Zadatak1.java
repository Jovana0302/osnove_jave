package d26_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti

        stampajVrednostZa10Vecu(5);
        stampajVrednostZa10Vecu(10);
        stampajVrednostZa10Vecu(11);
    }
    public static void stampajVrednostZa10Vecu(int x) {
        System.out.println(x + " * 10 = " + (x * 10));
    }
}
