package odev4;
import java.util.Scanner;
public class asalwithreco {
    public static void main(String[] args) {
        System.out.println("--Asal sayı bulma programı--");
        System.out.print("Lütfen sayıyı giriniz :");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        ustu(sayi,2);
        input.close();

    }
    static int ustu(int a,int b)
    {
        if (a<2)
        {
            System.out.println("Asal sayılar 2'den küçük olamaz.");
            return 1;
        }
        if (b==a/2+1)
        {
            System.out.println(a+" sayisi asal sayıdır.");
            return 1;
        }
        else
        {
            if (a%b==0)
            {
                System.out.println(a+" sayisi asal değildir!");
                return a;
            }
            else
            {
                ustu(a, b+1);
            }
            return a;  
        }

    }
}
