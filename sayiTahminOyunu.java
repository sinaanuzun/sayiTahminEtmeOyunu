import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {

    public static void main(String[] args) {

        int puan = 0 , can = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("--Sayı Tahmin Etme oyununa hoşgeldiniz..");
        System.out.print("--Lütfen ismini yazınız :");
        String isim = scan.nextLine();

        System.out.println("---------------------------------------------------------");
        System.out.println("-------------------- Hoşgeldin "+ isim + " --------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("-Oyunumuzun amacı 1 ile 10 arasında sayı tahmin etmek. Toplam 5 hakkın var ");
        System.out.println("-Doğru bilirsen 1 can ve 10 puan kazanırsın");
        System.out.println("-Yanlış bilirsen bir canın azalır ve 0 olduğunda elenirsin");
        System.out.println("-Bol Şans "+ isim);
        System.out.println("---------------------------------------------------------");

        Random Rand = new Random();
        Scanner Scan = new Scanner(System.in);
        System.out.println("==Canınız :" + can );
        System.out.println("==Puanınız :" + puan);

        while(can>0) {
            int sayi = Rand.nextInt(10);
            System.out.println("**kopya**kopya**kopya**kopya**kopya**"+sayi+"**kopya**kopya**kopya**kopya**kopya:");
            System.out.print("Hadi sayıyı tahmin et :");
            int tahmin = scan.nextInt();
            System.out.println("\n----------------------------");

            if(tahmin==sayi) {
                System.out.println("**Bildiniz 10 puan kazandınız" + "\n==Puanınız :" + (puan + 10));
                puan = puan + 10;
                System.out.println("**Aynı zamanda 1 can kazandınız :" +"\n==Canınız :"+ (++can));
                if(puan == 40 || puan 	>=40) {
                    System.out.println("Tebrikler kazandınız");
                    System.out.println("Puanın :" + puan);
                    break;
                }
            }
            if(tahmin !=sayi) {

                System.out.println("**Yanlıs bildiniz puanınız 5 azalıcak " + "\n==Puanınız :" + (puan-5));
                puan = puan -5;
                System.out.println("**Canınınız 1 azalıcak " +"\n==Canınız :" + (--can));

                if(can==0) {
                    System.out.println("Elendin");
                    System.out.println("Puanın :" + puan);
                }
                if(tahmin > 10 || tahmin <0) {
                    System.out.println("Gecerli sayı gir");
                }
            }
        }

    }
}

