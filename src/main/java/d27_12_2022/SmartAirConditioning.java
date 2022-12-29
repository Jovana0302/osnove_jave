package d27_12_2022;

public class SmartAirConditioning {
    //     Kreirati klasu SmartAirConditioning koja ima:

//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string

//        metodu za stampu (proizvoljno)

//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.
    public String marka;
    public double temperatura;
    public String mode;

    public void stampaj() {
        System.out.println(this.marka + " klima uredjaj" + "\n" + "Izabrana temperatura: "
                + this.temperatura + "\n" + "Mode: " + this.mode);
    }
    public boolean jeVecaTNapolju (int t) {
        return t > this.temperatura;
    }
}