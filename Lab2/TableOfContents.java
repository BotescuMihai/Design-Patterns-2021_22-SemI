import java.util.*;
public class TableOfContents {
    private List<String> contents;

    public TableOfContents(ArrayList<String> contents) {
        this.contents = new ArrayList<String>();
        this.contents = contents;
    }
    public void print(){
        int k = 1;
        System.out.println("contents:");
        for(String x : contents)
            System.out.println((k++) + "............" + x);
    }
}
