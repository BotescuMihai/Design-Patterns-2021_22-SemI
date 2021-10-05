import java.util.List;
import java.util.LinkedList;
public class Book {
    private String title;
    private TableOfContents toc;
    private List<Chapter> chapterList = new LinkedList<Chapter>();
    private List<Author> authorList = new LinkedList<Author>();
    public Book(String title) {
    	this.title = title;
    }
    public Book(String title, TableOfContents toc, List<Chapter> chapter) {
        this.title = title;
        this.toc = toc;
        this.chapterList = chapter;
        authorList = new LinkedList<Author>();
    }

    public void print(){
        System.out.println("The book " + title);
        toc.print();
        for(Chapter ch : chapterList)
        	ch.print();
        for(Author a : authorList)
            a.print();
    }

    public void addAuthor(Author rpGheo) {
        authorList.add(rpGheo);
    }
	public int createChapter(String string) {
		// TODO Auto-generated method stub
		chapterList.add(new Chapter(string));
		return chapterList.size()-1;
	}
	public Chapter getChapter(int indexChapterOne) {
		// TODO Auto-generated method stub
		return chapterList.get(indexChapterOne);
	}
}
