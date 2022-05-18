package odev2;
import java.util.Scanner;
public class kullanicigiris {
    public static void main(String[] args) {
        String kayitliID ="gokbey";
        String kayitliSifre ="gokbey";
        System.out.println("Kullanıcı adınızı giriniz.");
        Scanner input = new Scanner(System.in);
        String id = input.nextLine();
        System.out.println("Şifrenizi giriniz.");
        String sifre = input.nextLine();
        if (id.equals(kayitliID) )
        {
            if( sifre.equals(kayitliSifre))
            {
            System.out.println("Giriş başarıyla sağlandı.");
            }
        }
        else 
        {
            System.out.println(id);
            System.out.println(sifre);
            System.out.println("Hatalı giriş yaptınız.");
            System.out.println("Şifrenizi sıfırlamak istiyorsanız lütfen 1 tuşuna basın.");
            int secenek = input.nextInt();
            if (secenek == 1)
            {
                System.out.println("Lütfen oluşturmak istediğiniz şifreyi girin.");
                Scanner inp = new Scanner(System.in);
                String yenisifre = inp.nextLine();
                if(yenisifre.equals(kayitliSifre) || yenisifre.equals(sifre))
                {
                    System.out.println("Oluşturmak istediğiniz şifre eski şifrenizle\nveya girdiğiniz şifre ile aynı olamaz.\nLütfen tekrar deneyiniz.");
                }
                else
                {
                    System.out.println("Şifreniz değiştirildi. Lütfen tekrar giriş yapınız.");
                    kayitliSifre = yenisifre;
               }
               inp.close();
            }
            else
            {
                System.out.println("Şifrenizi hatırlayınca tekrar uğrayın. :)");
            }
        }
        input.close();

    }
    
}
