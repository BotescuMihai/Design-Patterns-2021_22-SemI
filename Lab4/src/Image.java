import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String url;
    private static int imgno = 0;
    private PictureContent pc;
	private List<Element> els = new LinkedList<>();
	public PictureContent getPictureContent() {
		return this.pc;
	}
    public Image(String url, PictureContent pc) {
    	try {
    		TimeUnit.SECONDS.sleep(5);
    		} catch (InterruptedException e) {
    		e.printStackTrace();
    		}
        this.url = url;
        this.pc = pc;
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