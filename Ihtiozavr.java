public class Ihtiozavr extends Dinozavr implements Swimable {
    private int breath;  //   дыхание под водой минуты

    public Ihtiozavr(String name, int weight, int age, int breath) {
        super(name, weight, age);
        this.breath = breath;
    }

    public int getBreath() {
        return breath;
    }
    @Override
    public String toString() {
        
        return super.toString() + String.format(", breath: %d", breath);
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "iiiuuuuuuiiiiuuuuu";
    }

    @Override
    public int speedSwim() {
        // TODO Auto-generated method stub
        return 30;
    }
}

