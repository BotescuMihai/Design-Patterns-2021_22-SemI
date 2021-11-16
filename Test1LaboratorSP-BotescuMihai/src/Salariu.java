import java.util.LinkedList;
import java.util.List;

public class Salariu implements Element{
    private String functie;
    private double valoare;
    private List<Element> els = new LinkedList<>();

    public double getVal(){
        return this.valoare;
    }
    public String getFunctie(){
        return this.functie;
    }
    public Salariu(String functie, double valoare) {
        this.functie = functie;
        this.valoare = valoare;
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
        final StringBuffer sb = new StringBuffer("Salariu{");
        sb.append("functie='").append(functie).append('\'');
        sb.append(", valoare=").append(valoare);
        return sb.toString();
    }
}
