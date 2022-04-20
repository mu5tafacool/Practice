package _10_List.Manav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavInformation {

    static double toplamOdeme;
    static double urunToplam;
    static String secim;
    static int miktarSecim;
    static String alinanUrunler = "";

    /*** 1. Konteyner aliyoruz odemeler,secimler gibi durumlar icin*/
    static Scanner scan = new Scanner(System.in);
    /*** 2. statik scanner aliyoruz to be like the Moon*/
    static ArrayList<String> urunler = new ArrayList<>(Arrays.asList(
            "Domat  - urun kodu : 1", "Elma   - urun kodu : 2", "Muz    - urun kodu : 3",
            "Biber  - urun kodu : 4", "Patlcan - urun kodu : 5", "Cikmak icin : 0"));
    /*** 3. urunleri ArrayList olarak assign yapiyoruz*/
    static ArrayList<Double> fiyatlar = new ArrayList<>(Arrays.asList(
            5.0, 7.5, 1.3, 8.7, 9.2));
    /*** 4. urunlerin fiyatlarini ArrayList olarak assign yapiyoruz*/
    static ArrayList<Double> miktar = new ArrayList<>(Arrays.asList(
            0.5, 1.0, 1.25, 1.5, 2.0));
    /** 5. alinan urunden kac Kg alinacagini listi icin ArrayList ediyoruz*/

    /**
     * 6. Child classtan parent a gelirmek icin urunHesaplama methodu yaptik
     */
    static void urunHesaplama(int mSecim, ArrayList<String> urunler) throws InterruptedException {

        /** 7. girilen secim rakamlarina gore if kosullari kontrolu
         0.. girildiginde urunToplam eger 0 dan buyukse kasa methoduna gidiyoruz
         0. girildiginde eger birsey alinmadi ise yani urunToplam=0 da tekrar bekleriz yaziyoruz*/
        if (mSecim <= 0 || mSecim > 5) {
            if (mSecim == 0) {
                if (urunToplam > 0) { //eger urun seciminde cikmak istenirse direk kasa methodundan fis yazilir
                    kasa();
                } else {
                    System.out.println("Aaaa bir sey almadan mi gidiyorsun bi siftagimiz olsaydi\nTekrar Bekleriz....");
                }
            } else {
                System.out.print("satin almak icin urun kodunu girin: ");
                urunHesaplama(scan.nextInt(), urunler);
                //urunHesaplama methodundan scan edilen deger urunler ile aliniyor
                //hatali index girdigi olursa tekrar gir der else i var
            }
        } else {
            /** 8. secim istenen aralikta ise miktar gosterip
             mikrara gore switch yapiyoruz*/
            System.out.println("mikrar icin index rakami : " + "\n0.5 kg= [1]" +
                    "\n1.0 kg= [2]\n1.25kg= [3]\n1.5 kg= [4]\n2.0 kg= [5]");
            miktarSecim = scan.nextInt(); //alinan scan, miktar secimine assign = ediliyor
            /** 8.1. mikrarSecimi (<= 0 || > 5) aralinda oldugu surece tekrar isteme yapiliyor*/
            while (miktarSecim <= 0 || miktarSecim > 5) {
                System.out.println("Dogru mikrar index rakami verin ama : " + "\n0.5 kg= [1]" +
                        "\n1.0 kg= [2]\n1.25kg= [3]\n1.5 kg= [4]\n2.0 kg= [5]");
                miktarSecim = scan.nextInt();
            }

            switch (mSecim) {
                /** 9. uruntoplama hesapliyoruz miktar secimi ve fiyat carpimi*/
                case 1: //miktar array inden indexi gettir yani miktar secimin bir eksigi ve
                    // urunun fiyatlarinin degerininle carp ve bunu toplama ekleme
                    urunToplam += miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1);
                    /** 10. alinanurunler konteynirina Kg TL assign ekliyoruz her urun icin*/
                    alinanUrunler += urunler.get(mSecim - 1) + "\t" + miktar.get(miktarSecim - 1) + "Kg " +
                            "\t" + miktar.get(miktarSecim - 1) * fiyatlar.get(mSecim - 1) + "TL" + "\n";
                    //alinanurunlere alinan urunun adini getiriyoruz + alinan KG + miktara gore carpim TL +
                    // miktar arrayninden miktarsecimi indexden bir eksik getiriyor
                    // \n ise bir sonraki urunde alta atlatma icin


                    System.out.println("Alinan Urun\n" + alinanUrunler + "***\n" + "\t\t\t\t\t\tToplam = " + urunToplam + "TL" +
                            "\n\t Kasa mi: [Q]\n\tDevan mi: [C]");
                    /** 11. urun alindiktan sonra Tammi Devammi da
                     *      scan alip secim methoduna gidiyoruz
                     *      orda verilen cevap if sarti ile yonlenditrme yapiyoruz*/
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
        /** 12. secim Quit ise kasa methoduna
         *       secim Continue ise urunleri tekrar gosterip urunHesaplama methoduna geciyoruz
         *       secim farkli bir karakter ise tekrar urunHesaplama methoduna geciyoruz */
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
