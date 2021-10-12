import java.util.LinkedList;
import java.util.List;

public class Paragraph implements Element{
    private String text;
    private static int paragraph_no = 0;
	private List<Element> els = new LinkedList<>();
    public Paragraph(String text) {
        this.text = text;
      //  paragraph_no ++;
    }

    public void printt(){
        paragraph_no ++;
        System.out.println("Paragraph " + paragraph_no + "........................" + text);
    }
    @Override
	public void print() {
		// TODO Auto-generated method stub
		printt();
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
}
