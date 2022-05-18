package odev1;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        System.out.println("Taksimetre hesaplama programına hoşgeldiniz.");
        System.out.println("Lütfen gidilen mesafeyi giriniz.");
        Scanner input = new Scanner(System.in);
        int kilometre = input.nextInt();
        int acilis = 10;
        double ucret = 2.2;
        double hesap = acilis+ (kilometre*ucret);
        boolean kosul = acilis + kilometre*ucret >= 20;
        double sonucret = kosul ? hesap:20;
        System.out.println(sonucret);
        input.close();

        
    }
    
}
