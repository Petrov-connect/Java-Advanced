package healthyHeaven;
//created by J.M.

import java.util.*;

public class Restaurant {

     private  String name;
     private  List<Salad>data;

    public Restaurant(String name) {
        this.name = name;
        this.data = new ArrayList<>();
    }

    public void add(Salad salad){
        this.data.add(salad);
    }

    public boolean buy(String name){
        return this.data.removeIf(salad -> salad.getName().equals(name));
    }

    public Salad getHealthiestSalad(){
        return this.data.stream().max((a, b) -> Integer.compare(b.getTotalCalories(), a.getTotalCalories())).orElse(null);
    }

    public String generateMenu(){
        StringBuilder output = new StringBuilder();
        output.append(name).append(" have ").append(data.size()).append(" salads:").append(System.lineSeparator());
        data.forEach(output::append);
        return output.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(List<Salad> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public List<Salad> getData() {
        return data;
    }
}
