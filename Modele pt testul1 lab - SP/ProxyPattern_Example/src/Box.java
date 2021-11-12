import java.util.LinkedList;
import java.util.List;

public class Box implements Element{
    private List<Element> els = new LinkedList<>();
    private static int ID = 0;
    private double greutate;
    public Box(double greutate){
        Box.ID ++;
        this.greutate = greutate;
    }
    public void loadBox(){
        String str = this.toString();
        System.out.println("Loading ..." + str);
        try{
            Thread.sleep(1000);
        }catch(Exception exc){
            System.out.println("Exception: " + exc.getCause() + "; " + exc.getMessage());
        }
        System.out.println("Loaded!");
    }
    public double getGreutate(){
        return this.greutate;
    }
    public String toString(){
        String str= "Box no. " + Box.ID + "; greutate=" + this.greutate +  "kg; Contents: \n";
        for(Element e : this.els)
            str+=e.toString() + ";\n";
        return str.toString();
    }
    @Override
    public void add(Element e){
        this.els.add(e);
    }
    @Override
    public void remove(Element e){
        this.els.remove(e);
    }
    @Override
    public Element get(int i){
        return this.els.get(i);
    }
}
