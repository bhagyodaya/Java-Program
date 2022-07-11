import java.util.Scanner;
public class FACTORIAL_OF_NO{
    public static void main(String[]args){
        System.out.print("Enter the Number:");
        Scanner st=new Scanner(System.in);
        int sc=st.nextInt();
        int c=1;
        for(int i=1;i<=sc;i++){
            c=c*i;
        }
        System.out.print(c);
    }
}