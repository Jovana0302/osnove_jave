package vezbanjeOOP;

public class Zadatak5 {
    public static void main(String[] args) {

        TableHeader header = new TableHeader();
        header.addHeaderCell("First Name");
        header.addHeaderCell("Last Name");
        header.addHeaderCell("Age");

        Table table = new Table();
        table.setHeader(header);

        TableRow r1 = new TableRow();
        r1.addRowCell("Milan");
        r1.addRowCell("Jovanovic");
        r1.addRowCell("27");
        TableRow r2 = new TableRow();
        r2.addRowCell("Marko");
        r2.addRowCell("Markovic");
        r2.addRowCell("30");
        TableRow r3 = new TableRow();
        r3.addRowCell("Darko");
        r3.addRowCell("Darkovic");
        r3.addRowCell("60");

        table.addRow(r1);
        table.addRow(r2);
        table.addRow(r3);

        table.printTable();
        System.out.println();
        table.printTableHTML();
        System.out.println();

        table.filter("Milan");
        System.out.println();

        table.printWithPaginator(2,2);

    }
}
