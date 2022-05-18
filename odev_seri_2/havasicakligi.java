import java.util.Scanner;
public class havasicakligi {
    public static void main(String[] args) {
        System.out.println("Etkinlik önerme programına hoşgeldiniz.");
        System.out.println("Hava sıcaklığını giriniz.");
        Scanner input = new Scanner(System.in);
        double hava = input.nextDouble();
        if (hava <5)
        {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (hava>=5 && hava <10)
        {
            System.out.println("Sinema yapabilirsiniz.");
        }
        
        else if (hava>=10 && hava <15)
        {
            System.out.println("Sinema da yapabilirsiniz. Piknik de.");
        }
        else if (hava>=15 && hava <25)
        {
            System.out.println("Piknik yapabilirsiniz.");
        }
        else if (hava>=25 )
        {
            System.out.println("Yüzme yapabilirsiniz.");
        }
        input.close();
    }
}
