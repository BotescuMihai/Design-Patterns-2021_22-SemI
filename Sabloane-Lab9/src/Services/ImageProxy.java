package Services;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import models.Dimension;
import models.Element;
import models.Image;
import models.Picture;
import models.*;
public class ImageProxy implements Element, Picture, Visitee{
	private String url;
	private Visitor v;
	private Dimension dim;
	private Image img;
	private List<Element> els = new LinkedList<Element>();
	public ImageProxy(String url) {
		this.url = url;
	}
	public Image loadImage() {
		return img;
	}
	public void setImg(Image image) {
		this.img = image;
	}
	@Override
	public String url() {
		// TODO Auto-generated method stub
		return this.url;
	}
	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return this.dim;
	}
	@Override
	public PictureContent content() {
		// TODO Auto-generated method stub
		return this.img.getPictureContent();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		try {
			if(els.contains(e))
				{throw new Exception("The following cannot be added, because it is already in the list: ");
				}}catch(Exception e1) {
					e1.printStackTrace();
					e.print();
					return;
				}
			this.els.add(e);
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		this.els.remove(e);
	}
	@Override
	public Element get(int i) {
		// TODO Auto-generated method stub
		return this.els.get(i);
	}
	@Override
	public List<Element> get_elements() {
		return this.els;
	}
	public String toString() {
		return "Elements:" + this.els.toString();
	}
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		this.v = v;
		v.visitImageProxy(this);
	}
}
