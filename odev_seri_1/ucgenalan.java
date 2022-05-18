package odev1;
import java.util.Scanner;
public class ucgenalan {
    public static void main(String[] args) {
        System.out.println("Üçgen alanı hesaplama programına hoşgeldiniz.");
        System.out.print("Lütfen dik kenarlardan herhangi birinin uzunluğunu girin:");
        Scanner input = new Scanner(System.in);
        int dikbir= input.nextInt();
        System.out.print("Lütfen ikinci dik kenarın uzunluğunu girin:");
        int dikiki = input.nextInt();
        double alan = dikbir * dikiki/2;
        System.out.println("Üçgen alanı: " + alan);
        input.close();
    }
    
}
