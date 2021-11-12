public class TakeCatToVetStrategy implements TakeAnimalToVetStrategy{
    private Cat cat;
    public TakeCatToVetStrategy(Cat catt){
        cat = catt;
    }
    @Override
    public void take_animal_to_vet(){
        System.out.println("Taking cat " + cat + " to generalist vet");
    }
}
