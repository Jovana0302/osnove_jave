package d10_01_2023;

public class ClanskaKarta {
    private int popust;
    private String brojKartice;

    public ClanskaKarta(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public int getPopust() {
        return popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
}
