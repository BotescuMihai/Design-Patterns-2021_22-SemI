import java.util.LinkedList;
import java.util.List;

public class Cat implements Element{
    private String name;
    private List<Element> els = new LinkedList<>();
    public Cat(String name){
        this.name = name;
    }
    @Override
    public List<Element> add(Element e){
        this.els.add(e);
        return this.els;
    }
    @Override
    public List<Element> remove(Element e){
        this.els.remove(e);
        return this.els;
    }
    @Override
    public Element get(int i){
        return this.els.get(i);
    }
    public String toString(){
        return "Cat - name: " + this.name;
    }
    public Cat goToVet(String vetName){
        System.out.println("Going to vet "+ vetName);
        new TakeCatToVetStrategy(this).take_animal_to_vet();
        return this;
    }
}
