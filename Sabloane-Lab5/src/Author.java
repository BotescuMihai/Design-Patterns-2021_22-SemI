public class Author {
    private String name,surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public void print(){
        System.out.println("Name of the author: " + this.name + " " + this.surname);
    }
}