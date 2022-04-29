package src.Proje.Manav;

import java.util.InputMismatchException;

public class QuestManav extends ManavInformation {


    public static void main(String[] args) throws InterruptedException {
        //throws InterruptedException Class parent class da bekleme methodu calismasi icin

        System.out.println(urunler);
        System.out.print("Alicaginiz urun : ");

        //  int mSecim = scan.nextInt();
        //  urunHesaplama(mSecim, urunler);


        while (true) { //try catch de devam eden dongu harf veya sayiya duyarli
            try { //harf girildiginde hata vermeden devam eden while dongusu
                int mSecim = scan.nextInt();
                urunHesaplama(mSecim, urunler);
            } catch (InputMismatchException e) {
                String str = scan.next(); //bunu devamli yazmasini engellemek icin koyuyoruz
                System.out.println("sayi girmen lazim... \n" + urunler);
            }
        }


        /***** Alternatif
         int mSecim = 0;
         try {
         mSecim = scan.nextInt();
         }  catch (InputMismatchException e) {

         }
         urunHesaplama(mSecim, urunler);
         ******/
    }

}
