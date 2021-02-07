package DefiningClasses.RawData;
//created by J.M.

public class Car {
    private final String model;
    private final int enginePower;
    private final String cargoType;
    private final double tire1;
    private final double tire2;
    private final double tire3;
    private final double tire4;

    Car(String model, int enginePower, String cargoType, double tire1, double tire2, double tire3, double tire4) {
        this.model = model;
        this.enginePower = enginePower;
        this.cargoType = cargoType;
        this.tire1 = tire1;
        this.tire2 = tire2;
        this.tire3 = tire3;
        this.tire4 = tire4;
    }

    Boolean tirePressure() {
        return getTire1() < 1 || getTire2() < 1 || getTire3() < 1 || getTire4() < 1;
    }

    @Override
    public String toString() {
        return String.format("%s",getModel());
    }

    String getModel() {
        return model;
    }

    String getCargoType() {
        return cargoType;
    }

    int getEnginePower() {
        return enginePower;
    }

    double getTire1() {
        return tire1;
    }

    double getTire2() {
        return tire2;
    }

    double getTire3() {
        return tire3;
    }

    double getTire4() {
        return tire4;
    }
}
