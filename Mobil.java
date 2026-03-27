package Studi_Kasus;

public class Mobil extends Kendaraan {
    public Mobil(){
        tipeKendaraan = "Mobil";
        hargaKendaraan = 12500;
        maksKapasitas = 6;
    }

    public void aturanMobil(){
        System.out.println("1. Memiliki SIM");
        System.out.println("2. Menyerahkan KTP");
        System.out.println("3. Menaati Peraturan Lalu Lintas");
        System.out.println("4. Menggunakan Sabuk Pengaman");
        System.out.println("5. Bersedia Mengganti Rugi Kerusakan");
    }

    public void kelengkapanMobil(){
        System.out.println("Kelengkapan Motor:");
        System.out.println("1. Air Minum 300ml (6)");
        System.out.println("2. Payung (6)");
        System.out.println("3. STNK Mobil");
        System.out.println("4. Bensin penuh");
        System.out.println("5. Palu Darurat");
    }

    @Override
    void display(){
        System.out.println("Tipe: " + tipeKendaraan);
        System.out.println("Harga/hari: " + hargaKendaraan);
        System.out.println("Maksimum Kapasitas: " + maksKapasitas);
        System.out.println("Deskripsi: Mobil cocok untuk perjalanan keluarga" );
    }
}
