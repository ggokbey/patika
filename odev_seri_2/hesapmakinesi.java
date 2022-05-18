package odev2;
import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap makinesine hoşgeldiniz.");
        System.out.print("İlk değeri girin.");
        
        Scanner input = new Scanner(System.in);
        int ilksayi = input.nextInt();

        System.out.print("İkinci sayıyı giriniz.");
        int ikincisayi = input.nextInt();

        System.out.println("Toplama işlemi için 1 tuşuna\nÇıkartma işlemi için 2 tuşuna\nÇarpma işlemi için 3 tuşuna\nBölme işlemi için 4 tuşuna basınız.");
        int islem = input.nextInt();
        switch(islem)
            {
                case 1:
                int toplam = ilksayi+ ikincisayi;
                System.out.println(ilksayi+" ile "+ikincisayi+" sayilarının toplamı: "+toplam);
                break;
                case 2:
                int cikart = ilksayi+ ikincisayi;
                System.out.println(ilksayi+" ile "+ikincisayi+" sayilarının farkı: "+cikart);
                break;
                case 3:
                int carpim = ilksayi+ ikincisayi;
                System.out.println(ilksayi+" ile "+ikincisayi+" sayilarının çarpımı: "+carpim);
                break;
                case 4:
                    switch(ikincisayi){
                        case 0:
                        System.out.println("Sayılar sıfıra bölünemez. Lütfen değerli bir seçim giriniz.");
                        break;
                        default:
                        int bolum = ilksayi/ikincisayi;
                        System.out.println(ilksayi+" sayısının "+ikincisayi+" sayısına bölümü "+bolum);
                    }
                break;
                default:
                System.out.println("Hatalı bir tuş girdiniz.");


            }
        input.close();

    }
}
