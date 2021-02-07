package DefiningClasses.CarSalesman;
//created by J.M.

public class Engine {

    private final String model;
    private final String power;
    private final String displacement;
    private final String efficiency;

    Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    String getModel() {
        return model;
    }

    String getPower() {
        return power;
    }

    String getDisplacement() {
        return displacement;
    }

    String getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s", getModel(), getPower(), getDisplacement(), getEfficiency());
    }
}
