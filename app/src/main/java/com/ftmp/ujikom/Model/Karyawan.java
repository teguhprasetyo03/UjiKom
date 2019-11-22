package com.ftmp.ujikom.Model;

import java.io.Serializable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tb_karyawan") // membuat table karyawan
public class Karyawan implements Serializable {

    // Kolom npm karyawan sebagai primary key
    @PrimaryKey(autoGenerate = true)
    private int karyawanId;

    // membuat kolom nama karyawan
    @ColumnInfo(name = "nama_karyawan")
    private String nama;

    // membuat kolom jabatan karyawan
    @ColumnInfo(name = "jabatan_karyawan")
    private String jabatan;

    // membuat kolom jenis kelamin karyawan
    @ColumnInfo(name = "jenis_kelamin")
    private String kelamin;

    // membuat kolom gaji karyawan
    @ColumnInfo int gaji;


    public int getKaryawanId() {
        return karyawanId;
    }

    public void setKaryawanId(int karyawanId) {
        this.karyawanId = karyawanId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int divisi) {
        this.gaji = divisi;
    }


}
