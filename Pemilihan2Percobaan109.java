/**
 * Pemilihan2Percobaan109
 */
import java.util.Scanner;

public class Pemilihan2Percobaan109 {

    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = Absen.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat"); 
            else
            System.out.println("Bukan Tahun Kabisat"); 
        } else
        System.out.println("Bukan Tahun Kabisat");

        
    }
}