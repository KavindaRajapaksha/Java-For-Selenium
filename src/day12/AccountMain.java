package day12;

public class AccountMain {
    public static void main(String[] args){
        Account acc=new Account();
        acc.setAccNo(101);
        System.out.println(acc.getAccNo());

        acc.setName("Kavinda");
        System.out.println(acc.getName());

        acc.setAmount(1000);
        System.out.println(acc.getAmount());


    }
}
