package day13;

public class StaticMain {
        public static void main(String[] args){
        //static method can directly access static method and variables
        StaticDemo.m1();
        System.out.println(StaticDemo.s.length());

        System.out.println(StaticDemo.a);
        StaticDemo sd=new StaticDemo();
        sd.m2();
    }
}
