package d17_01_2023;

public class AudioControl extends Control {

    private boolean pojacanZvuk;

    private VideoPlayer player;

    public AudioControl(){
        super();
    }

    public boolean isPojacanZvuk() {
        return pojacanZvuk;
    }

    public void setPojacanZvuk(boolean pojacanZvuk) {
        this.pojacanZvuk = pojacanZvuk;
    }

    public void pojacaj(){
        this.pojacanZvuk = true;
    }

    public void smanji(){
        this.pojacanZvuk = false;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        this.player = player;
        if (isPojacanZvuk()){
            this.player.setZvuk(this.player.getZvuk() + 1);
        } else {
            this.player.setZvuk(this.player.getZvuk() - 1);
        }
        if (this.player.getZvuk() + 1 > 100){
            this.player.setZvuk(100);
        }
        if (this.player.getZvuk() - 1 < 0){
            this.player.setZvuk(0);
        }
    }

}
