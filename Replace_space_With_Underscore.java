import java.util.Scanner;
public class Replace_space_With_Underscore{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        String st = sc.nextLine();
        System.out.print(st.replace(" ","_")); 
    }
}