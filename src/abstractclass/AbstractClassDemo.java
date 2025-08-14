package abstractclass;

abstract class vehicle{
    String color;
    String make;
    String model;
    int year;
    abstract void startEngine();
    void stopEngine(){
        System.out.println("Engine stopped");
    }
}

class FourWheeler extends vehicle{
    float fuelUsed;

    @Override
    void startEngine() {
        System.out.println("Four wheeler engine started");
        fuelUsed += 0.5f;
    }

    void showFuelConsumption(){
        System.out.println("Fuel consumed: " + fuelUsed + " liters");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.color = "Red";
        fourWheeler.make = "Toyota";
        fourWheeler.model = "Camry";
        fourWheeler.year = 2022;
        fourWheeler.startEngine();
        fourWheeler.stopEngine();
        fourWheeler.showFuelConsumption();
    }
}
