public interface Element {
    final Box b = new Box();
    public void add(Element e);
    public void remove(Element e);
    public Element get(int index);
}
