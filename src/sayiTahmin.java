import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {
    public static void main(String[] args) {

        Random rand = new Random();
        int rastgeleSayi = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int sayi;
        int[] degerler = new int[5];
        int kalanHak=5;
        int aralikHak=0;
        int sayac=0;

        System.out.println(rastgeleSayi);
        while (kalanHak!=0) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            sayi = input.nextInt();

            if (sayi < 0 || sayi > 99) {
                System.out.println("");
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (aralikHak==0) {
                    System.out.println("");
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                    System.out.println("");
                    aralikHak=1;
                }
                else if (aralikHak==1) {
                    System.out.println("");
                    kalanHak--;
                    System.out.println("Hatalı giriş yaptınız! Kalan hakkınız : "+kalanHak);
                    System.out.println("");
                }
            }

            else {
                if (sayi == rastgeleSayi) {
                    degerler[sayac] = sayi;
                    System.out.println("");
                    System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + rastgeleSayi);
                    System.out.println("Tahminleriniz : " + Arrays.toString(degerler));
                    kalanHak=0;
                } else if (sayi < rastgeleSayi) {
                    kalanHak--;
                    System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür.");
                    System.out.println("Kalan hakkınız : " + kalanHak);
                    degerler[sayac] = sayi;
                    sayac++;
                } else if (sayi > rastgeleSayi) {
                    kalanHak--;
                    System.out.println("Girdiğiniz sayı gizli sayıdan büyüktür.");
                    System.out.println("Kalan hakkınız : " + kalanHak);
                    degerler[sayac] = sayi;
                    sayac++;
                }
                else if (kalanHak==0) {
                    System.out.println("Hakkınız kalmadı, kaybettiniz!");
                    System.out.println("Gizli sayı : " + rastgeleSayi);
                    System.out.println("Tahminleriniz : " + Arrays.toString(degerler));
                }
            }
        }
    }
}
