import java.util.LinkedList;
import java.util.List;

public class Cage implements Element{
    private int size;
    private List<Element> els = new LinkedList<>();
    public Cage(int size){
        this.size = size;
    }
    @Override
    public List<Element> add(Element e){
        this.els.add(e);
        return this.els;
    }
    @Override
    public List<Element> remove(Element e){
        this.els.remove(e);
        return this.els;
    }
    @Override
    public Element get(int i){
        return this.els.get(i);
    }
}
