package animals;

public abstract class Animal {

    private String type;
    private Double weight;
    private String name;

    public Animal(String type, Double weight, String name) {
        this.type = type;
        this.weight = weight;
        this.name = name;
    }

    public void salutation(){
        System.out.println("Hi, i am a " + type + " and my name is " + name);
    }
    public abstract void sound();

}
