package models;

import java.util.List;

public interface Element {
	public void print();
	public void add(Element e);
	public void remove(Element e);
	public Element get(int i);
	public List<Element> get_elements();
}