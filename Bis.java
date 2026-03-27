package Studi_Kasus;

public class Bis extends Kendaraan{
    public Bis(){
        tipeKendaraan = "Bis";
        hargaKendaraan = 66500;
        maksKapasitas = 12;
    }

    public void aturanBis(){
        System.out.println("1. Memiliki SIM");
        System.out.println("2. Menyerahkan KTP");
        System.out.println("3. Menaati Peraturan Lalu Lintas");
        System.out.println("4. Menggunakan Sabuk Pengaman");
        System.out.println("5. Bersedia Mengganti Rugi Kerusakan");
    }

    public void kelengkapanBis(){
        System.out.println("Kelengkapan Motor:");
        System.out.println("1. Air Minum Dus (1) & Snack");
        System.out.println("2. Payung (6)");
        System.out.println("3. STNK Bis");
        System.out.println("4. Bensin penuh");
        System.out.println("5. Televisi");
    }

    @Override
    void display(){
        System.out.println("Tipe: " + tipeKendaraan);
        System.out.println("Harga/hari: " + hargaKendaraan);
        System.out.println("Maksimum Kapasitas: " + maksKapasitas);
        System.out.println("Deskripsi: Sleeper Bus cocok untuk perjalanan jauh" );
    }
}

