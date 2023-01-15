package d13_01_2023;

public class Ispit {

    private String predmet;
    private int ocena;
    private String profesor;

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Ispit(String predmet, int ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public Ispit(String predmet, int ocena) {
        this.predmet = predmet;
        this.ocena = ocena;
    }

    public Ispit(){}

    public boolean jePolozenIspit(){
        return this.ocena > 5;
    }

    public void stampajIspit(){
        System.out.println(this.predmet + " - " + this.profesor + " - " + this.ocena);
    }

}