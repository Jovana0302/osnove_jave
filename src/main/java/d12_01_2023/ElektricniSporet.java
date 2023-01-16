package d12_01_2023;

public class ElektricniSporet {

    private String marka;
    private int garancija;
    private int maxUkljuceno;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int garancija, int maxUkljuceno, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxUkljuceno = maxUkljuceno;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxUkljuceno() {
        return maxUkljuceno;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    public void pojacaj(int pozicija){
        if (pozicija == 1){
            this.goreLevo.pojacajRinglu();
        } else if (pozicija == 2) {
            this.goreDesno.pojacajRinglu();
        } else if (pozicija == 3){
            this.doleLevo.pojacajRinglu();
        } else if (pozicija == 4){
            this.doleDesno.pojacajRinglu();
        }
        int brojacUkljucenih = 0;
            if (this.goreLevo.jeUkljucenaRingla()) {
                brojacUkljucenih++;
            }
            if (this.goreDesno.jeUkljucenaRingla()) {
                brojacUkljucenih++;
            }
            if (this.doleLevo.jeUkljucenaRingla()) {
                brojacUkljucenih++;
            }
            if (this.doleDesno.jeUkljucenaRingla()) {
                brojacUkljucenih++;
            }

            if (brojacUkljucenih > this.maxUkljuceno){
                if (pozicija != 1){
                    this.goreLevo.iskljuciRinglu();
                }
                if (pozicija != 2){
                    this.goreDesno.iskljuciRinglu();
                }
                if (pozicija != 3){
                    this.doleLevo.iskljuciRinglu();
                }
                if (pozicija != 4){
                    this.doleDesno.iskljuciRinglu();
                }
            }
        }

    public void iskljuciRinglu(int pozicija){
        if (pozicija == 1){
            this.goreLevo.iskljuciRinglu();
        } else if (pozicija == 2) {
            this.goreDesno.iskljuciRinglu();
        } else if (pozicija == 3){
            this.doleLevo.iskljuciRinglu();
        } else if (pozicija == 4){
            this.doleDesno.iskljuciRinglu();
        }
    }

    public double ukupnaPotrosnja(int brSati){
        return this.goreLevo.potrosnja(brSati) + this.goreDesno.potrosnja(brSati)
                + this.doleLevo.potrosnja(brSati) + this.doleDesno.potrosnja(brSati);
    }

    public void stampaj(){
        System.out.println("Ringle:");
        System.out.println("Gore levo: ");
        this.goreLevo.stampajRinglu();
        System.out.println("Gore desno: ");
        this.goreDesno.stampajRinglu();
        System.out.println("Dole levo: ");
        this.doleLevo.stampajRinglu();
        System.out.println("Dole desno: ");
        this.doleDesno.stampajRinglu();
    }
}
