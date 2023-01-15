package d13_01_2023;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    private ArrayList<Integer> kombinacija;

    public Kombinacija(String id, int a, int b, int c, int d, int e, int f, int g) {
        this.kombinacija = new ArrayList<>();
        this.id = id;
        this.kombinacija.add(a);
        this.kombinacija.add(b);
        this.kombinacija.add(c);
        this.kombinacija.add(d);
        this.kombinacija.add(e);
        this.kombinacija.add(f);
        this.kombinacija.add(g);
    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getKombinacija() {
        return kombinacija;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        for (int i = 0; i < this.kombinacija.size(); i++) {
        if (this.kombinacija.get(i) == k.kombinacija.get(i)) {
            return true;
        }
    }
        return false;
    }

    public void stampaj(){
        System.out.println("ID: " + this.id);
        System.out.print("brojevi: ");
        for (int i = 0; i < this.kombinacija.size(); i++) {
            System.out.print(this.kombinacija.get(i) + ", ");
        }
        System.out.println();
    }
}