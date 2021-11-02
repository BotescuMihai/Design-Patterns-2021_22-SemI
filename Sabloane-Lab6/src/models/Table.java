package models;
import java.util.LinkedList;
import java.util.List;

import Services.Visitee;
import Services.Visitor;

public class Table implements Element, Visitee{
    private String title;
    private static int no_table = 0;
	private List<Element> els = new LinkedList<>();

    public Table(String title) {
        this.title = title;
        no_table ++;
    }

    public void printt(){
        System.out.println("Table " + no_table + "......................." + title);
    }
    
    @Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		this.els.add(e);
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		this.els.remove(this.els.indexOf(e));
	}

	@Override
	public Element get(int i) {
		// TODO Auto-generated method stub
		return this.els.get(i);
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		for(Element e: this.els)
			System.out.println(e);
	}
	
	@Override
	public List<Element> get_elements() {
		return this.els;
	}
	
	public String toString() {
		return "Table - " + this.title + "; Elements: " + this.els.toString();
	}
}