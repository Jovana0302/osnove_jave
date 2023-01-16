package vezbanjeOOP;

import java.util.ArrayList;

public class TableHeader {
    private ArrayList<String> headerCells;

    public TableHeader(){
        this.headerCells = new ArrayList<>();
    }

    public void addHeaderCell(String cell){
        this.headerCells.add(cell);
    }

    public void printHeader(){
        for (int i = 0; i < this.headerCells.size(); i++) {
            System.out.print(this.headerCells.get(i) + "\t" + "\t" + "|" + "\t" + "\t");
        }
        System.out.println();
    }

    public void printHeaderHTML(){
        System.out.print("<tr>");
        for (int i = 0; i < this.headerCells.size(); i++) {
            System.out.print("<th>" + this.headerCells.get(i) + "</th>");
        }
        System.out.println("</tr>");
    }
}
