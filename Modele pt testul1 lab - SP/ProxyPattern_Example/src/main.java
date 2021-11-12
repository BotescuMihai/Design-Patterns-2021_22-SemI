public class main {

    /**
     * Cerinta problemei:
     * Un tir merge catre vama. In acest tir, se pot afla mai multe cutii de o anumita greutate (in kg), in care se pot afla alte cutii mai mici sau canistre.
     * O canistra poate contine ulei, gaz sau suc de portocale.
     * Uleiul are un tip, gazul are densitatea in aer si sucul de portocale are o concentratie anume.
     * In momentul in care tirul ajunge la vama, se doreste analiza cutiilor.
     * Se stie ca analiza unei cutii dureaza 5 secunde.
     * Nu se vor analiza cutiile care au greutatea mai mica decat 4 kg.
     */

    public static void main(String[]args){
        Box b1 = new Box(5);
        Canistra c1 = new Canistra();
        Ulei u1 = new Ulei("floarea soarelui");
        Gaz g1 = new Gaz(2.51);
        SucPortocale porto1 = new SucPortocale(50.21);
        c1.add(u1);
        Canistra c2 = new Canistra();
        c2.add(g1);
        Canistra c3 = new Canistra();
        c3.add(porto1);
        b1.add(c1);
        Box b2 = new Box(2.3);
        b2.add(c2);
        b1.add(b2);
        ProxyBox pb2 = new ProxyBox(b2);
        ProxyBox pb1 = new ProxyBox(b1);
        Box b3 = new Box(2.5);
        ProxyBox pb3 = new ProxyBox(b3);
        b3.add(c3);
        Box bmare = new Box(10.16);
        ProxyBox pbmare = new ProxyBox(bmare);
        bmare.add(b1);
        bmare.add(b3);
        System.out.println(bmare);
        Tir.getTir().setPunct_start("Timisoara")
                    .setPunct_stop("Arad")
                    .incarcaMarfa(bmare)
                    .conduce().print();
    }
}
