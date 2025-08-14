package wrapperclass;

class Motor{
    String make;
    String model;
    String color;
    int year;
    double price;
    boolean enginState = false;
    void startEngin(){
        System.out.println("Motor started");
        if(enginState == true)
            System.out.println("Engine is already running");
        else{
            enginState = true;
            System.out.println("Engine started successfully");
        }
    }

    void showAfter(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Engine State: " + (enginState? "Running" : "Stopped"));
    }
}

public class DemoMotor {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.make = "Toyota";
        motor.model = "Camry";
        motor.color = "Blue";
        motor.year = 2021;
        motor.price = 22000.0;
        motor.startEngin();
        motor.showAfter();
    }
}
