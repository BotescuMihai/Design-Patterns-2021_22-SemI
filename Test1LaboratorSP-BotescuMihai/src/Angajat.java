import java.util.LinkedList;
import java.util.List;

public class Angajat extends Personal implements Visitee{
    private String functie;
    private List<Element> els = new LinkedList<>();


    public void putSal(ProxySal sal){
        this.sal = sal;
    }

    public Angajat(String nume, String functie) {
        this.nume = nume;
        this.functie = functie;
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
    public String toString() {
        final StringBuffer sb = new StringBuffer("Angajat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", functie='").append(functie).append('\'');
        sb.append(",salariu=").append(this.sal.toString()).append("\n");
        return sb.toString();
    }
    public List<Element> getels(){
        return this.els;
    }

    @Override
    public void accept(Visitor v){
        v.visitAngajat(this);
    }
}
