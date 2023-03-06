import java.util.Scanner;

public class CinZodyagiHesapla {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        int dogumTarihi;
        String burc = "";

        System.out.print("Doğum tarihinizi giriniz :");
        dogumTarihi = veri.nextInt();

        switch (dogumTarihi % 12) {
            case 0:
                burc = "maymun";
                break;
            case 1:
                burc = "horoz";
                break;
            case 2:
                burc = "köpek";
                break;
            case 3:
                burc = "domuz";
                break;
            case 4:
                burc = "fare";
                break;
            case 5:
                burc = "öküz";
                break;
            case 6:
                burc = "kaplan";
                break;
            case 7:
                burc = "tavşan";
                break;
            case 8:
                burc = "ejderha";
                break;
            case 9:
                burc = "yılan";
                break;
            case 10:
                burc = "at";
                break;
            case 11:
                burc = "koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz :" + burc);
    }
}