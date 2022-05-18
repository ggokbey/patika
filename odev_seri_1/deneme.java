package odev1;
import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        // hesap makinesi
        System.out.println("işlem yapılacak ilk sayıyı girin.");
        Scanner input = new Scanner(System.in);
        int ilkdeger = input.nextInt();
        System.out.println("ikinci sayıyı girin.");
        int ikincideger = input.nextInt();
        System.out.println("Çarpmak için 1 tuşuna\n bölmek için 2 tuşuna \n toplamak için 3 tuşuna \n çıkarmak için 4 tuşuna basın.");
        int islem = input.nextInt();
        if (islem ==1)
        {
            int sonuc = ilkdeger*ikincideger;
            System.out.println(sonuc);
        
        }
        else if(islem ==2)
        {
            int sonuc = ilkdeger/ikincideger;
            System.out.println(sonuc);  
        }
        else if(islem ==3)
        {
            int sonuc = ilkdeger+ikincideger;
            System.out.println(sonuc);  
        }
        else if(islem ==4)
        {
            int sonuc = ilkdeger-ikincideger;
            System.out.println(sonuc);  
        }
        input.close();
    }
}
