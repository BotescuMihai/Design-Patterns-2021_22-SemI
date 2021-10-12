import java.util.LinkedList;
import java.util.List;

public class Section implements Element{
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

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Sectiunea " + title);
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
	
}
