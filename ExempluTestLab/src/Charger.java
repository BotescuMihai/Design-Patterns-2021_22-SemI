import java.util.LinkedList;
import java.util.List;

public class Charger extends Product{

    public Charger(String brand, double pret){
        this.brand = brand;
        this.pret = pret;
    }

    public String toString(){
        return "Headphone - brand: " + this.brand + "; pret: " + this.pret;
    }

    public double getPret(){
        return this.pret;
    }
}
