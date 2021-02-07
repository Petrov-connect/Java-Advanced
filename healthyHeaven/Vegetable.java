package healthyHeaven;
//created by J.M.

public class Vegetable {

    private  String name;
    private  int calories;

    public Vegetable(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return String.format(" - %s have %d calories",getName(),getCalories());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
