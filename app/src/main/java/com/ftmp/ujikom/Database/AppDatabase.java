package com.ftmp.ujikom.Database;

/*
* Membuat class Database
* Entity yang digunakan adalah Karyawan.java
* Version 1 adalah default ketika membuat sebuah room database
* */

import com.ftmp.ujikom.Dao.KaryawanDao;
import com.ftmp.ujikom.Model.Karyawan;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Karyawan.class} , version = 1)
public abstract class AppDatabase extends RoomDatabase {

    // Untuk mengakses database gunakan abstract method

    public abstract KaryawanDao karyawanDao();
}
