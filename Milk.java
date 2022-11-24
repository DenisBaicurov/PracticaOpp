package PracticaOpp;

public class Milk extends Product {
    private int fatness;

    public Milk(String name) {
        super(name);
    }

    public Milk(String name, Double price) {
        super(name, price);
    }

    public Milk(String name, Double price, int fatness) {

       super(name,price);
        this.fatness=fatness;
    }



    public int getFatness() {
        return fatness;
    }

    @Override
    public String toString() {
        return String.format("%s  %d", super.toString(), getFatness());
    }
}
