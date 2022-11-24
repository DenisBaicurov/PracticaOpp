package PracticaOpp;

import java.util.ArrayList;

public class VedingMashine {
    private ArrayList<Product>products;
    private final static ArrayList<Product>initProduct=new ArrayList<>();
    static {
        initProduct.add(new Chokolate("Сникерс",90.0,220));

    }

    public VedingMashine() {

        this(initProduct);
    }

    public VedingMashine(ArrayList<Product> products) {
        this.products = products;
    }

    public VedingMashine(String name, Double price) {
        this.products = new ArrayList<>();
        products.add(new Product(name, price));
    }

    public Product getProductBy(String inpName) {
        for (Product product : products) {
            if (product.getName().contains(inpName)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductBy(Double inpName) {
        for (Product product : products) {
            if (product.getPrice().equals(inpName)) {
                return product;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        String result ="";
        for (Product product : products) {
            result = result.concat(product.toString()+ "\n");
        }
        return result;


    }
}
