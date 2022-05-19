import java.util.Scanner;;
public class cinzodyagi {
    public static void main(String[] args) {
        String zodyak;
        System.out.println("Çin zodyağı hesaplama programına hoşgeldiniz.");
        System.out.println("Lütfen doğum yılınızı girin.");
        Scanner input = new Scanner(System.in);
        int yil = input.nextInt();
        if (yil<1900 && yil >2022)
        {
            System.out.println("Hatalı bir değer girdiniz.");

        }
        else
        {
            int islem = yil%12;
            switch(islem)
            {
                case 0:
                    zodyak ="Maymun";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 1:
                    zodyak ="Horoz";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 2:
                    zodyak ="Köpek";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                    break;
                case 3:
                    zodyak ="Domuz";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 4:
                    zodyak ="Fare";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 5:
                    zodyak ="Öküz";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 6:
                    zodyak ="Kaplan";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 7:
                    zodyak ="Tavşan";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 8:
                    zodyak ="Ejderha";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 9:
                    zodyak ="Yılan";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 10:
                    zodyak ="At";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
                case 11:
                    zodyak ="Koyun";
                    System.out.println("Çin Zodyağı burcunuz :"+ zodyak);
                break;
            }
        }
        input.close();
    }
}
