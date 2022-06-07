package odev4;
import java.util.Scanner;
public class usalwithreco {
    public static void main(String[] args) {
        System.out.print("Lütfen üst alınacak sayıyı giriniz :");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.print("Lütfen üssü giriniz: ");
        int us = input.nextInt();
        ustal(n, us);
        input.close();
        
    }
    static int result=1;
    static int ustal(int a,int b)
    {
        if (b==0)
        {
            System.out.println("Sonuç :" +result);
            return result;
        }
        result*=a;
            ustal(a, b-1);
        return result;

    }
}
