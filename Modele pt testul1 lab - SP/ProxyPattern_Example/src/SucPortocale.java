import java.util.LinkedList;
import java.util.List;

public class SucPortocale implements Element{
    private double concentratie;
    private List<Element> els = new LinkedList<>();
    public SucPortocale(double concentratie){
        this.concentratie = concentratie;
    }
    public String toString(){
        return "Suc de portocale - concentratie: " + this.concentratie + "%";
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
