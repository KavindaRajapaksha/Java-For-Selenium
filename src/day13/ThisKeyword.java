package day13;

public class ThisKeyword {
    int x,y; //class variables/instance variables
    ThisKeyword(int x,int y){  //local variable
        this.x=x; //this key word use to define class variables inside the methods
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args){
        ThisKeyword th=new ThisKeyword(10,20);
        th.display();
    }
}
