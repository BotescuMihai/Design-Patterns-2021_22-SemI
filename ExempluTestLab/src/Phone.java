import java.util.LinkedList;
import java.util.List;

enum OS{iOS, Android, Windows};
public class Phone extends Product{
    private OS os;

    public Phone(String brand, OS os, double pret){
        this.brand = brand;
        this.os = os;
        this.pret = pret;
    }

    public String toString(){
        return "Phone- brand: " + this.brand + "; operating system: " + this.os.toString() + "; price: " + this.pret;
    }

    public double getPret(){
        return this.pret;
    }
}
