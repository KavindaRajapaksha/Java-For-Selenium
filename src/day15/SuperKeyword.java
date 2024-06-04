package day15;
class Animal{
    String color="white";
    void eat(){
        System.out.println("Eating");
    }

}
class Dog extends Animal{
    String color=super.color;
    void displayColor(){
        System.out.println(color);
    }

    @Override
    void eat(){
//        super.eat();
        System.out.println("dog eating");
    }
}
public class SuperKeyword {
    //in calling child class object when we called to super class method at that moment we use super keyword

    public static void main(String[] args){
       Dog d1=new Dog();
       d1.displayColor();
       d1.eat();
    }
}
