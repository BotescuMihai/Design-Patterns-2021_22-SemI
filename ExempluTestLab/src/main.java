import java.util.*;

public class main {
    public static void main(String[]args){
        Box b = new Box();
        Product p1 = new Phone("Sony",OS.Android,2000);
        Product p11 = new Charger("Samsung",100);
        Product p111 = new Headphone("Sony",150);
        Product p2 = new Phone("Apple iPhone", OS.iOS,5000);
        Product p22 = new Charger("Apple",200);
        Product p3 = new Phone("Nokia Lumia", OS.Windows,1500);
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();
        b1.add(p1);
        b1.add(p11);
        b1.add(p111);
        b2.add(p2);
        b2.add(p22);
        b3.add(p3);
        b.add(b1);
        b.add(b2);
        b.add(b3);
        System.out.println(b);
        List<Product> e = new LinkedList<>();
        e.add(p1);
        e.add(p2);
        e.add(p3);
        e.add(p11);
        e.add(p111);
        e.add(p22);
        System.out.println("Average price of phones is: " +
                           e.
                           stream().
                                   filter(el -> el instanceof Phone).
                           mapToDouble(el -> el.getPret()).
                           summaryStatistics().
                           getAverage());

        System.out.println("Average price of headphones is: " +
                            e.
                            stream().
                            filter(el -> el instanceof Headphone).
                            mapToDouble(el -> el.getPret()).
                            summaryStatistics().
                            getAverage());
        System.out.println("Average price of chargers is: " +
                e.
                        stream().
                        filter(el -> el instanceof Charger).
                        mapToDouble(el -> el.getPret()).
                        summaryStatistics().
                        getAverage());
    }
}
