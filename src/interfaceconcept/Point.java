package interfaceconcept;

interface shape{
    public abstract double area();
    public abstract double volume();
}

public class Point implements shape{
    static int x, y;

    public Point(){
        x = 0;
        y = 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    public static void print(){
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        Point p = new Point();
        Point.print();
    }
}
