import java.util.Scanner;

public class SegitigaAngka27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dari pengguna //
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N > 3) 
        {
            for (int i = 1; i <= N; i++) // Outer Loop untuk setiap baris //
            {
                for (int j = 1; j <= N - i; j++) 
                {
                   System.out.print(" "); // Membuat spasi sebanyak (N - i) // Inner Loop1 //
                }
                for (int k = 1; k <= i; k++) 
                {
                    System.out.print(k); // Cetak angka dari 1; hingga i; // Inner Loop2 //
                }
                System.out.println(); // Membuat enter setelah setiap baris selesai dicetak //
            }
        }
        else 
        {
            System.out.println("Nilai N harus minimal 3.");
        }
    }
}