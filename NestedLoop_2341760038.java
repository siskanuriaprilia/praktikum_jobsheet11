import java.util.Scanner;

public class NestedLoop_2341760038 {

    public static void main(String[] args) {

    Scanner input27 = new Scanner(System.in);
    double[][] temps = new double[5][7];
    for(int i = 0; i < temps.length; i++)
    {
        System.out.println("Kota ke-" + (i+1));
        for(int j = 0; j < temps[0].length; j++)
        {
        System.out.print("Hari ke-" + (j + 1) + ": ");
        temps[i][j] = input27.nextDouble();
        }
    }
    {
    System.out.println();
    }
    for (int i = 0; i < temps.length; i++)
    {
        System.out.println("Kota ke-" + (i + 1) + ": ");
        double sum = 0;
        for (int j = 0; j < temps[0].length; j++) 
        {
            System.out.print(temps[i][1] + " ");
            sum += temps[i][j];
        }
        double average = sum / temps[0].length;
        System.out.println("Rata-rata: " + average); 
    }
  }
}
