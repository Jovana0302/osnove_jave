package miniProjekatXO;

import java.util.ArrayList;

public class XOTabla {
    private ArrayList <String> tabla = new ArrayList<String>();
    private String igracX;
    private String igracO;
    private String naPotezu;

    public String getIgracX(){
        return this.igracX;
    }

    public String getIgracO(){
        return this.igracO;
    }

    public String getNaPotezu(){
        return this.naPotezu;
    }

    public void setIgracX(String igracX){
        this.igracX = igracX;
    }

    public void setIgracO(String igracO){
        this.igracO = igracO;
    }

    public void pokreniIgru(){
        for (int i = 0; i < 9; i++) {
            tabla.add(" ");
        }
        this.naPotezu = "X";
    }

    public void stampaj(){
        System.out.println(" " + tabla.get(0) + " | " + tabla.get(1) + " | " + tabla.get(2));
        System.out.println(" " + tabla.get(3) + " | " + tabla.get(4) + " | " + tabla.get(5));
        System.out.println(" " + tabla.get(6) + " | " + tabla.get(7) + " | " + tabla.get(8));
        System.out.println("Igrac X: " + this.igracX);
        System.out.println("Igrac O: " + this.igracO);
        }

    public boolean poljePrazno (int brojPolja) {
        return tabla.get(brojPolja - 1).equals(" ");
    }

    public void zameniIgraca(){
        if (this.naPotezu.equals("X")){
            this.naPotezu = "O";
        } else if (this.naPotezu.equals("O")){
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int brojPolja) {
        if (poljePrazno(brojPolja) && this.naPotezu.equals("X")) {
            tabla.set(brojPolja - 1, "X");
        } else if (poljePrazno(brojPolja) && this.naPotezu.equals("O")) {
            tabla.set(brojPolja - 1, "O");
        }
    }


    public boolean popunjenaTabla(){
        if (!tabla.get(0).equals(" ") && !tabla.get(1).equals(" ") && !tabla.get(2).equals(" ")
        && !tabla.get(3).equals(" ") && !tabla.get(4).equals(" ") && !tabla.get(5).equals(" ")
        && !tabla.get(6).equals(" ") && !tabla.get(7).equals(" ") && !tabla.get(8).equals(" ")){
                return true;
            }
        return false;
        }

    public boolean pobednikX(){
        if (tabla.get(0).equals("X") && tabla.get(1).equals("X") && tabla.get(2).equals("X")){
            return true;
        } else if (tabla.get(3).equals("X") && tabla.get(4).equals("X") && tabla.get(5).equals("X")){
            return true;
        } else if (tabla.get(6).equals("X") && tabla.get(7).equals("X") && tabla.get(8).equals("X")){
            return true;
        } else if (tabla.get(0).equals("X") && tabla.get(3).equals("X") && tabla.get(6).equals("X")){
            return true;
        } else if (tabla.get(1).equals("X") && tabla.get(4).equals("X") && tabla.get(7).equals("X")){
            return true;
        } else if (tabla.get(2).equals("X") && tabla.get(5).equals("X") && tabla.get(8).equals("X")){
            return true;
        } else if (tabla.get(0).equals("X") && tabla.get(4).equals("X") && tabla.get(8).equals("X")){
            return true;
        } else if (tabla.get(2).equals("X") && tabla.get(4).equals("X") && tabla.get(6).equals("X")){
            return true;
        }
    return false;
    }

    public boolean pobednikO(){
        if (tabla.get(0).equals("O") && tabla.get(1).equals("O") && tabla.get(2).equals("O")){
            return true;
        } else if (tabla.get(3).equals("O") && tabla.get(4).equals("O") && tabla.get(5).equals("O")){
            return true;
        } else if (tabla.get(6).equals("O") && tabla.get(7).equals("O") && tabla.get(8).equals("O")){
            return true;
        } else if (tabla.get(0).equals("O") && tabla.get(3).equals("O") && tabla.get(6).equals("O")){
            return true;
        } else if (tabla.get(1).equals("O") && tabla.get(4).equals("O") && tabla.get(7).equals("O")){
            return true;
        } else if (tabla.get(2).equals("O") && tabla.get(5).equals("O") && tabla.get(8).equals("O")){
            return true;
        } else if (tabla.get(0).equals("O") && tabla.get(4).equals("O") && tabla.get(8).equals("O")){
            return true;
        } else if (tabla.get(2).equals("O") && tabla.get(4).equals("O") && tabla.get(6).equals("O")){
            return true;
        }
        return false;
    }

}
