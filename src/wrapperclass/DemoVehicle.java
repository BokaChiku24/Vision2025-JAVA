package wrapperclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Vehicle {
    String color, make, model;
    int sw;
    boolean state = false;

    void setState() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (state == true) {
            System.out.println("Engine is already running.");
        }
        if (state == false) {
            System.out.println("The engin is currently stopped.");
            System.out.println("Do you want to start the engine? (yes = 1/no = 0): ");
        }
        sw = Integer.parseInt(reader.readLine());
        if (sw == 1) {
            state = true;
            System.out.println("Engine started successfully.");
        }
    }

    void att() {
        System.out.println("The bike is " + color + " " + make + " " + model + ".");
        if (state == true) {
            System.out.println("The engine is running.");
        }
        if (state == false) {
            System.out.println("The engine is stopped.");
        }
    }
}

public class DemoVehicle {
    public static void main(String[] args)throws Exception {
        Vehicle bike = new Vehicle();
        bike.color = "Blue";
        bike.make = "Honda";
        bike.model = "Civic";
        bike.att();
        bike.setState();
    }
}
