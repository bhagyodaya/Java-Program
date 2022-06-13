import java.util.Scanner;
public class User_Input{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1 No.:");
        int a= sc.nextInt();
        System.out.print("Enter 2 No.:");
        int b=sc.nextInt();
        System.out.print("Sum of two no:");
        System.out.print(a+b);
    }
}