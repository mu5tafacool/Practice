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
            "Domat  - urun kodu : 1", "Elma   - urun kodu : 2", "Muz    - urun kodu : 3",
            "Biber  - urun kodu : 4", "Patlcan - urun kodu : 5", "Cikmak icin : 0"));
    static ArrayList<Double> fiyatlar = new ArrayList<>(Arrays.asList(
            5.0, 7.5, 1.3, 8.7, 9.2));
    static ArrayList<Double> miktar = new ArrayList<>(Arrays.asList(
            0.5, 1.0, 1.25, 1.5, 2.0));
    // static <urunler, fiyatlar> void urunHesaplama(urunler, fiyatlar)

    static ArrayList<Double> kiloMiktar = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0));
    //index e gore kilo eklemesi yapilacak orn elma ilk index

    static void urunHesaplama(int mSecim, ArrayList<String> urunler) throws InterruptedException {


        //0........................... girildiginde miktar soruyor
        if (mSecim <= 0 || mSecim > 5) {
            if (mSecim == 0) {
                if (urunToplam > 0) { //eger urun seciminde cikmak istenirse direk kasa methodundan fis yazilir
                    kasa();
                } else {
                    System.out.println("Aaaa bir sey almadan mi gidiyorsun bi siftagimiz olsaydi");
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

                    alinanUrunler += urunler.get(mSecim - 1) + "\t" + miktar.get(miktarSecim - 1) + "Kg " +
                            "\t" + miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1) + "TL" + "\n";
                    //alinan urune urunler den n oldugunu +
                    // miktar arrayninden miktarsecimi indexden bir eksik getiriyor ve
                    // \n ise bir sonraki urune alta atlatiyor


                    System.out.println("Alinan Urun\n" + alinanUrunler + "***\n" + "\t\t\t\t\t\tToplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");

                    secim = scan.next(); //devammi dan alinan scan secim e assign ediliyor secim metdouna gidiliyor
                    secim();
                    break;

                case 2:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);

                    alinanUrunler += urunler.get(mSecim - 1) + "\t" + miktar.get(miktarSecim - 1) + "Kg " +
                            "\t" + miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1) + "TL" + "\n";
                    //alinan urune urunler den n oldugunu +
                    // miktar arrayninden miktarsecimi indexden bir eksik getiriyor ve
                    // \n ise bir sonraki urune alta atlatiyor

                    System.out.println("Alinan Urun\n" + alinanUrunler + "***\n" + "\t\t\t\t\t\tToplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");

                    secim = scan.next(); //devammi dan alinan scan secim e esign ediliyor
                    secim();
                    break;

                case 3:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);

                    alinanUrunler += urunler.get(mSecim - 1) + "\t" + miktar.get(miktarSecim - 1) + "Kg " +
                            "\t" + miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1) + "TL" + "\n";

                    System.out.println("Alinan Urun\n" + alinanUrunler + "***\n" + "\t\t\t\t\t\tToplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");

                    secim = scan.next(); //devammi dan alinan scan secim e esign ediliyor
                    secim();
                    break;

                case 4:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    alinanUrunler += urunler.get(mSecim - 1) + "\t" + miktar.get(miktarSecim - 1) + "Kg " +
                            "\t" + miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1) + "TL" + "\n";
                    System.out.println("Alinan Urun\n" + alinanUrunler + "***\n" + "\t\t\t\t\t\tToplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");
                    secim = scan.next(); //devammi dan alinan scan secim e esign ediliyor
                    secim();
                    break;

                case 5:
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    alinanUrunler += urunler.get(mSecim - 1) + "\t" + miktar.get(miktarSecim - 1) + "Kg " +
                            "\t" + miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1) + "TL" + "\n";
                    System.out.println("Alinan Urun\n" + alinanUrunler + "***\n" + "\t\t\t\t\t\tToplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");
                    secim = scan.next(); //devammi dan alinan scan secim e esign ediliyor
                    secim();
                    break;

                case 0:
                    kasa();
                    break;
            }

        }


    }

    protected static void kasa() throws InterruptedException {
        System.out.println("Fisiniz yaziliyor...");
        toplamOdeme += urunToplam; //urunlerin hepsinden alinan konteyner urunToplam toplam odemeye esitleniyor
        System.out.print("*");
        Thread.sleep(600);
        System.out.print(" * * * *");
        Thread.sleep(600);
        System.out.print(" * * * *");
        Thread.sleep(600);
        System.out.print(" * * * *");
        Thread.sleep(600);
        System.out.print(" * * * *\n");
        Thread.sleep(600);
        System.out.print("****************");
        Thread.sleep(600);
        System.out.print(" F");
        Thread.sleep(600);
        System.out.print("i");
        Thread.sleep(600);
        System.out.print("s");
        Thread.sleep(600);
        System.out.print(" ");
        Thread.sleep(600);
        System.out.print("*");
        Thread.sleep(600);
        System.out.print("**");
        Thread.sleep(600);
        System.out.print("***");
        Thread.sleep(600);
        System.out.print("****");
        Thread.sleep(600);
        System.out.print("****");
        Thread.sleep(600);
        System.out.print("*****");
        Thread.sleep(600);


        System.out.println("\n--------------------------------------\t \n" + alinanUrunler
                + "\n\n--------------------------------------\t" +
                "\nToplam" + "\t\t\t\t\t\t\t" + toplamOdeme + "TL"
                + "\n--------------------------------------\t");


    }


    protected static void secim() throws InterruptedException {

        if (secim.equalsIgnoreCase("Q")) {
            kasa();
        } else if (secim.equalsIgnoreCase("C")) {
            System.out.println(urunler);
            urunHesaplama(scan.nextInt(), urunler);
            //print edilen urunler scan ediliyor urunler indeksine gore
            // YANI urunlerHesaplama methoduna getiren, child class tan gelecek sekilde scan yapiliyor
        } else {
            //rakam ve farkli harf icin
            System.out.println("Secime yonlendiriliyorsun...");
            System.out.println(urunler);
            urunHesaplama(scan.nextInt(), urunler);

        }
    }
}
