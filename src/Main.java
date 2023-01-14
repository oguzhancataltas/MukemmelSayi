import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int perfect, total = 0;

        System.out.print("Bir sayı giriniz : ");
        perfect = inp.nextInt();

        for(int i = 1; i < perfect; i++) {
            if (perfect % i == 0) {
                total += i;
            }
        }

        if (total == perfect) {
            System.out.println(perfect + " sayısı bir mükemmel sayıdır.");
        }else {
            System.out.println(perfect + " sayısı bir mükemmel sayı değildir !!!");
        }
    }
}
