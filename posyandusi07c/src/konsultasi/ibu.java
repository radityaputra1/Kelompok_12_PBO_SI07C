package konsultasi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class ibu {
    private int idPengguna;
    private String tahap_kehamilan;
    private String tanggal_hpl;
    private String riwayat_kesehatan;

    // Constructor
    public ibu(int idPengguna, String tahap_kehamilan, String tanggal_hpl, String riwayat_kesehatan) {
        this.idPengguna = idPengguna;
        this.tahap_kehamilan = tahap_kehamilan;
        this.tanggal_hpl = tanggal_hpl;
        this.riwayat_kesehatan = riwayat_kesehatan;
    }

    // Getters and Setters
    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

   

    public void setTahapKehamilan(int tahapKehamilan) {
        this.tahap_kehamilan = tahap_kehamilan;
    }
 
    public String getTanggalHPL() {
        return tanggal_hpl;
    }

    public void setTanggalHPL(String tanggalHPL) {
        this.tanggal_hpl = tanggalHPL;
    }

    public String getRiwayatKesehatan() {
        return riwayat_kesehatan;
    }

    public void setRiwayatKesehatan(String riwayatKesehatan) {
        this.riwayat_kesehatan = riwayatKesehatan;
    }
}