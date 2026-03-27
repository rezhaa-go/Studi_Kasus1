package Studi_Kasus;
import java.util.*;
public class FilkomTravelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap anda: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nomor HP: ");
        String HP = sc.nextLine();
        System.out.print("Apakah kamu member? (Ya/Tidak): ");
        String jawaban = sc.nextLine();
        boolean member = jawaban.equalsIgnoreCase("Ya");

        Pelanggan pel1 = new Pelanggan(nama, HP, member, jawaban);

        System.out.println("Pilih Kendaraan:");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bis");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();

        Kendaraan k1 = new Kendaraan();

        switch (pilihan){
            case 1:
                k1 = new Motor();
                System.out.println("Motor telah dipilih");
                break;
            case 2:
                k1 = new Mobil();
                System.out.println("Mobil telah dipilih");
                break;
            case 3:
                k1 = new Bis();
                System.out.println("Bis telah dipilih");
            default:
                System.out.println("Pilih antara 1-3");
        }

        System.out.print("Masukkan lama penyewaan (dalam jam): ");
        int lamaSewa = sc.nextInt();
        sc.nextLine();
        System.out.print("Tanggal mulai peminjaman: ");
        String awalPinjam = sc.nextLine();
        System.out.print("Tanggal selesai peminjaman: ");
        String selesaiPinjam = sc.nextLine();
        System.out.print("Masukkan jumlah penumpang: ");
        int Penumpang = sc.nextInt();
        sc.nextLine();

        Pemesanan p1 = new Pemesanan(pel1, k1, lamaSewa, awalPinjam, selesaiPinjam, Penumpang);
        System.out.println();

        System.out.println("======Struk Pemesanan======");
        pel1.display();
        System.out.println("Lama Penyewaan: " + lamaSewa);
        System.out.println("Tanggal Awal Peminjaman: " + awalPinjam);
        System.out.println("Tanggal Selesai Peminjaman: " + selesaiPinjam);
        k1.display();
        p1.display();
    }
}
