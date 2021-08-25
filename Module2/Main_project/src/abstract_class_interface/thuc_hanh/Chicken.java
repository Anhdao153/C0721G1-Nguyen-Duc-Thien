package abstract_class_interface.thuc_hanh;

public class Chicken extends Animal implements Editble {
    public String makeSound(){
        return "gà: Cục tác, cục cục tác";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
