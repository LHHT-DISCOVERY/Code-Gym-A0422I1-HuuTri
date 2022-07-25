package ss7_abstrac_interface.TH.project_animal_interface;

public class Chicken extends Animal implements Edible {
     public  String makeSound(){
        return " Chicken speak Cut-Cut";
    }

    @Override
    public String howToEat() {
        return " Chicken Eat Edible ";
    }
}
