package odev3;
import java.util.Scanner;

public class ciftsayibul {
    public static void main(String[] args) {
        System.out.println("Çift sayı bulma programı");
        System.out.println("Bir değer giriniz.");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        /*if (sayi<2)
        {
            System.out.println("Hiç bir değer bulunamadı.");
        }
        else
        {
            int deger =2;
            while(deger<sayi)
            {
                System.out.println(deger+" bir çift  sayıdır.");
                deger +=2;
            }
        }
        */
        for(int fordeger=2;fordeger<sayi;fordeger+=2)
        {
            System.out.println(fordeger+" bir çift  sayıdır.");
        }

        input.close();
    }
}
