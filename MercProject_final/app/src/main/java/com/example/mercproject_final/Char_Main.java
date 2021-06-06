package com.example.mercproject_final;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mercproject_final.Char_Adapter.OnItemClickListener;

public class Char_Main extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Char_Adapter mAdapter;

    String s1[];
    TextView s2;

    int image[]={R.drawable.za_morusya,R.drawable.zb_rey,R.drawable.zc_aura,R.drawable.zd_koneria,
            R.drawable.ze_viruberu,R.drawable.zf_arusian,R.drawable.zg_fara,R.drawable.zh_kaiza,
            R.drawable.zi_misutika,R.drawable.zj_mokuren,
            R.drawable.za_morusya_press,R.drawable.zb_rey_press,R.drawable.zc_aura_press,R.drawable.zd_koneria_press,
            R.drawable.ze_viruberu_press,R.drawable.zf_arusian_press,R.drawable.zg_fara_press,R.drawable.zh_kaiza_press,
            R.drawable.zi_misutika_press,R.drawable.zj_mokuren_press
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.char_main );


        this.recyclerView = findViewById ( R.id.recyclerView );

        s1 = getResources ( ).getStringArray ( R.array.fivestar_title );
        s2 = findViewById ( R.id.char_five_checked );

        Char_Adapter myAdapter = new Char_Adapter ( this , s1 , s2 , image );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this ) );
        recyclerView.setAdapter ( myAdapter );
    }


}



