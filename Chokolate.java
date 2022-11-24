package PracticaOpp;

import java.util.StringJoiner;

public class Chokolate extends Product{

    private int calories;

    public Chokolate(String name) {
        super(name);
    }

    public Chokolate(String name, Double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    public Chokolate(String name, Double price) {
        super(name, price);
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {


         return new StringJoiner(", ", "Шоколад " + "[ ", "]").add(""+getName()
         +", цена "+getPrice() + ", калории " +calories).toString();



    }
}
