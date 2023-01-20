public class Duck extends Animal implements Runable, Flyable, Swimable {
    private String Sex;

    public Duck(String name, int weight, String sex) {
        super(name, weight);
        Sex = sex;
    }

    public String getSex() {
        return Sex;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format(", Sex: %s", Sex);
    }
    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "Kra-kra-kra";
    }

    @Override
    public int speedRun() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public int speedFly() {
        // TODO Auto-generated method stub
        return 45;
    }

    @Override
    public int speedSwim() {
        // TODO Auto-generated method stub
        return 18;
    }
    
}
