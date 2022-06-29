import java.util.Scanner;
public class Sum_of_first_Even_No{
    public static void main(String[]args){
        System.out.print("Entered the No.:");
        Scanner sc=new Scanner(System.in);
        int st=sc.nextInt();
        int x=0;
        int sum=0;
        int term;
            while(x<=st){
                     sum=sum+x;
                    x=x+2;
                }
                System.out.print(sum);
    }
}
