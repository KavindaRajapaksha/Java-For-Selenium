package day14;

class Parent{
    int a=10;
    void display(){
        System.out.println(a);
    }
}

class Child1 extends Parent{
    int b=100 ;
    void show(){
        System.out.println(b);
    }
}
class Child2 extends Child1{
    int c=1002;

    void number(){
        System.out.println(c);
    }
}//hierarchy  inheritance


class Parent2{
    int num=328;
    void helloSomeone(){
        System.out.println("Hello world!! "+num+"times");
    }
}






public class InheritanceRypes {
    public static void main(String[] args){
       Child1 c1=new Child1();
       c1.display();
       c1.show();
       Child2 c2=new Child2();
       c2.number();
       c2.display();
       c2.show();;
    }
}
