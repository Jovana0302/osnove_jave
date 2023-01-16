package vezbanjeOOP;

import java.util.ArrayList;

public class TableRow {
    private ArrayList<String> rowCells;
    public TableRow(){
        this.rowCells = new ArrayList<>();
    }

    public void addRowCell(String cell){
        this.rowCells.add(cell);
    }

    public void printRow(){
        for (int i = 0; i < this.rowCells.size(); i++) {
            System.out.print(this.rowCells.get(i) + "\t" + "\t" + "|" + "\t" + "\t");
        }
        System.out.println();
    }

    public void printRowHTML(){
        System.out.print("<tr>");
        for (int i = 0; i < this.rowCells.size(); i++) {
            System.out.print("<td>" + this.rowCells.get(i) + "</td>");
        }
        System.out.println("</tr>");
    }

    public boolean isThere(String text){
        for (int i = 0; i < this.rowCells.size(); i++) {
            if (this.rowCells.get(i).contains(text)){
                return true;
            }
        }
        return false;
    }

}
