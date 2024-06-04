package day15;

class Bank{
    double roi(){
        return 0;
    }
}

class Peoples extends Bank{
    @Override
    double roi() {
        return 10.5;
    }
}
class Ceylon extends Bank{
    @Override
    double roi() {
        return 11.5;
    }
}



//overriding use only when using inheritance
 //in overriding we are not change the declaration only change the implementation
//but in overloading we change the declaration
//common thing is  we are not change the name of the method



public class OverridingDemo  {
    public static void main(String[] args){
       Peoples a1=new Peoples();
        System.out.println(a1.roi());
    }
}
