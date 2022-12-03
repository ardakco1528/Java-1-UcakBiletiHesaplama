import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // kullanılacak degiskenleri tanımlıyoruz
        int km, yas, tip;

        // kullanıcıdan veri alıyoruz
        System.out.print(" Ilk Yasınızı Girin: ");
        yas = sc.nextInt();

        System.out.print(" Gideceginiz Yerin Uzaklıgını Girin: ");
        km = sc.nextInt();

        System.out.print(" \nBilet Tipini Secin: (1.Tek Gidis , 2.Gidis/Donus) : ");
        tip = sc.nextInt();


        double normal_fyt,yas_indirimi;
        if (km > 0 && yas > 0 && tip == 1 || tip == 2) {
            normal_fyt = km * 0.10;
            if (yas < 12) { // yas 12 'den kucukse %50 indirim uygulanır
                yas_indirimi = normal_fyt * 0.5; // indirimli fiyatı hesaplıyoruz
            }
            else if (yas >= 12  && yas <= 24){ // yas 12 ile 24 arasında ise (12 ve 24 dahil) %10 indirim uygulanır
                yas_indirimi = normal_fyt * 0.1;
            }
            else if( yas > 65){ // yas 65 ustu ise %30 indirim uygulanır
                yas_indirimi = normal_fyt * 0.3;
            }
            else {
                yas_indirimi = 0 ; // girilen yas sartları saglamıyorsa indirim uygulanmaz
            }
            normal_fyt -= yas_indirimi; // fiyattan indirim payını çıkarıyoruz
            if( tip == 2 ){
                double tipIndırımı = normal_fyt * 0.2;
                normal_fyt = (normal_fyt - tipIndırımı) * 2;
            }
            System.out.print( "Bilet Tutarı : " +normal_fyt + "$");
            }else {
            System.out.print("Girdiginiz degerler eksik veya yanlıs lutfen tekrar deneyin.");
          }
        }
      }
