public class ProxySal {
    private Salariu sal;
    public Salariu getsal(){
        return this.sal;
    }
    public ProxySal(Salariu sal){
            if(sal.getVal() <= 6400){
                    System.out.println("Salariul " + sal.getVal() +  " nu depaseste 6400. Acesta se incarca...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.sal = sal;
    }
    public String toString(){
        return this.sal.toString();
    }
}
