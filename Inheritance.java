package OOP;
class Animals {
    String species;
    int age;

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cats extends Animals {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Dogs extends Animals {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Cats cat = new Cats();
        Dogs dog = new Dogs();
        animal.makeSound();
        cat.makeSound();
        cat.age = 2;
        System.out.println("Cat age is: " + cat.age + " years old.");
        cat.species = "Felis catus";
        System.out.println("Cat specie is: " + cat.species);
        dog.makeSound();
        dog.age = 5;
        System.out.println("Dog age is: " + dog.age + " years old.");
    }
}
