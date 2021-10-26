import java.util.LinkedList;
import java.util.List;

public class Table implements Element{
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
}