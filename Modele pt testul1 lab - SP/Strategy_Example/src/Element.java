import java.util.List;

public interface Element {
    public List<Element> add(Element e);
    public List<Element> remove(Element e);
    public Element get(int i);
}
