package _10_List.Manav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mgilgi {

    static double toplamOdeme;
    static double urunToplam;
    static String secim;
    static int miktarSecim;
    static String alinanUrunler = "";
    static double urunKilosu = 0;


    static Scanner scan = new Scanner(System.in);

    static ArrayList<String> urunler = new ArrayList<>(Arrays.asList(
            "domat - urun kodu : 1", "elma - urun kodu : 2", "muz - urun kodu : 3",
            "biber - urun kodu : 4", "balcan - urun kodu : 5", "Cikmak icin : 0"));
    static ArrayList<Double> fiyatlar = new ArrayList<>(Arrays.asList(
            5.0, 7.5, 1.3, 8.7, 9.2));
    static ArrayList<Double> miktar = new ArrayList<>(Arrays.asList(
            0.5, 1.0, 1.25, 1.5, 2.0));
    // static <urunler, fiyatlar> void urunHesaplama(urunler, fiyatlar)

    static ArrayList<Double> kiloMiktar = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0));
    //index e gore kilo eklemesi yapilacak orn elma ilk index

    static void urunHesaplama(int mSecim, ArrayList<String> urunler) throws InterruptedException {


        if (mSecim <= 0 || mSecim > 5) {
            if (mSecim == 0) {
                System.out.println("Aaaa bir sey almadan mi gidiyorsun bi siftagimiz olsaydi");
                if (urunToplam > 0) { //eger urun seciminde cikmak istenirse direk kasa methodundan fis yazilir
                    kasa();
                }
            } else {
                System.out.print("satin almak icin urun kodunu girin: ");
                urunHesaplama(scan.nextInt(), urunler); //urunHesaplama methodundan scan edilen deger urunler ile aliniyor
                //hatali index girdigi olursa tekrar gir der else i var
            }
        } else {
            System.out.println("mikrar icin index girin luften : " + "\n0.5 kg= [1]" +
                    "\n1.0 kg= [2]\n1.25kg= [3]\n1.5 kg= [4]\n2.0 kg= [5]");
            miktarSecim = scan.nextInt(); //alinan scan, miktar secimine esaign = ediliyor
            switch (mSecim) {

                case 1: //miktar array inden indexi gettir yani miktar secimin bir eksigi ve
                    // urunun fiyatlarinin degerininle carp ve bunu toplama ekleme
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    alinanUrunler += urunler.get(mSecim - 1); //urunu eklemek icin fis e ekleniyor
                    urunKilosu += miktar.get(miktarSecim - 1);//alinan urunun kiosu icin fis e ekleniyor
                    //................urunkilosu1 diye konteyner objesi olustur
                    // kiloMiktar.add(mSecim - 1, miktar.get(miktarSecim - 1));
                    kiloMiktar.add(mSecim - 1, urunKilosu);
                    System.out.println("Alinan Urun " + alinanUrunler + " *** " + kiloMiktar.get(mSecim - 1) + "Kg ");
                    System.out.println("Alinan Urun " + alinanUrunler + " *** " + urunKilosu + "Kg " + "Toplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");

                    secim = scan.next(); //devammi dan alinan scan secim e esign ediliyor
                    secim();
                    urunKilosu = 0;
                    break;

                case 2:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    alinanUrunler += urunler.get(mSecim - 1); //urunu eklemek icin fis e ekleniyor
                    urunKilosu += miktar.get(miktarSecim - 1);//alinan urunun kiosu icin fis e ekleniyor
                    //................urunkilosu1 diye konteyner objesi olustur
                    // kiloMiktar.add(mSecim - 1, miktar.get(miktarSecim - 1));
                    kiloMiktar.add(mSecim - 1, urunKilosu);
                    System.out.println("Alinan Urun " + alinanUrunler + " *** " + kiloMiktar.get(mSecim - 1) + "Kg ");
                    System.out.println("Alinan Urun " + alinanUrunler + " *** " + urunKilosu + "Kg " + "Toplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");

                    secim = scan.next(); //devammi dan alinan scan secim e esign ediliyor
                    secim();
                    urunKilosu = 0;
                    break;

                case 3:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    System.out.println("urunToplam = " + urunToplam + "TL\n\t Kasa mi: Q\n\tDevan mi: C");
                    secim = scan.next();
                    alinanUrunler += urunler.get(mSecim - 1); //urunu fis ekleme
                    urunKilosu += miktar.get(miktarSecim - 1);
                    System.out.println("alinan urun" + alinanUrunler + "kilo " + urunKilosu);
                    secim();
                    break;

                case 4:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    System.out.println("urunToplam = " + urunToplam + "TL\n\t Kasa mi: Q\n\tDevan mi: C");
                    secim = scan.next();
                    alinanUrunler += urunler.get(mSecim - 1); //urunu fis ekleme
                    urunKilosu += miktar.get(miktarSecim - 1);
                    System.out.println("alinan urun" + alinanUrunler + "kilo " + urunKilosu);
                    secim();
                    break;

                case 5:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    System.out.println("urunToplam = " + urunToplam + "TL\n\t Kasa mi: Q\n\tDevan mi: C");
                    secim = scan.next();
                    alinanUrunler += urunler.get(mSecim - 1); //urunu fis ekleme
                    urunKilosu += miktar.get(miktarSecim - 1);
                    System.out.println("alinan urun" + alinanUrunler + "kilo " + urunKilosu);
                    secim();
                    break;

                case 0:
                    //0 girildiginde miktar soruyor
                    kasa();
                    break;

            }
        }


    }

    protected static void kasa() throws InterruptedException {
        toplamOdeme += urunToplam;
        System.out.print("*");
        Thread.sleep(1000);
        System.out.print("**");
        Thread.sleep(1000);
        System.out.print("***");
        Thread.sleep(1000);
        System.out.print("****");
        Thread.sleep(1000);
        System.out.print("******\n");
        Thread.sleep(1000);
 System.out.print("*****");
        Thread.sleep(1000);
 System.out.print(" F");
        Thread.sleep(900);
 System.out.print("i");
        Thread.sleep(900);
 System.out.print("s");
        Thread.sleep(900);
 System.out.print(" ");
        Thread.sleep(900);
 System.out.print("*");
        Thread.sleep(900);
 System.out.print("*");
        Thread.sleep(900);
 System.out.print("*");
        Thread.sleep(900);
 System.out.print("*");
        Thread.sleep(900);
System.out.print("*");
        Thread.sleep(900);

       /* System.out.println("*");
        Thread.sleep(1000);
        System.out.println("**");
        Thread.sleep(1000);
        System.out.println("***");
        Thread.sleep(1000);
        System.out.println("****");
        Thread.sleep(1000);
        System.out.println("*****");
        Thread.sleep(1000);*/
        System.out.println("\n******* ********\t \n" + alinanUrunler +
                "\n\t\n***** " + urunKilosu + "Kg\t******\t" + toplamOdeme + "TL"
                + "\n\n**********************\t");

    }


    protected static void secim() throws InterruptedException {

        if (secim.equalsIgnoreCase("Q")) {
            kasa();
        } else if (secim.equalsIgnoreCase("C")) {
            //return icin gerekli method ve ya overrriding ve ya bu if kaldirilir mi
//********rakamma duyarli degil
            System.out.println(urunler);
            urunHesaplama(scan.nextInt(), urunler);
            //..........urunlerde 0 girilmesini engellemek icin ya remove yada baska bir method a bir bak
        }
    }
}
