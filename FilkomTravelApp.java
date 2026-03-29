package Studi_Kasus1;
import java.util.*;

public class FilkomTravelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Pemesanan> logPemesanan = new ArrayList<>();

        boolean operasi = true;
        
        while(operasi){
            System.out.println("=== MENU ===");
            System.out.println("1. Pesan");
            System.out.println("2. Lihat Log");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch(menu){
                case 1: 
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

                    Kendaraan k1 = null;

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
                            break;
                        default:
                            k1 = null;
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
                    System.out.println("===========================");

                    logPemesanan.add(p1);

                    System.out.print("Ingin melakukan pemesanan lagi? (Ya/Tidak): ");
                    String jawabanLagi = sc.next();
                    if(!jawabanLagi.equalsIgnoreCase("Ya")){
                        System.out.println("Anda telah keluar dari program pemesanan");
                    }
                    break;

                case 2:
                    if (logPemesanan.isEmpty()){
                        System.out.println("Maaf, kamu belum melakukan pesanan apapun, segera lakukan pemesanan sekarang!");
                    } else {
                        for (int i = 0; i < logPemesanan.size(); i++){
                            System.out.println("===========================");
                            System.out.println("Pemesanan ke- " + (1+i));
                            logPemesanan.get(i).display();
                            System.out.println("===========================");
                            System.out.println();
                        }
                    }
                    break;
                
                    case 3:
                        System.out.println("Anda telah keluar dari program");
                        operasi = false;
                        break;
            }
        }
    }   
}
