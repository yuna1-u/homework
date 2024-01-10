public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("Pet");
        fish.setAge(5);
        fish.setColor("Gold");

        Parrot parrot = new Parrot();
        parrot.setName("Darling");
        parrot.setAge(12);
        parrot.setColor("Blue");

        Cat cat = new Cat();
        cat.setName("Naen");
        cat.setAge(10);
        cat.setColor("Black");

        Dog dog = new Dog();
        dog.setName("Mingi");
        dog.setAge(13);
        dog.setColor("Wite");


        System.out.println("Information about the fish:\n" +
                           "Name: " + fish.getName() + "\n" + 
                           "Age: " + fish.getAge() + "\n" + 
                           "Color: " + fish.getColor() + "\n");
        System.out.println("Information about the parrot:\n" + 
                           "Name: " + parrot.getName() + "\n" +
                           "Age: " + parrot.getAge() + "\n" + 
                           "Color: " + parrot.getColor() + "\n");
        System.out.println("Information about the cat:\n" + 
                           "Name: " + cat.getName() + "\n" + 
                           "Age: " + cat.getAge() + "\n" +
                           "Color: " + cat.getColor() + "\n");
        System.out.println("Information about the dog:\n" +
                           "Name: " + dog.getName() + "\n" +
                           "Age: " + dog.getAge() + "\n" + 
                           "Color: " + dog.getColor());


    }
}
