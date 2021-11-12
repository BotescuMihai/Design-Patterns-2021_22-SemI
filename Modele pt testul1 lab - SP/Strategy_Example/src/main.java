public class main {
    /***
     * O persoana are mai multe pisici si mai multi caini.
     * Se stie ca pisicile pot fi duse la veterinarul generalist,
     * iar cainii pot fi dusi la veterinarul specialist.
     * Proprietarul va transporta un singur animal intr-o cusca odata,
     * dar poate transporta oricate custi.
     */
    public static void main(String[]args){
        Cage cg1 = new Cage(210);
        Cage cg2 = new Cage(420);
        Cat c1 = new Cat("peachy");
        Cat c2 = new Cat("batman");
        Owner.get_owner()
                .name("Popescu")
                .add(cg1)
                .add(c1);
        c1.goToVet("Gataiantu");
        Owner.get_owner()
                .name("Popescu")
                .add(cg1)
                .add(c2);
        c2.goToVet("DuoVet");
        Dog d1 = new Dog("hector");
        Owner.get_owner()
                .name("Florin")
                .add(cg2)
                .add(c2);
        d1.goToVet("DuoVet");
    }
}
