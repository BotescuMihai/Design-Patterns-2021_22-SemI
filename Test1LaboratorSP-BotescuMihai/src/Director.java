import java.util.LinkedList;
import java.util.List;

public class Director extends Personal implements Element,Visitee{

    private List<Element> els = new LinkedList<>();
    public List<Element> getels(){
        return this.els;
    }

    public Director(String nume) {
        this.nume = nume;
    }

    public void putSal(ProxySal sal){
        if(this.getClass().getName() != sal.getsal().getFunctie())
        {
            try {
                throw new Exception("Atentie! Functia nu e trecuta corect pentru : " + this.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.sal = sal;
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

    public void setSal(ProxySal sal){
        this.sal = sal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Director{");
        sb.append("salariu=").append(sal);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", subordonati:\n");
        for(Element e : this.els)
            sb.append(e).append("\n");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accept(Visitor v){
        v.visitDirector(this);
    }
}
