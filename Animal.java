public abstract class Animal implements Speakable {
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format(" Name: %s, weight: %d", name, weight);
    }

    public abstract String say();       //  cпособность произносить звуки

}
