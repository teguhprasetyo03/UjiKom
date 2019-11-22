package com.ftmp.ujikom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class DetailActivityKaryawan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public static Intent getTangkapIntent(Activity activity){

        return new Intent(activity ,DetailActivityKaryawan.class);

    }
}
