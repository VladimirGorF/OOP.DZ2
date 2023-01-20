public class Crocodile extends Animal implements Runable, Swimable {
    private int length;  // длина
    private String color;    // цвет
    public Crocodile(String name, int weight, int length, String color) {
        super(name, weight);
        this.length = length;
        this.color = color;
    }
    public int getLength() {
        return length;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format(", length: %d, color: %s", length, color);
    }
    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "Hryk-hryk";
    }
    @Override
    public int speedRun() {
        // TODO Auto-generated method stub
        return 5;
    }
    @Override
    public int speedSwim() {
        // TODO Auto-generated method stub
        return 20;
    }

    
}
