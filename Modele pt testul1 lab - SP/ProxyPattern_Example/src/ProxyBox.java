public class ProxyBox {
    private Box box;
    public ProxyBox(Box box){
        this.box = box;
        if(box.getGreutate() >= 4)
            box.loadBox();
        else
            System.out.println(box + "\nWill not be loaded!!!");
    }
}
