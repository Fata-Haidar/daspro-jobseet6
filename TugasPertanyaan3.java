import java.util.Scanner;
public class TugasPertanyaan3 {
    public static void main(String[] args) {
        Scanner absen9 = new Scanner(System.in);
        String merek, kategori;
        int ukuran;
        
        System.out.print("Masukkan merek sepatu: ");
        merek = absen9.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        kategori = absen9.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = absen9.nextInt();

        int harga = 0;
        if (merek.equalsIgnoreCase("Specs")) {
           
            if (kategori.equalsIgnoreCase("Slip On")){
                if (ukuran == 36 ) harga = 800000;
                if (ukuran == 37 ) harga = 800000;
                if (ukuran == 38 ) harga = 800000;
                if (ukuran == 39 ) harga = 800000;
                if (ukuran == 40 ) harga = 800000;
                if (ukuran == 41 ) harga = 800000;
                if (ukuran == 42 ) harga = 800000;
                if (ukuran == 43 ) harga = 800000;
                if (ukuran == 44 ) harga = 800000;     
            } else if (kategori.equalsIgnoreCase("High Top")){
                if (ukuran == 40 ) harga = 1200000;
                if (ukuran == 41 ) harga = 1200000;
                if (ukuran == 42 ) harga = 1200000;
                if (ukuran == 43 ) harga = 1200000;
                if (ukuran == 44 ) harga = 1200000;
            }         
        } else if (merek.equalsIgnoreCase("910")) {
           
            if (kategori.equalsIgnoreCase("Woman")){
                if (ukuran == 36 ) harga = 1000000;
                if (ukuran == 37 ) harga = 1000000;
                if (ukuran == 38 ) harga = 1000000;
                if (ukuran == 39 ) harga = 1000000;
                if (ukuran == 40 ) harga = 1000000;
                if (ukuran == 41 ) harga = 1000000;    
            } else if (kategori.equalsIgnoreCase("Man")){
                if (ukuran == 41 ) harga = 1800000;
                if (ukuran == 42 ) harga = 1800000;
                if (ukuran == 43 ) harga = 1800000;
                if (ukuran == 44 ) harga = 1800000;
            }
        }else if (merek.equalsIgnoreCase("Ortus")) {
           
            if (kategori.equalsIgnoreCase("Kids")){
                if (ukuran == 36 ) harga = 750000;
                if (ukuran == 37 ) harga = 750000;
                if (ukuran == 38 ) harga = 750000;
                if (ukuran == 39 ) harga = 750000;
                if (ukuran == 40 ) harga = 750000;    
            } else if (kategori.equalsIgnoreCase("Adult")){
                if (ukuran == 40 ) harga = 1500000;
                if (ukuran == 41 ) harga = 1500000;
                if (ukuran == 42 ) harga = 1500000;
                if (ukuran == 43 ) harga = 1500000;
                if (ukuran == 44 ) harga = 1500000;      
            }
        }
       
            System.out.println("Harga sepatu: Rp." +harga);
        


    }
}  