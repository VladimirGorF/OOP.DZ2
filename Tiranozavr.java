public class Tiranozavr extends Dinozavr implements Runable{
    private int fangs;           //  количество клыков

    public Tiranozavr(String name, int weight, int age, int fangs) {
        super(name, weight, age);
        this.fangs = fangs;
    }

    public int getFangs() {
        return fangs;
    }
    @Override
    public String toString() {
        
        return super.toString() + String.format(", fangs: %d ", fangs);
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "Big-RRRRRRRRRRR";
    }

    @Override
    public int speedRun() {
        // TODO Auto-generated method stub
        return 40;
    }
}
