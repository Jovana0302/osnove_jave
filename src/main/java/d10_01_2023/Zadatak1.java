package d10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Autor pisac1 = new Autor("Milan", "Kundera");
        Knjiga knjiga1 = new Knjiga("9788661351624", "Nepodnošljiva lakoća postojanja",1984, pisac1);

        knjiga1.print();

        Autor pisac2 = new Autor("Momo", "Kapor");
        Knjiga knjiga2 = new Knjiga("9788652140176", "Una",1981, pisac2);

        knjiga2.print();

        Autor pisac3 = new Autor("Carls", "Bukovski");
        Knjiga knjiga3 = new Knjiga("9788683499656", "Zene",1978, pisac3);

        knjiga3.print();
    }
}
