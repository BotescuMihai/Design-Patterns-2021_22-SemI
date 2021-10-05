import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class SubChapter {
    private String name;
    private static int subchapter_no = 0;
    private List<Image> img = new LinkedList<Image>();
    private List<Paragraph> ph = new LinkedList<Paragraph>();
    private List<Table> table = new LinkedList<Table>();
    public SubChapter(String name,List<Image> img, List<Paragraph> ph, List<Table> table) {
        this.name = name;
        this.img = img;
        this.ph = ph;
        this.table = table;
        subchapter_no ++;
    }
    public SubChapter(String name) {this.name = name;   
    subchapter_no ++;
}
    public void print(){
        System.out.println("SubChapter " + subchapter_no + "....................." + name);
        for(Image img: img)
        	img.print();
        for(Paragraph ph: ph)
        	ph.print();
        for(Table table: table)
        	table.print();
    }
	public void createNewParagraph(String string) {
		// TODO Auto-generated method stub
		Paragraph pp = new Paragraph(string);
		ph.add(pp);
	}
	public void createNewImage(String string) {
		// TODO Auto-generated method stub
		img.add(new Image(string));
		
	}
	public void createNewTable(String string) {
		// TODO Auto-generated method stub
		table.add(new Table(string));
	}
}
