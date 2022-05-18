import java.util.Scanner;
public class sinifgecme {
    public static void main(String[] args) {
        System.out.println("Not ortalaması programına hoşgeldiniz.");
        System.out.println("Lütfen Matematik notunuzu giriniz.");
        Scanner input = new Scanner(System.in);
        double mat = input.nextDouble();
        
        double toplam = 0;
        int ders = 0;
        if (mat <0 || mat>100 )
        {
            System.out.println("Matematik notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+mat;
            ders +=1;
        }

        System.out.println("Türkçe notunuzu giriniz.");
        double turkce = input.nextDouble();
        if (turkce <0 || turkce>100 )
        {
            System.out.println("Türkçe notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+turkce;
            ders +=1;
        }

        System.out.println("Fizik notunuzu giriniz.");
        double fizik = input.nextDouble();
        if (fizik <0 || fizik>100 )
        {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+fizik;
            ders +=1;
        }

        System.out.println("Kimya notunuzu giriniz.");
        double kimya = input.nextDouble();
        if (kimya <0 || kimya>100 )
        {
            System.out.println("Kimya notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+kimya;
            ders +=1;
        }

        System.out.println("Biyoloji notunuzu giriniz.");
        double biyo = input.nextDouble();
        if (biyo <0 || biyo>100 )
        {
            System.out.println("Biyoloji notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+biyo;
            ders +=1;
        }
        input.close();

        if (ders<1)
        {
            System.out.println("En az 1 ders ortalamasını doğru şekilde girmelisiniz.");
        }
        else
        {
            double sonuc = toplam/ders;
            if (sonuc <55)
            {
                System.out.println("Not ortalamanız "+sonuc+" olduğundan sınıfı geçemediniz!");
            }
            else{
                System.out.println("Tebrikler! Not ortalamanız "+sonuc+" ve sınıfı geçtiniz.");
            }
            
        }

    }
}
