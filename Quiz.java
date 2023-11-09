import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input27 = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input27.nextInt();
                input27.nextLine();

                if (answer < number) {
                    System.out.println("Terlalu kecil!");
                } else if (answer > number) {
                    System.out.println("Terlalu besar!");
                } else {
                    success = true;
                }

            } while (!success);

            System.out.println("Selamat anda berhasil menebak angka!");
            System.out.println("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input27.nextLine().charAt(0);

        } while (menu == 'y' || menu == 'Y');
        {
            System.out.println("Terima kasih telah bermain!");
        }
    }
}