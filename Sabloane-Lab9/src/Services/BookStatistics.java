package Services;
import models.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Element;

public class BookStatistics implements Visitor<Element> {
	private Map<String,Integer> statistics = new TreeMap<String,Integer>();
	public BookStatistics() {
		this.statistics = new TreeMap<String,Integer>();
	}
	@Override
	public Element visitBook(Book b) {
		// TODO Auto-generated method stub
	return null;
	}

	@Override
	public Element visitSection(Section s) {
		// TODO Auto-generated method stub
		Visitee v;
		
		for(Element e: s.get_elements()) {
			v = (Visitee) e;
			v.accept(this);
			if(!this.statistics.containsKey("sectiuni"))
				this.statistics.put("sectiuni", 1);
			else
				this.statistics.put("sectiuni", this.statistics.get("sectiuni")+1);
	}
		return s;
	}

	@Override
	public Element visitTableOfContents(TableOfContents toc) {
		// TODO Auto-generated method stub
		Visitee v;
		for(Element e: toc.get_elements()) {
			v = (Visitee) e;
			v.accept(this);
			if(!this.statistics.containsKey("cuprinsuri"))
				this.statistics.put("cuprinsuri", 1);
			else
				this.statistics.put("cuprinsuri", this.statistics.get("cuprinsuri")+1);
	
	}
		return toc;
	}

	@Override
	public Element visitParagraph(Paragraph p) {
		// TODO Auto-generated method stub
		Visitee v;
		for(Element e: p.get_elements()) {
			v = (Visitee) e;
			System.out.println("Paragraph visitee: " + v);
			v.accept(this);
			if(!this.statistics.containsKey("paragrafe"))
				this.statistics.put("paragrafe", 1);
			else
				this.statistics.put("paragrafe", this.statistics.get("paragrafe")+1);
	
	}
		return p;
	}

	@Override
	public Element visitImageProxy(ImageProxy ip) {
		// TODO Auto-generated method stub
		Visitee v;
		for(Element e: ip.get_elements()) {
			v = (Visitee) e;
			v.accept(this);
			if(!this.statistics.containsKey("imagini"))
				this.statistics.put("imagini", 1);
			else
				this.statistics.put("imagini", this.statistics.get("imagini")+1);
	
	
	}
		return ip;
	}

	@Override
	public Element visitImage(Image i) {
		// TODO Auto-generated method stub
		Visitee v;
		for(Element e: i.get_elements()) {
			v = (Visitee) e;
			v.accept(this);
			if(!this.statistics.containsKey("imagini"))
				this.statistics.put("imagini", 1);
			else
				this.statistics.put("imagini", this.statistics.get("imagini")+1);
			
	}
		return i;
	}

	@Override
	public Element visitTable(Table t) {
		// TODO Auto-generated method stub
		Visitee v;
		for(Element e: t.get_elements()) {
			v = (Visitee) e;
			v.accept(this);
			if(!this.statistics.containsKey("tabele"))
				this.statistics.put("tabele", 1);
			else
				this.statistics.put("tabele", this.statistics.get("tabele")+1);
	
	}
		return t;
	}

	public void printStatistics() {
		// TODO Auto-generated method stub
		System.out.println(this.statistics);
		for(String key: this.statistics.keySet())
			System.out.println(key + " ---> " + this.statistics.get(key));
	}
	
	
}
