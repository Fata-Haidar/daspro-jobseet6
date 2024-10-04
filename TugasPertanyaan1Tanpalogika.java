import java.util.Scanner;
/**
 * TugasPertanyaan1Tanpalogika
 */
public class TugasPertanyaan1Tanpalogika {
    public static void main(String[] args) {
        Scanner absen9 = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.print("Masukkan bilangangan 1:");
        bil1 = absen9.nextInt();
        System.out.print("Masukkan bilangangan 2:");
        bil2 = absen9.nextInt();
        System.out.print("Masukkan bilangangan 3:");
        bil3 = absen9.nextInt();

        if (bil1 >= bil2) {
            if (bil1 >= bil3) 
            System.out.println("Bilangan terbesar: " +bil1);
            else 
            System.out.println("Bilangan terbesar: " +bil3);
        } else if (bil2 >= bil1 ) {
            if (bil2 >= bil3)
            System.out.println("Bilangan terbesar: " +bil2);
            else 
            System.out.println("Bilangan terbesar: " +bil3);
        }  else {
            System.out.println("Bilangan terbesar: " +bil3);
        }
    }
    
}