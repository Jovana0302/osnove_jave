package d10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        ClanskaKarta card = new ClanskaKarta("9329-0239");
        card.setPopust(10);

        Kupac buyer = new Kupac("Jovana Cvetanovic", card);

        Proizvod product = new Proizvod("Telefon", 30000, buyer);

        product.stampajProizvod();
    }
}
