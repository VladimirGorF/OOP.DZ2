public abstract class Dinozavr extends Animal{
    private int age;

    public Dinozavr(String name, int weight, int age) {
        super(name, weight);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format(", age: %d years", age);
    }

}
