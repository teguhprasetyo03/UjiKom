package com.ftmp.ujikom.Dao;

import com.ftmp.ujikom.Model.Karyawan;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface KaryawanDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertKaryawan(Karyawan karyawan);

    @Update
    int UpdateKaryawan(Karyawan karyawan);


    @Delete
    int DeleteKaryawan(Karyawan karyawan);

    @Query("SELECT * FROM tb_karyawan")
    Karyawan [] selectAllKaryawans();

    @Query("SELECT * FROM tb_karyawan WHERE karyawanId = :id LIMIT 1")
    Karyawan selectKaryawanDetail(int id);
}


