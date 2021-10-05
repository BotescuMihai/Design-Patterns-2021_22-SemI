public class Table {
    private String title;
    private static int no_table = 0;

    public Table(String title) {
        this.title = title;
        no_table ++;
    }

    public void print(){
        System.out.println("Table " + no_table + "......................." + title);
    }
}
