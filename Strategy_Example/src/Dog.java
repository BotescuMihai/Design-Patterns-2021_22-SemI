import java.util.LinkedList;
import java.util.List;

public class Dog implements  Element{
    private String name;
    private List<Element> els = new LinkedList<>();
    public Dog(String name){
        this.name = name;
    }
    public String toString(){
        return "Dog - name: " + this.name;
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
    public Dog goToVet(String vetName){
        System.out.println("Going to vet "+ vetName);
        new TakeDogToVetStrategy(this)
                .take_animal_to_vet();
        return this;
    }
}
