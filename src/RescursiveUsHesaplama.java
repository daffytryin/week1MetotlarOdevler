
import java.util.Scanner;


public class RescursiveUsHesaplama {
    static int UsHesapla(int x, int y) {
        int total = 1, p = 1;
        if(y==0)
            return total;
        else if (x==1)
            return 1;
        return x*UsHesapla(x, (y-1));
    }

    public static void main(String[] args) {
        int taban, us, sonuc;

        do {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı giriniz :");
        taban = input.nextInt();
        System.out.print("Üssü giriniz :");
        us = input.nextInt();
        System.out.println("Sonuç : " +UsHesapla(taban,us)); }
        while(true);

    }

}
