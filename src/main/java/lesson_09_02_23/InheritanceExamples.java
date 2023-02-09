package lesson_09_02_23;
public class InheritanceExamples {
    public static void main(String[] args) {

        Animal animal  = new Animal();
        animal.voice();

        Dog dog = new Dog();
        dog.voice();

        Shepherd shepherd = new Shepherd();
        shepherd.voice();

        Bird bird = new Bird();
        bird.voice();

        Parrot parrot = new Parrot();
        parrot.voice();
    }
}

class Animal {
    public void voice() {
        System.out.println("Voice-voice");
    }

    public void animalMethod() {}
}

class Bird extends Animal {
    @Override
    public void voice() {
        System.out.println("Trululu");
    }
}

class Parrot extends Bird {
    @Override
    public void voice() {
        System.out.println("Chick-chi-rick");
    }
}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Bark-Bark");
    }

    public void dogMethod() {}
}

class Shepherd extends Dog {
    @Override
    public void voice() {
        System.out.println("Bark-Shepherd-Bark");
    }

}

// -> направление в сторну дочернего класса

// Shepherd <- Dog <- Animal <- многоуровневое наследование
// Bird <- Animal -> Dog     <- иерархического сценария