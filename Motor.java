package Studi_Kasus;

public class Motor extends Kendaraan {
    public Motor(){
        tipeKendaraan = "Motor";
        hargaKendaraan = 3000;
        maksKapasitas = 2; 
    }

    public void aturanMotor(){
        System.out.println("1. Gunakan Helm");
        System.out.println("2. Memiliki SIM");
        System.out.println("3. Menyerahkan KTP");
        System.out.println("4. Menaati Peraturan Lalu Lintas");
        System.out.println("5. Bersedia mengganti rugi kerusakan");
    }

    public void kelengkapanMotor(){
        System.out.println("Kelengkapan Motor:");
        System.out.println("1. Helm (2)");
        System.out.println("2. Jas Hujan (2)");
        System.out.println("3. STNK motor");
        System.out.println("4. Bensin penuh");
        System.out.println("5. Riding Gloves");
    }
}
