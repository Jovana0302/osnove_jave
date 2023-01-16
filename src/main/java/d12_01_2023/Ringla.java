package d12_01_2023;

public class Ringla {
    private String tip;
    private int jacinaRingle;
    private double jacinaGrejaca;

    public Ringla(String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacinaRingle = 0;
    }

    public int getJacinaRingle() {
        return jacinaRingle;
    }

    private int maxBrPojacavanja(){
        if (this.tip.equals("obicna")) {
            return 3;
        } else if (this.tip.equals("ekspres")){
            return 12;
        } else {
            return 0;
        }
    }

    public void pojacajRinglu(){
        this.jacinaRingle ++;
        if(this.jacinaRingle > maxBrPojacavanja()){
            this.jacinaRingle = maxBrPojacavanja();
        }
    }

    public void iskljuciRinglu(){
        this.jacinaRingle = 0;
    }

    public boolean jeUkljucenaRingla(){
        return this.jacinaRingle > 0;
    }

    public double potrosnja(int brSati){
        return 100.0 / maxBrPojacavanja() * this.jacinaRingle * this.jacinaGrejaca * brSati;
    }

    public void stampajRinglu(){
        if (jeUkljucenaRingla()){
            System.out.println("Ringla je ukljucena");
        } else {
            System.out.println("Ringla je iskljucena");
        }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacinaRingle);
        System.out.println("Grejac: " + this.jacinaGrejaca + " kW");
    }

}
