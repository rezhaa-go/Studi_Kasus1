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
        pelanggan.display();
        kendaraan.display();
        System.out.println("Lama Penyewaan (jam): " + lamaPenyewaan);
        System.out.println("Diskon Member: " + hargaDiskon);
        System.out.println("Total Harga: " + (totalHarga - hargaDiskon));
        allert();
    }
}
