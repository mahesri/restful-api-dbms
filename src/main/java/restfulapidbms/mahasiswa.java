package restfulapidbms;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//it will auto generate our id
@Entity
@Table

public class mahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // define every attribute inside column

    private int id;
    @Column(name = "Nim_Mahasiswa")
    private String nim;
    @Column(name = "Nama_Mahasiswa")
    private String nama;
    @Column(name = "Kelas")
    private String kelas;
    @Column(name = "Jurusan")
    private String jurusan;

    public mahasiswa(String nim, String nama, String kelas, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

}