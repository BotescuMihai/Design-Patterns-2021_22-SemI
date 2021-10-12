import java.util.*;
public class TableOfContents implements Element{
    private List<String> contents;
	private List<Element> els = new LinkedList<>();
    public TableOfContents(ArrayList<String> contents) {
        this.contents = new ArrayList<String>();
        this.contents = contents;
    }
    public void printt(){
        int k = 1;
        System.out.println("contents:");
        for(String x : contents)
            System.out.println((k++) + "............" + x);
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
}
