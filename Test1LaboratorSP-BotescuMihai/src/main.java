public class main {
    public static void main(String[]args){
        Firma f = new Firma("Papucescu SRL");
        Personal d1 = new Director("Clapucescu Mihai");
        Personal m1 = new Manager("Hopescu Tania", "Manager general");
        Personal m2 = new Manager("Gaina Delia","Manager local");
        Personal a1 = new Angajat("Iovu Matilda", "IT-ist");
        Personal a2 = new Angajat("Piri Para", "Contabil");
        Personal a3 = new Angajat("Ovescu Iova", "paznic");
        d1.putSal(new ProxySal(new Salariu("Director",9800)));
        m1.putSal(new ProxySal(new Salariu("Manager",5400)));
        m2.putSal(new ProxySal(new Salariu("Manager",5200)));
        a1.putSal(new ProxySal(new Salariu("Angajat",3200)));
        a2.putSal(new ProxySal(new Salariu("Angajat",2900)));
        a3.putSal(new ProxySal(new Salariu("Angajat",2500)));
        m1.add(a1);
        m1.add(a2);
        m1.add(a3);
        m2.add(a3);
        d1.add(m1);
        d1.add(m2);
        f.add(d1); //adaug directorul firmei
        System.out.println(f);
        ///////
        Statistics stats = new Statistics();
        f.accept(stats);

        stats.print();
    }
}
