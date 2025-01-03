package konsultasi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class pengguna {
    private int idPengguna;
    private String nama;
    private String email;
    private String kataSandi;

    // Constructor
    public pengguna(int idPengguna, String nama, String email, String kataSandi, String peran) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.email = email;
        this.kataSandi = kataSandi;
    }

    // Getter dan Setter
    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }


    // Metode Login
    public boolean masuk(String email, String kataSandi) {
        // Lakukan validasi dengan database
        return true; // Contoh
    }

    // Metode Daftar
    public void daftar() {
        // Simpan ke database
    }
}
