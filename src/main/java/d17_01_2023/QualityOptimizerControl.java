package d17_01_2023;

public class QualityOptimizerControl extends Control {

    private double brzinaInterneta;

    private VideoPlayer player;

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(){
        super();
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        super();
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        this.player = player;
//        144, 240, 360, 480, 720, 1080
        if (this.brzinaInterneta * 10.1 < 144){
            this.player.setKvalitet(144);
        } else if (this.brzinaInterneta * 10.1 < 240){
            this.player.setKvalitet(240);
        } else if (this.brzinaInterneta * 10.1 < 360){
            this.player.setKvalitet(360);
        } else if (this.brzinaInterneta * 10.1 < 480){
            this.player.setKvalitet(480);
        } else if (this.brzinaInterneta * 10.1 < 720){
            this.player.setKvalitet(720);
        } else if (this.brzinaInterneta * 10.1 < 1080){
            this.player.setKvalitet(1080);
        }

    }
}
