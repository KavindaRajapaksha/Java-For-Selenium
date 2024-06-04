package day16;

public class C1 implements I1,I2 {
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }
    public static void main(String[] args){
        C1 ex=new C1();
       ex.m1();
       ex.m2();

       I1 ex2=new C1();
       ex2.m1();

       I2 ex3=new C1();
       ex3.m2();
    }
}
