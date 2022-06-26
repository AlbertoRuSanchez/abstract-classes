package animals;

public class Dog extends Animal {

    public Dog(String type, Double weight, String name) {
        super(type, weight, name);
    }

    @Override
    public void sound() {
        System.out.println("Guofff Guofff");
    }
}
