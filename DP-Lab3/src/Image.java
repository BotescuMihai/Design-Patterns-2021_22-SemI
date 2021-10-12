import java.util.LinkedList;
import java.util.List;

public class Image implements Element{
    private String url;
    private static int imgno = 0;
	private List<Element> els = new LinkedList<>();
    public Image(String url) {
        this.url = url;
        imgno ++;
    }

    public void printt(){
        System.out.println("Image " + imgno + "..............." + url);
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
