package d19_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        PlaninarskiDom nis = new PlaninarskiDom("Nis", 1992);

        nis.uclaniPlaninara(new RekreativniPlaninar("#23", "Jovana Cvetanovic", 3, "Nis", 2000));
        nis.uclaniPlaninara(new RekreativniPlaninar("#44", "Pera Peric", 5, "Pirot", 1800));
        nis.uclaniPlaninara(new RekreativniPlaninar("#98", "Marko Markovic", 4, "Krusevac", 2500));
        nis.uclaniPlaninara(new Alpinista("#55", "Nikola Nikolic", 10));
        nis.uclaniPlaninara(new Alpinista("#66", "Marija Markovic", 5));
        nis.uclaniPlaninara(new Alpinista("#77", "Mita Mitic", 15));

        nis.izbaciPlaninara("#98");

        nis.stampaj();

        System.out.println("Uspesno stigli do vrha: " + nis.uspesni(new Planina("Stara planina", "Srbija", 2376)));
        System.out.println("Mesecni prihod planinarskog doma: " + nis.mesecniPrihod());

    }
}
