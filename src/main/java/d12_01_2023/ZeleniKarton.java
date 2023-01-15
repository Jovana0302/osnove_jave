package d12_01_2023;

public class ZeleniKarton {
    private String student;
    private String brIndexa;
    private String predmet;
    private String profesor;
    private int ocena;

    public String getStudent() {
        return student;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public String getPredmet() {
        return predmet;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String predmet, String profesor, int ocena) {
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
        this.student = "Mali tester";
        this.brIndexa = "2369";
    }

    public ZeleniKarton(String student, String brIndexa, String predmet, String profesor, int ocena) {
        this.student = student;
        this.brIndexa = brIndexa;
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public boolean jePolozenIspit(){
        return this.ocena > 5;
    }

    public void stampaj(){
        System.out.println(this.predmet + " - " + this.ocena + "\n"
                + "Student: " + this.student + ", " + this.brIndexa + "\n"
                + "Profesor: " + this.profesor + "\n");
    }
}
