package day13;

public class StaticDemo {
    static int a=10;
    static String s="Kavinda";
    int b=20;
    static void m1(){
        System.out.println("this is static method");
    }
    void m2(){
        System.out.println("this is non static method ");
    }

//    public static void main(String[] args){
//        //static method can directly access static method and variables
//        m1();
//        System.out.println(a);
//        StaticDemo sd=new StaticDemo();
//        sd.m2();
//    }
}
