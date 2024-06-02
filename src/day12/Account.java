package day12;

public class Account {
    //encapsulation
    //all attributes are in private
    private int accNo;
    private String name;
    private double amount;

    //every attribute has getter and setter
    public void setAccNo(int accNo){
        this.accNo=accNo;
    }
    public int getAccNo(){
        return accNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }



}
