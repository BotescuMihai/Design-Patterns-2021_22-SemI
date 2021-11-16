import java.util.LinkedList;
import java.util.List;

public class Manager extends Personal implements Visitee{
    private List<Element> els = new LinkedList<>();
    private String functie;
    public void putSal(ProxySal sal){
        this.sal = sal;
    }
    public List<Element> getels(){
        return this.els;
    }


    public Manager(String nume, String functie){
        this.nume = nume;
        this.functie = functie;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Manager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", functie='").append(functie).append('\'');
        sb.append(",salariu=").append(this.sal.toString()).append("\n");
        sb.append(", subordonati:\n");
        for(Element e : this.els)
            sb.append(e).append("\n");
        sb.append('}');
        return sb.toString();
    }

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

    @Override
    public void accept(Visitor v){
        v.visitManager(this);
    }
}
