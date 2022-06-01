package odev3;
import java.util.Scanner;
public class sifre {
    public static void main(String[] args) {
        int sifre =123;
        System.out.print("Şifrenizi giriniz.");
        Scanner input = new Scanner(System.in);
        boolean durum = false;
        while (!durum)
        {
            int gir = input.nextInt();
            if (gir == sifre)
            {
                System.out.println("Giriş başarıyla sağlandı.");
                durum = true;
            }
            else
            {
                System.out.println("Tekrar deneyiniz.");
            }
        }
        input.close();
    }
}
