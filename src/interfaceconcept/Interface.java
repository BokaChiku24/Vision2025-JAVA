package interfaceconcept;

interface Operation{
    final static float PI = 3.14f;
    float calculateArea(float radius, float height);
    float calculateVolume(float radius, float height);
}

class Cylinder implements Operation{

    @Override
    public float calculateArea(float radius, float height) {
        float area;
        area = 2 * PI * radius * (radius + height);
        return area;
    }

    @Override
    public float calculateVolume(float radius, float height) {
        float volume;
        volume = PI * radius * radius * height;
        return volume;
    }
}

public class Interface {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        float radius = 5.0f;
        float height = 10.0f;
        System.out.println("Area of the cylinder: " + cylinder.calculateArea(radius, height));
        System.out.println("Volume of the cylinder: " + cylinder.calculateVolume(radius, height));
    }
}
