package Studi_Kasus;

public class Pelanggan {
    private String nama;
    private String noHP;
    private boolean member;

    public Pelanggan(String nama, String noHP, boolean member, String jawaban){
        this.nama = nama;
        this.noHP = noHP;
        this.member = jawaban.equalsIgnoreCase("Ya");
    }

    public boolean isMember(){
        return member;
    }
    public void upMember(String jawabanUp){
        if (!member){
            if (jawabanUp.equalsIgnoreCase("Ya")){
                member = true;
                System.out.println("Status: Sekarang sudah menjadi member");
            } else {
                System.out.println("Status: Bukan Member");
            }
        }
    }

    public double diskon(double totalHarga){
        if(member){
            return (totalHarga * 0.01);
        } else {
        return 0;
        }
    }


    public void display(){
        System.out.println("Nama                : " + nama);
        System.out.println("Nomor HP            : " + noHP);
        System.out.println("Member              : " + (member ? "Ya" : "Bukan"));
    }
}
