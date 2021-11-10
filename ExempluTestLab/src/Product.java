import java.util.LinkedList;
import java.util.List;

public abstract class Product implements Element{
    private List<Element> els = new LinkedList<Element>();
    protected String brand;
    protected double pret;
    public abstract double getPret();
    @Override
    public void add(Element e) {
        this.els.add(e);
    }

    @Override
    public void remove(Element e) {
        this.els.remove(e);
    }

    @Override
    public Element get(int index) {
        return this.els.get(index);
    }
}
