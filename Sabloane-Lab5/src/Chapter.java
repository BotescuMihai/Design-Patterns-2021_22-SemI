import java.util.LinkedList;
import java.util.List;

public class Chapter {
    private String name;
    private static int chapter_no = 0;
    private List<SubChapter> subchapter = new LinkedList<SubChapter>();
    public Chapter(String name) {
    	this.name = name;        chapter_no ++;

    }
    public Chapter(String name, List<SubChapter> subChapter) {
        this.name = name;
        chapter_no ++;
        this.subchapter = subChapter;
    }

    public void print(){
        System.out.println("Chapter " + chapter_no + "....................." + name);
        for(SubChapter subchapter : subchapter)
        	subchapter.print();
    }
	public int createSubChapter(String string) {
		// TODO Auto-generated method stub
		subchapter.add(new SubChapter(string));
		return subchapter.size()-1;
	}
	public SubChapter getSubChapter(int indexSubChapterOneOne) {
		return subchapter.get(indexSubChapterOneOne);
	}
}