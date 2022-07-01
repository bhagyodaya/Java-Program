import java.util.Scanner;
public class Fibonacci_Series{
    public static void main(String[]args){
        System.out.print("How many elements to print of fiboncci series:");
        Scanner st=new Scanner(System.in);
        int sc= st.nextInt();
        int x,d1=0,d2=1,d3=0,d4=1;
            while(d4<=(sc-2)){
                    d3=d1+d2;
                    System.out.print(d3+" ");
                    d1=d2;
                    d2=d3;
                    d4++;
                }
    }
}