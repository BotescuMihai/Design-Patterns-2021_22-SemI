import java.util.LinkedList;
import java.util.List;

public class Canistra implements Element{

    private List<Element> els = new LinkedList<>();

    private static int ID = 0;
    public Canistra(){
        Canistra.ID ++;
    }
    public String toString(){
        String str= "Canistra no. " + ID + "; Contents: \n";
        for(Element e : this.els)
            str+=e.toString() + ";\n";
        return str.toString();
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
