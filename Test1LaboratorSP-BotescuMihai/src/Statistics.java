//import com.sun.source.tree.Tree;
import java.util.*;
public class Statistics implements Visitor{
    private Map<String, Integer> stats = new TreeMap<String,Integer>();
    @Override
    public void visitFirma(Firma f){
        Visitee v;
        for(Element e: f.getels()) {
            v = (Visitee) e;
            v.accept(this);
        }
        if(!this.stats.containsKey("Firme:"))
            this.stats.put("Firme:", 1);
        else this.stats.put("Firme:", this.stats.get("Firme:") + 1);
    }

    @Override
    public void visitDirector(Director d){
        Visitee v;
        for(Element e: d.getels()) {
            v = (Visitee) e;
            v.accept(this);
        }
        if(!this.stats.containsKey("Directori:"))
            this.stats.put("Directori:", 1);
        else this.stats.put("Directori:", this.stats.get("Directori:") + 1);
    }
    @Override
    public void visitManager(Manager m){
        Visitee v;
        for(Element e: m.getels()) {
            v = (Visitee) e;
            v.accept(this);
        }
        if(!this.stats.containsKey("Manageri:"))
            this.stats.put("Manageri:", 1);
        else this.stats.put("Manageri:", this.stats.get("Manageri:") + 1);
    }
    public void visitAngajat(Angajat a){
        Visitee v;
        for(Element e: a.getels()) {
            v = (Visitee) e;
            v.accept(this);
        }
        if(!this.stats.containsKey("Angajati:"))
            this.stats.put("Angajati:", 1);
        else this.stats.put("Angajati:", this.stats.get("Angajati:") + 1);
    }
    public void print(){
        for(String key: this.stats.keySet())
            System.out.println(key + "----->" + this.stats.get(key));
    }
}
