public class Paragraph {
    private String text;
    private static int paragraph_no = 0;

    public Paragraph(String text) {
        this.text = text;
      //  paragraph_no ++;
    }

    public void print(){
        paragraph_no ++;
        System.out.println("Paragraph " + paragraph_no + "........................" + text);
    }
}
