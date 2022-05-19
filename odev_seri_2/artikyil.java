import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        System.out.println("Artık yıl hesaplama programına hoşgeldiniz.");
        System.out.println("Lütfen yılı giriniz.");
        Scanner input = new Scanner(System.in);
        int yil = input.nextInt();
        if (yil>0)
        {
            if (yil%4==0)
            {
                if (yil%100== 0)
                {
                    if (yil%400 == 0)
                    {
                        System.out.println(yil+" Artık bir yıl!");
                    }
                    else
                    {
                        System.out.println(yil+" Artık bir yıl değil!");
                    }
                }
                else
                {
                    System.out.println(yil+" Artık bir yıl!");
                }
            }
            else
            {
                System.out.println(yil+" Artık bir yıl değil!");
            }
        }
        else
        {
            System.out.println("Hatalı bir değer girdiniz.");
        }
        input.close();
    }
}
