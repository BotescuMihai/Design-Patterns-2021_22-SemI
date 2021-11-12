import java.util.LinkedList;
import java.util.List;

public class Ulei implements Element{
    private String tip;
    private List<Element> els = new LinkedList<>();
    public Ulei(String tip){
        this.tip = tip;
    }
    public String toString(){
        return "Ulei - tip:" + this.tip;
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
