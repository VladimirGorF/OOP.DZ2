public class Eagle extends Animal implements Runable, Flyable{
    private int wingSize;

    public Eagle(String name, int weight, int wingSize) {
        super(name, weight);
        this.wingSize = wingSize;
    }

    public int getWingSize() {
        return wingSize;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format(", size of wings: %d", wingSize);
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "Piu-piu";
    }

    @Override
    public int speedRun() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public int speedFly() {
        // TODO Auto-generated method stub
        return 90;
    }
}
