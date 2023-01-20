public class Tiger extends Animal implements Runable {
    private String color;   //  окрас

    public Tiger(String name, int weight, String color) {
        super(name, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format(", color: %s", color);
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "Rrrrrrrr";
    }

    @Override
    public int speedRun() {
        // TODO Auto-generated method stub
        return 50;
    }
}
