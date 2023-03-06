import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, enkucuk, enbuyuk, ortanca;

        System.out.print("Üç sayı giriniz.");
        System.out.print("1. sayı :");
        a = input.nextInt();
        System.out.print("2. sayı :");
        b = input.nextInt();
        System.out.print("3. sayı :");
        c = input.nextInt();

        if (a > b && a > c){
            if (b > c){
                System.out.println("Sıralama :" + a + ">" + b + ">" + c);
            }else
                System.out.println("Sıralama :" + a + ">" + c + ">" + b);
        }else if (b > c && b > a){
            if (c > a){
                System.out.println("Sıralama :" + b + ">" + c + ">" + a);
            }else
                System.out.println("Sıralama :" + b + ">" + a + ">" + c);
        }else if (c > a && c > b){
            if (a > b){
                System.out.println("Sıralam :" + c + ">" + a + ">" + b);
            }else
                System.out.println("Sıralam :" + c + ">" + b + ">" + a);
        }
    }
}
