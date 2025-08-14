package staticconcept;

public class StaticBlock {
    static{
        System.out.println("Static block executed first.");
    }
    int x = 10;
    static int y = 20;
    public StaticBlock(int x, int y){
        this.x = x;
        StaticBlock.y = y;
    }

    static void meth(int x){
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + StaticBlock.y);
    }

    public static void main(String[] args) {
        StaticBlock sb1 = new StaticBlock(10, 20);
        StaticBlock sb2 = new StaticBlock(30, 40);
        System.out.println("sb1.x: " + sb1.x + ", sb1.y: " + sb1.y);
        System.out.println("sb2.x: " + sb2.x + ", sb2.y: " + StaticBlock.y);
        System.out.println("Static variable y: " + y);
        StaticBlock.meth(50);
    }
}
