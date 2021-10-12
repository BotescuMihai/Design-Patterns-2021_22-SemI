import java.util.List;
import java.util.LinkedList;
public class Book {
	private String sectitle = "";
    private List<Author> authorList = new LinkedList<Author>();
    private List<Paragraph> phList = new LinkedList<Paragraph>();
    private List<Section> secList = new LinkedList<Section>();
    public Book(String sectitle) {
   //     super(sectitle);
    	this.sectitle = sectitle;
        authorList = new LinkedList<Author>();
    }

    public void print(){
        System.out.println("The book " + sectitle);
        for(Author a : authorList)
            a.print();
        for(Section s : secList)
        	s.print();
        for(Paragraph ph : phList)
        	ph.print();
  
        
    }

    public void addAuthor(Author rpGheo) {
        authorList.add(rpGheo);
    }

	public void addContent(Paragraph paragraph) {
		// TODO Auto-generated method stub
		phList.add(paragraph);
	}

	public void addContent(Section cap1) {
		// TODO Auto-generated method stub
		secList.add(cap1);
	}

}
