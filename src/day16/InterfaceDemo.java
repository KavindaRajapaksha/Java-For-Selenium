package day16;

interface Shape{
    int length=60;
    int width=79;//final and static attributes

    void squre(); //abstract method

    default void display(){
        System.out.println("this is display method");
    }
    static void display2(){
        System.out.println("static methods also allowed");
    }

}








public class InterfaceDemo implements Shape {
    public void squre(){
        System.out.println("this is squre");
    }
    public static void main(String[] args){
        InterfaceDemo obj=new InterfaceDemo();
        obj.display();
        obj.squre();
        Shape.display2(); //static methods can directly access from the interface

        Shape sh=new InterfaceDemo();
        ///interface variable can assign the child class object
      sh.display();
      sh.squre();
    }
}
