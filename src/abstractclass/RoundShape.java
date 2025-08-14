package abstractclass;

abstract class Shape {
    double radius;
    double PI = 3.14f;
    public abstract void findArea(double radius);
    public abstract void findVolume(double radius);
}


public class RoundShape extends Shape {

    @Override
    public void findArea(double radius) {
        double area = 4 * PI * (radius * radius);
        System.out.println("Area of the round shape: " + area);
    }

    @Override
    public void findVolume(double radius) {
        double volume = (4/3) * PI * (radius * radius * radius);
        System.out.println("Volume of the round shape: " + volume);
    }

    public static void main(String[] args) {
        double radius = 2.5d;
        RoundShape roundShape = new RoundShape();
        roundShape.findArea(radius);
        roundShape.findVolume(radius);
    }
}
