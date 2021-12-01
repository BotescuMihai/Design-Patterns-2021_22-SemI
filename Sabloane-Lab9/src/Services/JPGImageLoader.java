package Services;
import java.util.concurrent.TimeUnit;

public class JPGImageLoader implements ImageLoader {
	String imageName;
	public JPGImageLoader(String imageName) {
		this.imageName = imageName;
	}
	@Override
	public void load(String imageName) {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Loaded image " + imageName);
	}
}
