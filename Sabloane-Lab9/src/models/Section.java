package models;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import Services.ImageProxy;
import Services.JSONVisitor.JSONVisitor;
import Services.Visitee;
import Services.Visitor;

public class Section implements Element, Visitee{
	protected String title;
	protected Visitor v;
	protected List<Element> els = new LinkedList<Element>();
	@Override
	public String toString() {
		return "Section [title=" + title + "]";
	}
	public String getTitle(){
		return this.title;
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
	public String getname() {
		return this.title;
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
		this.v = v;
		String fname = ((JSONVisitor) v).
				getJSONFile();
		StringBuilder sb = new StringBuilder();
		sb.append("[\n");
		sb.append(((JSONVisitor) v).
				visitSection(this));
		sb.append(",\n");
		for(Element el:this.els)
		{
			if(el instanceof Table)
				sb.append(v.
						visitTable((Table) el));
			else if(el instanceof Image)
				sb.append(v.
						visitImage((Image) el));
			else if(el instanceof Paragraph)
				sb.append(v.
						visitParagraph((Paragraph) el));
			else if(el instanceof ImageProxy)
				sb.append(v.
						visitImageProxy((ImageProxy) el));
			else if(el instanceof TableOfContents)
				sb.append(v.
						visitTableOfContents((TableOfContents) el));
			else if(el instanceof Book)
				sb.append(v.
						visitBook((Book) el));
			sb.append(",\n");
		}
		sb.append("]");
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter(fname))) {
			bfw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Element> get_elements() {
		return this.els;
	}
	
}