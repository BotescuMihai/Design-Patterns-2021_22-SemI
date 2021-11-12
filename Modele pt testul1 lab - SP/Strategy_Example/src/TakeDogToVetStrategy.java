public class TakeDogToVetStrategy implements TakeAnimalToVetStrategy{
    private Dog dog;
    public TakeDogToVetStrategy(Dog dogg){
        dog = dogg;
    }
    @Override
    public void take_animal_to_vet(){
        System.out.println("Taking dog " + this.dog + " to specialist vet");
    }
}
