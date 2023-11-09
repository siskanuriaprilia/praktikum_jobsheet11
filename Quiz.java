import java.util.Scanner;
import java.util.Random;

public class Quiz {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input27 = new Scanner(System.in);

        char menu='y';
        do 
        {
            int number = random.nextInt(10) + 1;
            boolean succes = false;
            do
            {
                System.out.print("Tebak angka (1-10): ");
                int answer = input27.nextInt();
                input27.nextLine();
                succes = (answer == number);
            }
            while(!succes);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
            menu = input27.nextLine(). charAt(0);
        }
            while(menu =='y' || menu=='Y');   
    }
}
