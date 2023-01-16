package vezbanjeOOP;

import java.util.ArrayList;

public class Table {
    private TableHeader header;
    private ArrayList<TableRow> rows;
    private int rowsPerPage;

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public Table(){
        this.rows = new ArrayList<>();
    }

    public void addRow(TableRow row){
        this.rows.add(row);
    }

    public void printTable(){
        this.header.printHeader();
        for (int i = 0; i < this.rows.size(); i++) {
            this.rows.get(i).printRow();
        }
    }

    public void printTableHTML(){
        System.out.println("<table>");
        System.out.println("<thead>");
        this.header.printHeaderHTML();
        System.out.println("</thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < this.rows.size(); i++) {
            this.rows.get(i).printRowHTML();
        }
        System.out.println("</tbody>");
        System.out.println("</table>");
    }

    public void filter(String text){
        this.header.printHeader();
        for (int i = 0; i < this.rows.size(); i++) {
            if (this.rows.get(i).isThere(text)){
                this.rows.get(i).printRow();
            }
        }
    }

    public void printPaginator(){
        int paginator = this.rows.size() / this.rowsPerPage + this.rows.size() % this.rowsPerPage;
        for (int i = 1; i <= paginator; i++) {
            System.out.print("| " + i + " ");
        }
    }

    public void printWithPaginator(int pageNo, int rowsPerPage){
        this.rowsPerPage = rowsPerPage;
        int start = (pageNo - 1) * this.rowsPerPage;
        int end = pageNo * this.rowsPerPage;

        this.header.printHeader();

        if (end > this.rows.size() && end < (this.rows.size() + this.rowsPerPage)) {
            end = this.rows.size();
        } else if (end > this.rows.size() && end >= (this.rows.size() + this.rowsPerPage)) {
            System.out.println("No results for page " + pageNo);
        }

        if (end <= this.rows.size()){
        for (int i = start; i < end; i++) {
            this.rows.get(i).printRow();
        }}
        System.out.println("Broj redova po strani [" + this.rowsPerPage + "]");
        printPaginator();
    }

}
