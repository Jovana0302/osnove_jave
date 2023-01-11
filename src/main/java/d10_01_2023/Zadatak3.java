package d10_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Product jabuka = new Product("123-456", "Granny Smith", 200);
        Vaga v = new Vaga();
        v.setMernaJedinica("kg");
        v.setP(jabuka);

        v.stampajRacun(3);
    }
}
