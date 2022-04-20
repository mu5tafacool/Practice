package _10_List.Manav;

import java.util.InputMismatchException;

public class QMANAVQ extends Mgilgi {


    public static void main(String[] args) throws InterruptedException {
        //throws InterruptedException Class i bekleme methodu calismasi icin

        System.out.println(urunler);
        System.out.print("lutfen urun secin: ");

        int mSecim = scan.nextInt();
        urunHesaplama(mSecim, urunler);

//tek problem harf girildiginde
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
