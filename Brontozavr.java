public class Brontozavr extends Dinozavr implements Runable {
    private int armor; // уровень брони

    public Brontozavr(String name, int weight, int age, int armor) {
        super(name, weight, age);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {

        return super.toString() + String.format(", armor: %d", armor);
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "Muuuuuu";
    }

    @Override
    public int speedRun() {
        // TODO Auto-generated method stub
        return 15;
    }

}
