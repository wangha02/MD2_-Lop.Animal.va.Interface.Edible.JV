package rikkei.academy;


import rikkei.academy.animals.Animal;
import rikkei.academy.animals.Chicken;
import rikkei.academy.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
        }

    }
}