import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {                              // конструктор списка животных
        animals = new ArrayList<Animal>();
    }

    private Radio radio1 = new Radio();

    public List<Speakable> getSpeakables(){
        List<Speakable> res = new ArrayList<Speakable>();   //  создали новый список говорящих 
        for (Animal an : animals) {    // пробежались по животным, запсиали их в говорящих.
            res.add(an);
        }
        res.add((radio1));   //   радио тоже добваили в говорящие.
        return res;  //   возвращаем список говорящих
    }

    public List<Runable> getRunner(){      //   создали метод бегунов 
        List<Runable> res = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable){
                res.add((Runable)an);   //  an привели к типу Runable
            }
            
        }
        return res;
    }

    public int getChampion(){    // метод самый быстрый бегун
        int champSpeed = 0;
        for (Runable an : getRunner()) {
            if( an.speedRun() > champSpeed){
                champSpeed = an.speedRun();
            }
        }
        return champSpeed;
    }

    public List<Flyable> getFlyer(){      //   создали метод летающих 
        List<Flyable> res = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable){
                res.add((Flyable)an);   //  an привели к типу Flyable
            }   
        }
        return res;
    }

    public List<Swimable> getSwimmer(){      //   создали метод плавающих
        List<Swimable> res = new ArrayList<Swimable>();
        for (Animal an : animals) {
            if (an instanceof Swimable){
                res.add((Swimable)an);   //  an привели к типу Flyable
            }   
        }
        return res;
    }





    public List<Animal> getAnimals() {      //  геттер
        return animals;
    }

    public Zoo addAnimal(Animal a){         // эддер
        animals.add(a);
        return this;
    }

}
