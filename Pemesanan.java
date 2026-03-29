package Studi_Kasus;

public class Pemesanan {
    Pelanggan pelanggan;
    Kendaraan kendaraan;
    private int lamaPenyewaan;
    private String tanggalMulai;
    private String tanggalSelesai;
    private int jumlahPenumpang;
    private double totalHarga;
    private double hargaDiskon;

    public Pemesanan(Pelanggan pelanggan, Kendaraan kendaraan, int lamaPenyewaan, String tanggalMulai, String tanggalSelesai, int jumlahPenumpang){
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.lamaPenyewaan = lamaPenyewaan;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.jumlahPenumpang = jumlahPenumpang;
        hitungDiskon();
    }

    public int getLamaPenyewaan(){
        return lamaPenyewaan;
    }

    public String getTanggalMulai(){
        return tanggalMulai;
    }

    public String getTanggalSelesai(){
        return tanggalSelesai;
    }

    public void hitungDiskon(){
        totalHarga = kendaraan.hargaSewa(lamaPenyewaan);
        this.hargaDiskon = pelanggan.diskon(totalHarga);
    }

    public void allert(){
        if (jumlahPenumpang > kendaraan.maksKapasitas){
            System.out.println("Anda telah melewati batas maksimum! Tolong perhatikan batas maksimum penumpang!");
        }
    }

    public void display(){
        System.out.println("Nomor Pesanan       : " + noPesanan);
        pelanggan.display();
        System.out.println("==============================");
        kendaraan.display();
        System.out.println("==============================");
        System.out.println("Lama Penyewaan (jam): " + lamaPenyewaan);
        System.out.println("Diskon Member       : " + hargaDiskon);
        System.out.println("Biaya Pengiriman    : " + ongkosKirim);
        System.out.println("Total Harga         : " + (totalHarga - hargaDiskon + ongkosKirim));
        System.out.println("Tanggal Pemesanan   : " + tanggalPesanan);
        System.out.println("Lama Penyewaan      : " + lamaPenyewaan + " jam");
        System.out.println("Mulai Peminjaman    : " + tanggalMulai);
        System.out.println("Selesai Peminjaman  : " + tanggalSelesai);
        allert();
        System.out.println("==============================");
    }
    }
}
