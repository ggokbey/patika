package odev3;

import java.util.Scanner;
public class teksayitoplam 
{
    public static void main(String[] args) 
    {
        int sayi;int toplam =0;
        System.out.println("Bir sayı giriniz.");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        while(sayi >0)
        {
            if (sayi%2 ==1)
            {
                toplam +=sayi;

            }
            System.out.println("Bir sayı giriniz.");
            sayi = input.nextInt();

        }
        System.out.println("Toplam:" +toplam);
        input.close();
        

    }

    
}
