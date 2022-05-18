package odev1;
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        System.out.println("KDV hesaplama programına hoşgeldiniz.");
        System.out.println("Lütfen ürün fiyatını giriniz.");
        Scanner inp = new Scanner(System.in);
        double urun = inp.nextDouble();
        boolean birbin = urun >= 1000;
        int sontutar = birbin ? 8:18;
        double toplamKDV = urun*sontutar/100;
        double kdvliFiyat = urun+toplamKDV;
        System.out.println("Ürün fiyatı: " +urun);
        System.out.println("Ürünün KDV'li fiyatı:\t" + kdvliFiyat);
        System.out.println("Ödemeniz gereken KDV tutarı:\t " +toplamKDV);
        inp.close();

    }
}
