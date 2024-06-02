package day12;

public class Box {
    double width,height,depth;
    Box(){
        width=height=depth=0;
    }
    Box(double a,double b,double c){
        width=a;
        height=b;
        depth=c;
    }
    Box(double length){
        width=height=depth=length;
    }
    double volume(){
        return width*height*depth;
    }
    //overloading is related with polymorphism when polymorphism we use method and constructor overloading

}
