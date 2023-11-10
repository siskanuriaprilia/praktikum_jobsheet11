import java.util.Scanner;

public class SegitigaBintang27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Input dari pengguna //
        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = scanner.nextInt();

        if (N > 5) 
        {
            for (int i = N; i >= 1; i--) // Outer Loop untuk setiap baris //
            {    
            for (int j = 1; j <= i; j++) // Inner Loop untuk mencetak * sebanyak nilai i (kolom) //
            {
                System.out.print("*");
            }
            System.out.println(); // Membuat enter setelah setiap baris selesai dicetak //
            }
        }
        else
        {
            System.out.println("Nilai N harus minimal 5.");
        }
    }
}
