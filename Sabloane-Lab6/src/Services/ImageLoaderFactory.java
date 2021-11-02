package Services;

public class ImageLoaderFactory {
	ImageLoader i;
	public void create(String imageTitle) throws Exception {
		if(imageTitle.endsWith("jpg"))
		{
			i = new JPGImageLoader(imageTitle);
		}
		else if(imageTitle.endsWith("bmp")) {
			i = new BMPImageLoader(imageTitle);
		}
		else throw new Exception("format imagine gresit");
	}
}
