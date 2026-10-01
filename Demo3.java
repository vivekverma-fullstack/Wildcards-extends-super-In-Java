import java.util.ArrayList;
import java.util.List;
// Wildcard with upper bound
public class Demo3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        print(animals);


        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        fun(dogs);
    }
    static void print(List<? extends Animal> val){
        for (Animal animal : val) {
            animal.eat();
        }
    }
    static void fun(List<? extends  Animal>Values){
         for (Animal animal : Values) {
            animal.eat();
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
