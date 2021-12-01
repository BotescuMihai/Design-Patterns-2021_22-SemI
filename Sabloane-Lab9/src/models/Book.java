package models;
import Services.Visitee;
import Services.Visitor;

import java.util.List;
import java.util.LinkedList;
public class Book implements Element, Visitee {
    private List<Element> els = new LinkedList<Element>();
	private String sectitle = "";
    private List<Author> authorList = new LinkedList<Author>();
    private List<Paragraph> phList = new LinkedList<Paragraph>();
    private List<Section> secList = new LinkedList<Section>();
    public Book(String sectitle) {
   //     super(sectitle);
    	this.sectitle = sectitle;
        authorList = new LinkedList<Author>();
    }
    public String getTitle(){
        return this.sectitle;
    }

    public List<Author> getAuthors(){
        return this.authorList;
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

    @Override
    public void add(Element e) {
        this.els.add(e);
    }

    @Override
    public void remove(Element e) {
        this.els.remove(e);
    }

    @Override
    public Element get(int i) {
        return this.els.get(i);
    }

    @Override
    public List<Element> get_elements() {
        return this.els;
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

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);

    }
}