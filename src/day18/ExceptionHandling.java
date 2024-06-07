package day18;
import java.util.Scanner;
public class ExceptionHandling {

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=scanner.nextInt();

        try{
            System.out.println(100/num);
        }catch(ArithmeticException e){
            System.out.println("Invalid data");
        }


    }
}
