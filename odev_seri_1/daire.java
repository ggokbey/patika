package odev1;
import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        System.out.println("Merkez açı ölçüsünün alanını hesaplama programına hoşgeldiniz.");
        System.out.println("Lütfen dairenin yarıçapını giriniz.");
        Scanner input = new Scanner(System.in);
        double yaricap = input.nextDouble();
        System.out.println("Lütfen merkez açı ölçüsünü giriniz.");
        double merkezaci= input.nextDouble();
        double pi = 3.14;
        double alan = pi* yaricap*yaricap;
        double cevre = 2*pi*yaricap;
        double olcu = pi* yaricap*yaricap*(merkezaci/360);
        System.out.println("Dairenin Alanı : " +alan);
        System.out.println("Dairenin Çevresi : " +cevre);
        System.out.println("Dairenin merkez açı alanı : "+ olcu);
        input.close();
        
    }
    
}
