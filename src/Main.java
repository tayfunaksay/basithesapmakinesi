import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2,a;
        double  sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        n1= inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2= inp.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz... \nToplama:1 \nÇıkarma:2 \nÇarpma:3 \nBölme:4 ");
        a = inp.nextInt();
        switch (a){
            case 1:
                sonuc= n1+n2;
                System.out.println("Sonuç: "+sonuc);
                break;
            case 2:
                sonuc= n1-n2;
                System.out.println("Sonuç: "+sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.println("Sonuç: "+sonuc);
                break;
            case 4:
                sonuc= n1/n2;
                System.out.println("Sonuç: "+sonuc);
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız!...");
        }

    }
}
