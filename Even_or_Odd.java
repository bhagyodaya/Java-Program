import java.util.Scanner;
public class Even_or_Odd{
    public static void main(String[] args){
        System.out.print("Enter the No.:");
        Scanner sc= new Scanner(System.in);
        int st=sc.nextInt();
        if (st%2==0){
            System.out.print("Entered No. is Even");
        }
        else{
            System.out.print("Entered No. is Odd");
        }
    }
}