import java.util.Scanner;
public class kucukbuyuk {
    public static void main(String[] args) {
        System.out.println("3 sayı sıralama programına hoşgeldiniz.");
        System.out.println("Lütfen sıralanacak olan ilk sayıyı giriniz.");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz.");
        double b = input.nextDouble();
        System.out.println("Üçüncü sayıyı giriniz.");
        double c = input.nextDouble();
        if (a <= 0 || a >0 && b <= 0 || b >0 && c <= 0 || c >0) // girilen değerler bir sayı mı? 
        {
            if (a ==b && a ==c)
            {
                System.out.println("Tüm sayılar birbirine eşit.");
            }
            else if (a > b && a > c)
            {
                if (b >c && b !=c)
                {
                    System.out.println(a +" > " + b +" > "+ c );
                }
                else if (b==c)
                {
                    System.out.println(a+">"+b+"="+c);
                }
                else
                {
                    System.out.println(a +">"+c+">"+b );
                }
            }
            else if (b > a && b > c)
            {
                if (a >c && a !=c)
                {
                    System.out.println(b +" > " + a +" > "+ c );
                }
                else if (a==c)
                {
                    System.out.println(b+">"+a+"="+c);
                }
                else
                {
                    System.out.println(b +">"+c+">"+a );
                }

            }
            else if (c > a && c > b)
            {
                if (a >b && a !=b)
                {
                    System.out.println(c +" > " + a +" > "+ b );
                }
                else if (a==b)
                {
                    System.out.println(c+">"+a+"="+b);
                }
                else
                {
                    System.out.println(c +">"+b+">"+a );
                }

            }
        }
        else
        {
            System.out.println("Lütfen geçerli bir değer giriniz.");
        }
        input.close();
    }
}
