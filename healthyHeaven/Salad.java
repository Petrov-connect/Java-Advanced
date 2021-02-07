package healthyHeaven;
//created by J.M.

import java.util.*;

public class Salad {

    private  String name;
    private  List<Vegetable> products;

    public Salad(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTotalCalories() {
        return this.products.stream().mapToInt(Vegetable::getCalories).sum();
    }

    public int getProductCount() {
        return this.products.size();
    }

    public void add(Vegetable product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("* Salad ");
        output.append(getName()).append(" is ").append(getTotalCalories()).append(" calories and have ")
                .append(getProductCount()).append(" products:").append(System.lineSeparator());
        getProducts().forEach(e -> output.append(e).append(System.lineSeparator()));
        return output.toString();
    }

    public List<Vegetable> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Vegetable> products) {
        this.products = products;
    }
}
