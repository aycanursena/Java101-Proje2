import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner sicaklik = new Scanner(System.in);

        double sicaklik_degeri;
        System.out.print("Sıcaklık değeri :");
        sicaklik_degeri = sicaklik.nextDouble();
        if (sicaklik_degeri < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sicaklik_degeri < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if(sicaklik_degeri < 25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else
            System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
