public class Prog {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();             // создаем зоопарк номер 1
        zoo1.addAnimal(new Brontozavr("Vaso", 800, 5000000, 200))
        .addAnimal(new Eagle("Orel", 20, 2))
        .addAnimal(new Crocodile("Gena", 300, 5, "green"))
        .addAnimal(new Ihtiozavr("Dolfi", 250, 5000000, 50))
        .addAnimal(new Pterodactil("Pteros", 50, 5000000, 3))
        .addAnimal(new Tiger("Tigrus", 280, "Orange whith black lines"))
        .addAnimal(new Tiranozavr("Tiranos", 2000, 5000000, 180))
        .addAnimal(new Duck("Martin", 3, "M"));
        
        for (Animal an : zoo1.getAnimals()) {
            System.out.print(an.getClass());
            System.out.println(an);
            System.out.println(an.say());
        }
        System.out.println("---------------------------------");

        for (Speakable item : zoo1.getSpeakables()) {
            System.out.println(item.say());
        }
        System.out.println("---------------------------------");

        for (Runable runner: zoo1.getRunner()) {
            System.out.println(runner.speedRun());
        }

        System.out.println("---------------------------------");

        int maxSpeed = zoo1.getChampion();
        System.out.printf(" Самая большая скорость в зоопарке: %d ", maxSpeed);

        System.out.println();
        System.out.println("---------------------------------");
        

        for (Flyable flyer : zoo1.getFlyer()) {
            System.out.printf("Flaying animal: %s, and his speed: %d", flyer, flyer.speedFly());
            System.out.println();
        }
        System.out.println("---------------------------------");

        for (Swimable swimmer : zoo1.getSwimmer()) {
            System.out.printf("Swimming animal: %s, and his speed: %d", swimmer, swimmer.speedSwim());
            System.out.println();
        }



        System.out.println();


    }
}
