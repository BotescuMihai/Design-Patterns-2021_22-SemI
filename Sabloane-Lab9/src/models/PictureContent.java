package models;
import java.util.LinkedList;
import java.util.List;

public class PictureContent{
	enum color{BLACK,RED,BLUE,GREEN,YELLOW,WHITE};
	private List<color> colors = new LinkedList<>();
	public PictureContent(List<PictureContent.color> colors) {
		super();
		this.colors = colors;
	}

	public String getColors(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(color col: this.colors)
			sb.append(col.toString() + ",");
		sb.append("]");
		return sb.toString();
	}
	
	
}