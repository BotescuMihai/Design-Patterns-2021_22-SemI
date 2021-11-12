import java.util.LinkedList;
import java.util.List;

public class Gaz implements Element{
    private double densitate;
    private List<Element> els = new LinkedList<>();
    public Gaz(double densitate){
        this.densitate = densitate;
    }
    public String toString(){
        return "Gaz - densitate in aer:" + this.densitate;
    }
    @Override
    public void add(Element e){
        this.els.add(e);
    }
    @Override
    public void remove(Element e){
        this.els.remove(e);
    }
    @Override
    public Element get(int i){
        return this.els.get(i);
    }
}
