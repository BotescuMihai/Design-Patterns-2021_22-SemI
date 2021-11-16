import java.util.LinkedList;
import java.util.List;
public class Firma implements Element, Visitee {
    private String nume;
    private List<Element> els = new LinkedList<>();
    public List<Element> getels(){
     return this.els;
}
    public Firma(String nume) {
        this.nume = nume;
    }
    @Override
    public void accept(Visitor v){
        v.visitFirma(this);
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
        final StringBuffer sb = new StringBuffer("Firma{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", angajati:\n");
        for(Element e : this.els)
            sb.append(e).append("\n");
        return sb.toString();
    }

}
