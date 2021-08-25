package abstract_class_interface.thuc_hanh;

public class Main {
    public static void main(String[] args) {
       Animal[] animals=new Animal[2];
       animals[0]=new Tiger();
       animals[1]=new Chicken();
    for (Animal animal:animals){
        System.out.println(animal.makeSound());
        if (animal instanceof Chicken){
            Editble editble=(Chicken) animal;
            System.out.println(editble.howtoEat());
        }
    }
    fruit[] traicay=new fruit[2];
        traicay[0]=new Apple();
        traicay[1]=new Orange();
        for(fruit traicay1:traicay){
            System.out.println(traicay1.howtoEat());
        }
    }


}
