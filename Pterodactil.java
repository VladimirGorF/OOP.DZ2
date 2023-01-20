public class Pterodactil extends Dinozavr implements Runable, Flyable{
    private int wingSize;

    public Pterodactil(String name, int weight, int age, int wingSize) {
        super(name, weight, age);
        this.wingSize = wingSize;
    }

    public int getWingSize() {
        return wingSize;
    }
    @Override
    public String toString() {
        
        return super.toString() + String.format(", size of wings: %d", wingSize);
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "Chuyooosssss";
    }

    @Override
    public int speedRun() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public int speedFly() {
        // TODO Auto-generated method stub
        return 60;
    }
}
