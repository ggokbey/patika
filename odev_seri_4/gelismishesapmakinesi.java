package odev4;
import java.util.Scanner;

public class gelismishesapmakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap makinesine hoşgeldiniz.");
        int dongu=1;
        while(dongu ==1)
        {
            System.out.print("\n"+
            "1-)Toplama işlemi\n"+
            "2-)Çıkarma İşlemi\n"+
            "3-)Çarpma İşlemi\n"+
            "4-)Bölme İşlemi\n"+
            "5-)Üslü Sayı hesaplama\n"+
            "6-)Mod Alma\n"+
            "7-)Dikdörtgen Alan ve Çevresi hesaplama\n"+
            "0-)Çıkış Yap\n"+
            "Lütfen yapmak istediğiniz işlemi seçin : "); 
            Scanner input = new Scanner(System.in);
            int menu =input.nextInt();
            if (menu<1 || menu >7)
            {
                System.out.println("Çıkış yapılıyor.");
                dongu=0;
            }
            else
            {
                System.out.print("Lütfen ilk sayıyı giriniz :");
                int sayibir=input.nextInt();
                System.out.print("İkinci sayıyı giriniz :");
                int sayiiki = input.nextInt();
                switch(menu)
                {
                    case 1:
                        topla(sayibir,sayiiki);
                        break;
                    case 2:
                        cikart(sayibir,sayiiki);
                        break;
                    case 3:
                        carp(sayibir,sayiiki);
                        break;
                    case 4:
                        bol(sayibir,sayiiki);
                        break;
                    case 5:
                        ushesapla(sayibir,sayiiki);
                        break;
                    case 6:
                        modal(sayibir,sayiiki);
                        break;
                    case 7:
                        dikhesap(sayibir,sayiiki);
                }
                input.close();
            }
        }
    }
    static int topla(int a,int b)
    {
        int sonuc = a+b;
        System.out.println("Sonuç ="+ sonuc);
        return sonuc;
    }
    static int cikart(int a,int b)
    {
        int sonuc = a-b;
        System.out.println("Sonuç ="+ sonuc);
        return sonuc;
    }
    static int carp(int a,int b)
    {
        int sonuc = a*b;
        System.out.println("Sonuç ="+ sonuc);
        return sonuc;
    }
    static int bol(int a,int b)
    {
        if (b==0)
        {
            System.out.println("Sıfıra bölünemez.");
            return 0;
        }
        else
        {        
            int sonuc = a/b;
            System.out.println("Sonuç ="+ sonuc);
            return sonuc;
        }
    }
    static int ushesapla(int a,int b)
    {
        int sonuc = 1;
        int temp = a;
        for (int i=1;i<b;i++)
        {
            a =a*temp;
        }
        sonuc = a;
        System.out.println("Sonuç ="+ sonuc);
        return sonuc;
    }
    static int modal(int a,int b)
    {
        int sonuc = a%b;
        System.out.println("Sonuç ="+ sonuc);
        return sonuc;
    }
    static int dikhesap(int a,int b)
    {
        int sonuc = a*b;
        int cevre = (a+b)*2;
        System.out.println("Dikdörtgen alanı ="+ sonuc+ " metrekare");
        System.out.println("Dikdörtgen çevresi ="+cevre+" cm");
        return sonuc;
    }
}
