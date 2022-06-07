package odev4;
import java.util.Scanner;

public class fibowithrecursive {
    static int fibo(int n)
    {   
        if (n<=2)
        {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        System.out.print("Fibonacci basamağını giriniz: ");
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        System.out.println(fibo(number));
    }
    
}
