package d29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj(){
        System.out.println("{{" + this.naziv + "}}" + ", " + "{{" + this.cena + "}}" + ", "
                + "{{" + this.tezina + "}}");
    }

    public void povecajCenu(double povecanje){
        this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust){
        double cenaSaPopustom = this.cena - popust;
        return cenaSaPopustom;
    }

    public int racunajPostarinu(){
        int postarina;
        if (this.tezina <= 100) {
            postarina = 200;
        } else if (this.tezina <= 500) {
            postarina =  400;
        } else {
            postarina =  1000;
        }
        return postarina;
    }
}
