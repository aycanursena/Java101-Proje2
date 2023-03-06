import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
    Scanner girilenDeger = new Scanner(System.in);
    int ay, gun;
    String burc = "";

    System.out.print("Doğduğunuz ayı giriniz : ");
    ay = girilenDeger.nextInt();
    System.out.print("Doğduğunuz günü giriniz : ");
    gun = girilenDeger.nextInt();

    if (ay == 1) {
        if (gun >= 1 && gun <= 31) {
            if (gun <= 21) {
                burc = "Oğlak";
            } else
                burc = "Kova";
        }
    } else if (ay == 2) {
        if (gun >= 1 && gun <= 28) {
            if (gun <= 19) {
                burc = "Kova";
            } else
                burc = "Balık";
        }
    } else if (ay == 3){
        if (gun >= 1 && gun <= 31){
            if (gun <= 20){
                burc = "Balık";
            }else
                burc = "Koç";
        }
    } else if (ay == 4){
        if (gun >= 1 && gun <= 30){
            if (gun <= 20){
                burc = "Koç";
            }else
                burc = "Boğa";
        }
    } else if (ay == 5){
        if (gun >= 1 && gun <= 31){
            if (gun <= 21){
                burc = "Boğa";
            }else
                burc = "İkziler";
        }
    }else if (ay == 6){
        if (gun >= 1 && gun <= 30){
            if (gun < 22){
                burc = "İkizler";
            }else
                burc = "Yengeç";
        }
    }else if (ay == 7){
        if (gun >= 1 && gun <= 31){
            if (gun <= 22){
                burc = "Yengeç";
            }else
                burc = "Aslan";
        }
    }else if (ay == 8){
        if (gun >= 1 && gun <= 30){
            if (gun <= 22){
                burc = "Aslan";
            }else
                burc = "Başak";
        }
    }else if (ay == 9){
        if (gun >= 1 && gun <= 31){
            if (gun <= 22){
                burc = "Başak";
            }else
                burc = "Terazi";
        }
    }else if (ay == 10){
        if (gun >= 1 && gun <= 30){
            if (gun <= 22){
                burc = "Terazi";
            }else
                burc = "Akrep";
        }
    }else if (ay == 11){
        if (gun >= 1 && gun <= 31){
            if (gun <= 21){
                burc = "Akrep";
            }else
                burc = "Yay";
        }
    }else if (ay == 12){
        if (gun >= 1 && gun <= 31){
            if (gun <= 21){
                burc = "Yay";
            }else
                burc = "Oğlak";
        }
    }else {
        System.out.println("Yanlış değer girdiniz.!");
    }
    System.out.println("Burcunuz : " + burc);
}
}
