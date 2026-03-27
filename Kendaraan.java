package Studi_Kasus;

abstract class Kendaraan {
    protected String tipeKendaraan;
    protected double hargaKendaraan;
    protected int maksKapasitas;

    public double hargaSewa(int lamaPenyewaan){
        return hargaKendaraan * lamaPenyewaan;
    }

    public boolean cekKapasitas(int jumlahPelanggan){
        return maksKapasitas >= jumlahPelanggan;
    }

    abstract void display();
}
