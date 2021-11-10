import java.util.*;

public class Box implements Element{
    private List<Element> els = new LinkedList<Element>();
    private static int box_id = 0;
    public Box(){
        box_id++;
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

    public String toString(){
        StringBuilder out = new StringBuilder();
        out.append("Box id : " + Box.box_id + "\nContents:\n");
        for(Element e : this.els)
            out.append(e.toString() + "\n");
        return out.toString() + "\n\n";
    }
}
