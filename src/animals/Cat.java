package animals;

public class Cat extends Animal {

    public Cat(String type, Double weight, String name) {
        super(type, weight, name);
    }

    @Override
    public void sound() {
        System.out.println("Miaaaauuuu");
    }
}
