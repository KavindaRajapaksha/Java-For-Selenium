package day17;

public class AccessModifiersTest {
    private int x=100;
    protected int y=299;
    void m1(){
        System.out.println("number is : "+x);
    }
    protected void m2(){
        System.out.println("second number : "+y);
    }
}
