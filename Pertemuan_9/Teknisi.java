package Pertemuan_9;

public class Teknisi extends pegawai {
    private int jamKerja;
    private String alamat;

    public Teknisi(String nama, double gaji, int jamKerja, String alamat) {
        setNama(nama);
        setGaji(gaji);
        this.jamKerja = jamKerja;
        this.alamat = alamat;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public String getAlamat() {
        return alamat;
    }
}
