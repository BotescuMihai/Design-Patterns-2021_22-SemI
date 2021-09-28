import java.util.List;
import java.util.ArrayList;

public class Book {
    private String title;
    private List<String> images;
    private List<String> paraghraps;
    private List<String> tables;

    public Book(String title){
        this.title = title;
        this.images = new ArrayList<String>();
        this.paraghraps = new ArrayList<String>();
        this.tables = new ArrayList<String>();
    }
    public void createNewImage(String image){
        this.images.add(image);
    }
    public void createNewTable(String table){
        this.tables.add(table);
    }
    public void createNewParagraph(String paragraph){
        this.paraghraps.add(paragraph);
    }

    public void print(){
        System.out.println("List of Images:");
        int k = 1;
        for(String x : this.images)
            System.out.printf("Image %d - %s\n",k++,x);
        k = 1;
        System.out.println("List of Tables:");
        for(String x : this.tables)
            System.out.printf("Table %d - %s\n",k++,x);
        k = 1;
        System.out.println("List of Paragraphs:");
        for(String x : this.paraghraps)
            System.out.printf("Paragraph %d - %s\n",k++,x);

    }
    }

