import java.util.Scanner;
public class Pertanyaan2No5 {
    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);
        int pilihan_menu  ;
        String member ;

        System.out.println("-------------------------");
System.out.println("===== MENU KAFE JTI =====");
System.out.println("-------------------------");
System.out.println("1. Ricebowl");
System.out.println("2. Ice Tea");
System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
System.out.println("-------------------------------------"); 
System.out.print("masukkan angka dari menu yang dipilih = ");
pilihan_menu = Absen.nextInt();
Absen.nextLine();
System.out.print("Apakah punya member (y/n) ? = ");
member = Absen.nextLine();
System.out.print("Apakah membayar dengan QRIS (y/n) ? = ");
String jenisPembayaran = Absen.nextLine();
System.out.println("--------------------------------------");
    
double diskon, total_bayar;
int harga;
if (member.equalsIgnoreCase ("y")) { 
    diskon = 0.10;
    System.out.println("Besar diskon = 10%");
    if (pilihan_menu == 1){
    harga = 14000;
    System.out.println("Harga ricebowl = " + harga);
    } else if (pilihan_menu == 2) {
    harga = 3000;
    System.out.println("Harga ice tea = "+ harga);
    } else if (pilihan_menu == 3) {
    harga = 15000;
    System.out.println("Harga bundling = "+ harga);
    } else {
    System.out.println("Masukkan pilihan menu dengan benar"); 
    return;
    } 
    
    total_bayar = 0 + harga - (harga * diskon); 
    System.out.println("Total bayar setelah diskon = " + total_bayar);
    
    if (jenisPembayaran.equals("y")) {
        total_bayar -= 1000;
        System.out.println("Total bayar setelah potongan = " + total_bayar);

        
    } else if (jenisPembayaran.equals("n")) {
        System.out.println("Total bayar = " + total_bayar);

        
    }
    }
    else if (member.equalsIgnoreCase ("n")) { 
        if (pilihan_menu == 1){
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) { 
            harga = 3000; 
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
        } else {
        System.out.println( "Masukkan pilihan menu dengan benar");
        return; 
        } 
    
        total_bayar = 0 + harga; 
    System.out.println("Total bayar  = " + total_bayar);
    
    if (jenisPembayaran.equals("y")) {
        total_bayar -= 1000;
        System.out.println("Total bayar setelah potongan " + total_bayar);

        
    } else if (jenisPembayaran.equals("n")) {
        System.out.println("Total bayar = " + total_bayar);t

        
    }
        
        } 
        else {
        System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");
    }
    
}