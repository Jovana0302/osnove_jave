package d19_01_2023;

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;

    private String okrug;

    private int maxUspon;

    public RekreativniPlaninar(String id, String imeIPrezime, int tezinaOpreme, String okrug, int maxUspon) {
        super(id, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + this.getId());
        System.out.println("Ime: " + this.getImeIPrezime());
        System.out.println("Okrug: " + this.okrug);
    }

    @Override
    public int clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        int uspon = this.maxUspon - (this.tezinaOpreme * 50);
        if (uspon >= planina.getVisina()){
            return true;
        }
        return false;
    }

}
