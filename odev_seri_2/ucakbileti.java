import java.util.Scanner;
public class ucakbileti 
{
    public static void main(String[] args) 
    {
        double yascarpani;
        double secenekcarpani;
        boolean hata = false;
        System.out.println("Uçak bileti hesaplama programına hoşgeldiniz.");
        System.out.println("Lütfen yaşınızı giriniz.");
        Scanner input = new Scanner(System.in);
        int yas = input.nextInt();
        if (yas>0 && yas <120)
        {
            System.out.println("Kaç km gideceksiniz?");
            int mesafe = input.nextInt();
            if (mesafe<1 || mesafe >100000)
            {
                hata =true;
            }
            else
            {
                System.out.println("Lütfen tek yön için 1 gidiş dönüş için 2 tuşuna basınız.");
                int secenek = input.nextInt();                
                if (secenek ==1 || secenek ==2)
                {
                    if (secenek==1)
                    {
                        secenekcarpani =1;
                    }
                    else
                    {
                        secenekcarpani = 0.8;
                    }
                    if (yas <13)
                    {
                        yascarpani= 0.5;
                    }
                    else if (yas <24)
                    {
                        yascarpani = 1.8;
                    }
                    else if (yas >64)
                    {
                        yascarpani = 0.7;
                    }
                    else
                    {
                        yascarpani =1;
                    }
                        double fiyat = secenekcarpani*mesafe*(yascarpani)* 0.1;
                        System.out.println("Bilet fiyatınız : "+ fiyat);
                }
                else
                {
                 hata = true;
                }
            }
            input.close();
        }
        else
        {
            hata = true;
        }

        if (hata)
        {
            System.out.println("Geçersiz bir değer girdiniz.");
        }
    }
}
