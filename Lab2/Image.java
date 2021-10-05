public class Image {
    private String imageName;
    private static int imgno = 0;

    public Image(String imageName) {
        this.imageName = imageName;
        imgno ++;
    }

    public void print(){
        System.out.println("Image " + imgno + "..............." + imageName);
    }
}
