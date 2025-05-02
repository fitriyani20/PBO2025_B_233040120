package Pertemuan_9;

public class InheritanceMain {

    public static void main(String[] args) {

        Manajer manajer = new Manajer("Andi", 2000000, "Operasional");
        Teknisi teknisi = new Teknisi("Budi", 3000000, 40, "Bandung");

        System.out.println("=== Data Manajer ===");
        System.out.println("Nama       : " + manajer.getNama());
        System.out.println("Gaji       : Rp" + manajer.getGaji());
        System.out.println("Departemen : " + manajer.getDepartemen());

        System.out.println("\n====================================\n");

        System.out.println("=== Data Teknisi ===");
        System.out.println("Nama      : " + teknisi.getNama());
        System.out.println("Gaji      : Rp" + teknisi.getGaji());
        System.out.println("Jam Kerja : " + teknisi.getJamKerja() + " Jam/Minggu");
        System.out.println("Alamat    : " + teknisi.getAlamat());
    }
}
