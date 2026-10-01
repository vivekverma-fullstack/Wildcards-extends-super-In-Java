import java.util.ArrayList;
import java.util.List;

    // Generics with lower bound (super)

public class Demo4 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);
        
    }
    public static void fun(List<? super Animal> list){
        // Writing
            list.add(new Animal());
            list.add(new Dog());
            list.add(new Cat());
            list.add(new labrador());

            for (Object obj: list) {
               Animal a = (Animal) obj;
               a.eat();
            }
    }
}

class Animal{
    void eat(){
        System.out.println("Animal Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}
class Dog extends Animal{
    @Override 
    void eat(){
        System.out.println("Dogs Eating");
    }
    void bark() {
        System.out.println("Barking");
    }
}
class Cat extends Animal{

}
class labrador extends Dog{

}
