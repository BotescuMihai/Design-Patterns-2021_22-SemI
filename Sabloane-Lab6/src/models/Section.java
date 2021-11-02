package models;
import java.util.LinkedList;
import java.util.List;

import Services.Visitee;
import Services.Visitor;

public class Section implements Element, Visitee{
	protected String title;
	protected List<Element> els = new LinkedList<Element>();
	@Override
	public String toString() {
		return "Section [title=" + title + "]";
	}

	public Section(String title) {
		super();
		this.title = title;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title);
		for(Element el : this.els)
			el.print();
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		try {
		if(els.contains(e))
			{throw new Exception("The following cannot be added, because it is already in the list: ");
			}}catch(Exception e1) {
				e1.printStackTrace();
				e.print();
				return;
			}
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
	
}