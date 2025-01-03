package konsultasi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
// Class Konsultasi
public class konsultasi {
    private int idKonsultasi;
    private int idPengguna;
    private String namaDokter;
    private String tanggal;
    

    // Constructor
    public konsultasi(int idKonsultasi, int idPengguna, String namaDokter, String tanggal) {
        this.idKonsultasi = idKonsultasi;
        this.idPengguna = idPengguna;
        this.namaDokter = namaDokter;
        this.tanggal = tanggal;
       
    }

    // Getters and Setters
    public int getIdKonsultasi() {
        return idKonsultasi;
    }

    public void setIdKonsultasi(int idKonsultasi) {
        this.idKonsultasi = idKonsultasi;
    }

    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    
}