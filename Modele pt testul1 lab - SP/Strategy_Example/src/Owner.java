import java.util.LinkedList;
import java.util.List;

public class Owner implements Element{
    private static Owner o = new Owner();
    private List<Element> els = new LinkedList<>();
    private String name;
    public static Owner get_owner(){
        return o;
    }
    public Owner name(String name){
        this.name = name;
        return this;
    }
    private Owner(){
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
