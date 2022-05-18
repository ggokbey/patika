package odev1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Not ortalaması programına hoşgeldiniz.");
        System.out.println("Ortalamanızı hesaplayabilmemiz için\nlütfen notlarınızı giriniz.");
        System.out.println("Müzik notunuzu giriniz");
        Scanner input = new Scanner(System.in);
        int muzik = input.nextInt();
        System.out.println("Tarih notunuzu giriniz");
        int tarih = input.nextInt();
        System.out.println("Matematik notunuzu giriniz");
        int mat = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        int turk = input.nextInt();
        System.out.println("Fizik notunuzu giriniz");
        int fizik = input.nextInt();
        double sonuc = (muzik+tarih+mat+turk+fizik)/5;
        boolean kosul1 = sonuc >60 ;
        String keke = kosul1 ? "Geçtiniz" : "Kaldınız"; 
        System.out.println(keke +" Çünkü not ortalamanız: "+ sonuc);
        input.close();
    }
}