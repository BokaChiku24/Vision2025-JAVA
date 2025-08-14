package interfaceconcept;

interface Area{
    final static float PI = 3.14f;
    float calculateArea(float x, float y);
}

class Circle implements Area{
    @Override
    public float calculateArea(float radius, float y) {
        return PI * radius * radius;
    }
}

class Rectangle implements Area{
    @Override
    public float calculateArea(float length, float breadth) {
        return length * breadth;
    }
}

class Triangle implements Area{
    @Override
    public float calculateArea(float base, float height) {
        return 0.5f * base * height;
    }
}

class Sqare implements Area{
    @Override
    public float calculateArea(float side, float y) {
        return side * side;
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Area area;
        Circle circle = new Circle();
        area = circle;
        System.out.println("Area of circle: " + area.calculateArea(5.0f, 0.0f));
        Rectangle rectangle = new Rectangle();
        area = rectangle;
        System.out.println("Area of rectangle: " + area.calculateArea(5.0f, 3.0f));
        Triangle triangle = new Triangle();
        area = triangle;
        System.out.println("Area of triangle: " + area.calculateArea(5.0f, 3.0f));
        Sqare square = new Sqare();
        area = square;
        System.out.println("Area of square: " + area.calculateArea(5.0f, 0.0f));
    }
}
