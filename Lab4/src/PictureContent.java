import java.util.LinkedList;
import java.util.List;

public class PictureContent{
	enum color{BLACK,RED,BLUE,GREEN,YELLOW,WHITE};
	private List<color> colors = new LinkedList<>();
	public PictureContent(List<PictureContent.color> colors) {
		super();
		this.colors = colors;
	}
	
	
}