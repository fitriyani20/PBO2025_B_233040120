package Pertemuan_9;

public class Manajer extends pegawai {
    private String departemen;

    public Manajer(String nama, double gaji, String departemen) {
        setNama(nama);
        setGaji(gaji);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
}
