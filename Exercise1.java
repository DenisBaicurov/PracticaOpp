package PracticaOpp;

import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {

        ArrayList<Product>products=new ArrayList<>();
        products.add(new Milk("Петмол", 60.0, 5));
        products.add(new Chokolate("Milka", 88.0, 303 ));
        products.add(new Chokolate("Snikers", 90.0, 401 ));
        products.add(new Product("Чипсы", 60.0));
        products.add(new Product("Масло", 50.0));
        products.add(new Product("Хлеб", 40.0));
        products.add(new Product("Снек", 20.0));
        VedingMashine v1 = new VedingMashine(products);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Масло"));
        System.out.println(v1.getProductBy("Milka"));





    }



}
