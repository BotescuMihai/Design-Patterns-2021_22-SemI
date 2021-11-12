public class Tir {
    private static Tir tir = new Tir();
    private String punct_start;
    private String punct_stop;
    private Box marfa;
    public static Tir getTir(){
        return Tir.tir;
    }
    private Tir(){

    }
    public Tir incarcaMarfa(Box b){
        this.marfa = b;
        return this;
    }
    public Tir conduce(){
        System.out.printf("Driving from %s to %s\n", this.punct_start, this.punct_stop);
        return this;
    }
    public Box getMarfa(){
        return this.marfa;
    }
    public String getPunct_start() {
        return punct_start;
    }

    public Tir setPunct_start(String punct_start) {
        this.punct_start = punct_start;
        return this;
    }

    public String getPunct_stop() {
        return punct_stop;
    }

    public Tir setPunct_stop(String punct_stop) {
        this.punct_stop = punct_stop;
        return this;
    }

    @Override
    public String toString() {
        return "Punct start: " + this.punct_start + ";\nPunct stop: " +
                this.punct_stop + ";\nMarfa:\n" + this.marfa.toString();
    }

    public Tir print(){
        System.out.println(this.toString());
        return this;
    }
}
