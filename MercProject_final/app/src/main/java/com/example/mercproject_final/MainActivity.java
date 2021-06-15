package com.example.mercproject_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }


    //設置首頁的四個按鈕分別到不同的畫面
    public void launch_char_letter(View view) {
        Intent i =new Intent(this,Char_Main.class);
        startActivity ( i );
    }

    public void launch_country(View view) {
        Intent i =new Intent(this,Country_Main.class);
        startActivity ( i );
    }

    public void launch_seed(View view) {
        Intent i =new Intent(this,Seed_Main.class);
        startActivity ( i );
    }


    public void launch_calendar(View view) {
        Intent i =new Intent(this,Calendar_Main.class);
        startActivity ( i );
    }
}