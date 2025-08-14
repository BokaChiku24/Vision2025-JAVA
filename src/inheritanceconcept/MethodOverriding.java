package inheritanceconcept;

class Base{
    int i;
    Base(int i){
        this.i = i;
    }
    void display(){
        System.out.println("Base class display method: " + i);
    }
    void show(){
        System.out.println("Base class show method");
    }
}

class Derived extends Base{
    int j;
    Derived(int i, int j){
        super(i);
        this.j = j;
    }
    void display(){
        System.out.println("Derived class display method: " + i + ", " + j);
        super.display();
    }
    void show(){
        System.out.println("Derived class show method");
        super.show();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Base obj = new Base(5);
        obj.display();
        obj.show();
        Derived obj1 = new Derived(10, 20);
        obj1.display();
        obj1.show();
    }

}
