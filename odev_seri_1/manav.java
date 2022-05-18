package odev1;
import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 5.95, patlican =5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız?");
        double armutkilo = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız?");
        double elmakilo = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız?");
        double domateskilo = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız?");
        double muzkilo = input.nextDouble();
        System.out.print("Kaç kilo patlican aldınız?");
        double patlicankilo = input.nextDouble();
        double armutucret = armut*armutkilo;
        double elmaucret =elma*elmakilo;
        double domatesucret = domates*domateskilo;
        double muzucret = muz*muzkilo;
        double patlicanucret = patlican*patlicankilo;
        double ucret = armut*armutkilo+ elma*elmakilo +domates*domateskilo+muz*muzkilo+patlican*patlicankilo;
        System.out.println("Toplam ücret:" +ucret );
        System.out.println(armutkilo +"Kilo armut ücreti :" +armutucret);
        System.out.println(elmakilo +"Kilo elma ücreti :" +elmaucret);
        System.out.println(domateskilo +"Kilo domates ücreti :" +domatesucret);
        System.out.println(muzkilo +"Kilo muz ücreti :" +muzucret);
        System.out.println(patlicankilo +"Kilo patlican ücreti :" +patlicanucret);
        input.close();

        
    }
}
