package Interface;


import abstract_class.Animal;

public class chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Gà kêu: chip chip";
    }

    @Override
    public String howToEat() {
        return "co the duoc chien";
    }
}
