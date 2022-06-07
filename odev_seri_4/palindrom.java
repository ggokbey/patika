package odev4;
import java.util.Scanner;
public class palindrom {
    static int palind(int n)
    {
        int temp=n, tersN=0, sonN=0;
        while(temp!=0)
        {
            sonN=temp%10;
            tersN= (tersN*10)+sonN;
            temp=temp/10;

        }
        if(tersN==n)
        {
            System.out.println(n+" sayisi palindromdur.");
        }
        else
        {
            System.out.println(n+" sayisi palindrom değildir.");
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Palindrom bulma programına hoşgeldiniz.");
        System.out.print("Lütfen sayıyı girin: ");
        Scanner input =new Scanner(System.in);
        int k = input.nextInt();
        palind(k);
        input.close();
    }
    
}
