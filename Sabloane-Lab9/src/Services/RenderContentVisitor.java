package Services;
import models.*;
public class RenderContentVisitor implements Visitor<Element>{

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
	}
		return toc;
	}

	@Override
	public Element visitParagraph(Paragraph p) {
		// TODO Auto-generated method stub
		Visitee v;
		for(Element e: p.get_elements()) {
			v = (Visitee) e;
			v.accept(this);
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
	}
		return t;
	}
	
	
		
}
