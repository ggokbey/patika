package odev1;
import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        System.out.println("Hipotenüs hesaplama programına hoşgeldiniz.");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen birinci dik açıyı girin:");
        double bir = input.nextDouble();
        System.out.print("Lütfen ikinci dik açıyı girin:");
        double iki = input.nextDouble();
        double hipo = Math.sqrt((bir*bir)+ (iki*iki));
        System.out.println("Hipotenüs uzunluğu:\t"+hipo);
        input.close();

        
    }
    
}
