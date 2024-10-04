import java.util.Scanner;
/**
 * TugasPertanyaan2
 */
public class TugasPertanyaan2 {
    public static void main(String[] args) {
        Scanner absen9 = new Scanner(System.in);
        String jenisBuku;
        int jumlahaBuku;

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = absen9.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jumlahaBuku = absen9.nextInt();

        double diskon = 0;
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskon = 0.1;
            if (!(jumlahaBuku <= 2)){
            diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 0.07;
            if (!(jumlahaBuku <= 3))
            diskon += 0.02;
            else
            diskon += 0.01;
        } else{
            if (!(jumlahaBuku <= 3))
            diskon = 0.05;
            else
            diskon = 0;
        }
        System.out.println("Jumlah diskon :" + diskon);
    }

    
}