import java.util.Scanner;
public class burcumusoyle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı sayı olarak girin.");
        int ay = input.nextInt();
        if (ay <1 || ay >12)
        {
            System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
            
        }
        else
        {
            System.out.println("Lütfen doğduğunuz günü girin.");
            int gun = input.nextInt();
            if (gun <0 || gun >31)
            {
                System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
            }
            else
            {
                if (ay ==1)
                {
                    if(gun <22)
                    {
                        System.out.println("Oğlak burcusunuz");
                    }
                    else if (gun<32)
                    {
                        System.out.println("Kova burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==2)
                {
                    if(gun <20)
                    {
                        System.out.println("Kova burcusunuz");
                    }
                    else if (gun<29)
                    {
                        System.out.println("Balık burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==3)
                {
                    if(gun <21)
                    {
                        System.out.println("Balık burcusunuz");
                    }
                    else if (gun<32)
                    {
                        System.out.println("Koç burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==4)
                {
                    if(gun <21)
                    {
                        System.out.println("Koç burcusunuz");
                    }
                    else if (gun<31)
                    {
                        System.out.println("Boğa burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==5)
                {
                    if(gun <22)
                    {
                        System.out.println("Boğa burcusunuz");
                    }
                    else if (gun<32)
                    {
                        System.out.println("İkizler burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==6)
                {
                    if(gun <23)
                    {
                        System.out.println("ikizler burcusunuz");
                    }
                    else if (gun<31)
                    {
                        System.out.println("Yengeç burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==7)
                {
                    if(gun <23)
                    {
                        System.out.println("Yengeç burcusunuz");
                    }
                    else if (gun<32)
                    {
                        System.out.println("Aslan burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==8)
                {
                    if(gun <23)
                    {
                        System.out.println("Aslan burcusunuz");
                    }
                    else if (gun<32)
                    {
                        System.out.println("Başak burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==9)
                {
                    if(gun <23)
                    {
                        System.out.println("Başak burcusunuz");
                    }
                    else if (gun<31)
                    {
                        System.out.println("Terazi burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==10)
                {
                    if(gun <23)
                    {
                        System.out.println("Terazi burcusunuz");
                    }
                    else if (gun<32)
                    {
                        System.out.println("Akrep burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==11)
                {
                    if(gun <22)
                    {
                        System.out.println("Akrep burcusunuz");
                    }
                    else if (gun<31)
                    {
                        System.out.println("Yay burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else if (ay ==12)
                {
                    if(gun <22)
                    {
                        System.out.println("Yay burcusunuz");
                    }
                    else if (gun<32)
                    {
                        System.out.println("Oğlak burcusunuz");
                    }
                    else
                    {
                        System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                    }
                }
                else
                {
                    System.out.println ("Geçersiz değer girdiğiniz için burcunuz hesaplanamadı."); 
                }

            }
        }
        input.close();
    }
}
