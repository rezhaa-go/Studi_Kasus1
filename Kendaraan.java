package Studi_Kasus;

public class Kendaraan {
    protected String tipeKendaraan;
    protected double hargaKendaraan;
    protected int maksKapasitas;

    public double hargaSewa(int lamaPenyewaan){
        return hargaKendaraan * lamaPenyewaan;
    }

    public boolean cekKapasitas(int jumlahPelanggan){
        return maksKapasitas >= jumlahPelanggan;
    }

    public void display(){
        System.out.println("Tipe: " + tipeKendaraan);
        System.out.println("Harga/hari: " + hargaKendaraan);
        System.out.println("Maksimum Kapasitas: " + maksKapasitas);
    }
}
